package org.yhb.test;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhb.dao.service.ICourseTableDAOService;
import org.yhb.dao.service.IUserTableDAOService;
import org.yhb.vo.CourseTable;
import org.yhb.vo.StudentDetail;
import org.yhb.vo.UserTable;

public class TeacherTest {
	private BeanFactory beanFactory = null;
	private IUserTableDAOService userDao = null;
	private ICourseTableDAOService courseDao=null;
	
	@Before
	public void setUp() throws Exception {
		//绝对路径
		//beanFactory=new ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml" );
		//相对路径
		beanFactory = new ClassPathXmlApplicationContext(
				"org/yhb/config/ApplicationContext.xml");
		userDao =(IUserTableDAOService) beanFactory.getBean("IUserTableDAOService");
		courseDao=(ICourseTableDAOService)beanFactory.getBean("ICourseTableDAOService");
	}

	@After
	public void tearDown() throws Exception {
		userDao=null;
		courseDao=null;
		beanFactory = null;
	}

	@Test
	public void isSelectionStatus(){
		List<UserTable> teachers=userDao.getAllTeachers(); 
		if(teachers==null && teachers.size()==0){
			return;
		}
		System.out.println("一共有多少个老师  "+ teachers.size() +"......");
		
		for(UserTable user:teachers){
			//循环检查教师信息
			int currentStudent=user.getTeaCurrentStu();
			//得到当前选了该老师课题的学生
			List<StudentDetail> teaStudents=userDao.getStudentDetailByTeacherId(1, 100, user.getUserId());
			if(teaStudents!=null&& teaStudents.size()>currentStudent ){
				System.out.println("老师应该带 "+user.getTeaMaxStu()+"个学生，"
						+"当前已带 "+currentStudent +" 个学生，"+"选了该老师课题的学生  "+teaStudents.size()+"个。");
				System.err.println("当前老师的数据异常！！！！！！！！！！！！"+user.getUserId());
			}
			List<CourseTable> courses=courseDao.doQueryOneTeacher(1,100, user.getUserId());
			
			for(CourseTable course:courses){
				//取出这个课题，得带选了该题的学生，然后再查看该学生是否是选了这个课题
				if(course.getIsSelected()==1){
					int studentId=course.getStudent();
					UserTable student=userDao.getUserById(studentId);
				
					if(student.getStuCourseId()!=course.getCourse_Id()){
						System.out.println("这个学生选的是 "+student.getStuCourseId()+
								"，但是在课题表，这个课题"+course.getCourse_Id()+"是被学生"+studentId+"选了。" );
					}
				}
			}
		}
		System.out.println("运行结束");
	}
	@Test
	public void currentStuentsAndStudentNotSelect(){
		List<UserTable> teachers=userDao.getAllTeachers(); 
		if(teachers==null && teachers.size()==0){
			return;
		}
		System.out.println("一共有多少个老师  "+ teachers.size() +"......");
		
		int totalStudentByTeacher=0;
		int currentStudentByTeacher=0;
		
		for(UserTable user:teachers){
			//循环检查教师信息
			currentStudentByTeacher += user.getTeaCurrentStu();
			totalStudentByTeacher += user.getTeaMaxStu();
		}
		System.out.println("今年一共老师带的总人数为" +totalStudentByTeacher);
		System.out.println("所有老师的当前带生总人数为" +currentStudentByTeacher);
		
		int studentCount=userDao.getStudentsCount();
		System.out.println("今年一共有"+studentCount+"个学生参加选题");
		
		List<StudentDetail>  students=userDao.getStudentsWithClass();
		int selectedStudentCount=0;
		int notSelectedStudentCount=0;
		Iterator<StudentDetail> ite=students.iterator();
		while(ite.hasNext()){
			StudentDetail sd=ite.next();
			if(sd.getStuCourseId()!=0 && sd.getStuTeacherId()!=0){
				selectedStudentCount++;
			}else{
				notSelectedStudentCount++;
			}
		}
		System.out.println("已经有"+selectedStudentCount+"个学生选择了课题");
		System.out.println("还有"+notSelectedStudentCount+"个学生没有参加选择了课题");
		
		System.out.println("运行结束");
	}
}
