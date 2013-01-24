package org.yhb.dao.business;

import java.util.Iterator;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.transaction.annotation.Transactional;
import org.yhb.dao.service.ICourseTableDAOService;
import org.yhb.dao.service.IUserTableDAOService;
import org.yhb.vo.CourseTable;
import org.yhb.vo.UserTable;

@Transactional
public class SelectionBusiness {
	@Transactional
	public synchronized JSONObject doSelect(UserTable user,UserTable teacher,int id,CourseTable course,
			IUserTableDAOService userDao,ICourseTableDAOService courseDao) throws Exception{
			JSONObject json=new JSONObject();
			
			CourseTable courseTemp =courseDao.doGetACourseById(course.getCourse_Id());
			if (courseTemp.getIsSelected() != 0) {
				try {
					json.put("statu", 3);
					json.put("msg", "该课题已经被选，请选择其它课题");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return json;
			}
		
			// 再判断该学生是否已经选题
			UserTable studentTemp=userDao.getUserById(user.getUserId());
			if (studentTemp.getStuCourseId() != 0) {
				try {
					json.put("statu", 4);
					json.put("msg", "对不起，您只能选则一个选题.");
				} catch (JSONException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return json;
			} 
			// 再判断当前课题的所属教师带生人数是否已经达到最大带生人数
			UserTable teacherTemp = userDao.getUserById(course.getTeacher());
			if (teacherTemp== null) {
				try {
					json.put("statu", 5);
					json.put("msg", "当前选题没有带生老师，请选择其它选题");
				} catch (JSONException e) {
					e.printStackTrace();
				}
				return json;
			}
			if (teacherTemp.getTeaCurrentStu() >= teacherTemp.getTeaMaxStu()) {
				try {
					json.put("statu", 9);
					json.put("msg", "对不起，该课题所属老师带生人数已经达到上限。请刷新选题列表！！");
				} catch (JSONException e) {
					e.printStackTrace();
				}
				return json;
			}
			// 教师带生人数没有达到上限，课题没有被选择，学生也没有选到课题
			// 刷新学生信息
			// id 是学生点击的课题的ID
			user.setStuTeacherId(course.getTeacher());
			user.setStuCourseId(id);
			// 刷新课题信息
			course.setIsSelected(1);
			course.setStudent(user.getUserId());
			// 刷新该课题对应的教师当前带生人数
			teacher.setTeaCurrentStu(teacher.getTeaCurrentStu()+1);
			
			//更新数据库
			Thread.sleep(2000);
			userDao.doUpdate(user);
			userDao.doUpdate(teacher);
			courseDao.doUpdate(course);
			
			
			//检查数据是否正确，不正确就回滚
			teacherTemp = userDao.getUserById(course.getTeacher());
			int currentStudents =userDao.getStudentsCountByTeacherId(teacherTemp.getUserId());
			List<CourseTable> courses=courseDao.doQueryOneTeacher(1,100, teacherTemp.getUserId());
			Iterator<CourseTable>  ite=courses.iterator();
			while(ite.hasNext()){
				CourseTable temp=ite.next();
				if(temp.getIsSelected()==0 && temp.getStudent()==0){
					ite.remove();
				}
			}
			if((teacherTemp.getTeaCurrentStu() != currentStudents )||
					(teacherTemp.getTeaCurrentStu() !=courses.size())){
				if(courses.size()==currentStudents){
					teacherTemp.setTeaCurrentStu(currentStudents);
					userDao.doUpdate(teacherTemp);
				}
				json.put("statu", 9);
				json.put("msg", "对不起，有人跟亲你抢选题了，但是你输了，请选择其他题目！");
				System.err.println("######################################################");
				System.err.println("对不起，有人跟亲你抢选题了，但是你输了，请选择其他题目！###");
				System.err.println("######################################################");
				throw new Exception("数据错误");
			}else{
				json.put("statu", 10);
				json.put("msg", "选题成功");
			}
			return json;
	}
	@Transactional
	public synchronized void doDeselect(UserTable user,int id,CourseTable course,
			IUserTableDAOService userDao,ICourseTableDAOService courseDao){
			user.setStuCourseId(0);
			user.setStuTeacherId(0);
			//更新课题信息
			course.setStudent(0);
			course.setIsSelected(0);
			//更新该课题对应教师信息
			UserTable teacher = userDao.getUserById(course.getTeacher());
			if(teacher!=null){
				
				//更新数据库信息
				courseDao.doUpdate(course);
				userDao.doUpdate(user);
				
				// 刷新该课题对应的教师当前带生人数
				teacher.setTeaCurrentStu(teacher.getTeaCurrentStu()-1);
				userDao.doUpdate(teacher);
				
				
				//检查数据是否正确，不正确就回滚
				UserTable teacherTemp = userDao.getUserById(course.getTeacher());
				int currentStudents =userDao.getStudentsCountByTeacherId(teacherTemp.getUserId());
				List<CourseTable> courses=courseDao.doQueryOneTeacher(1,100, teacherTemp.getUserId());
				Iterator<CourseTable>  ite=courses.iterator();
				while(ite.hasNext()){
					CourseTable temp=ite.next();
					if(temp.getIsSelected()==0 && temp.getStudent()==0){
						ite.remove();
					}
				}
				if((teacherTemp.getTeaCurrentStu() != currentStudents )||
						(teacherTemp.getTeaCurrentStu() !=courses.size())){
					if(courses.size()==currentStudents){
						teacherTemp.setTeaCurrentStu(currentStudents);
						userDao.doUpdate(teacherTemp);
					}
				}
			}
	}
}
