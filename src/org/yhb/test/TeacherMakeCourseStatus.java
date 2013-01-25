package org.yhb.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhb.dao.service.ICourseTableDAOService;
import org.yhb.dao.service.IUserTableDAOService;
import org.yhb.vo.CourseTea;
import org.yhb.vo.UserTable;

public class TeacherMakeCourseStatus {
	private BeanFactory beanFactory = null;
	private IUserTableDAOService userDao=null;
	private ICourseTableDAOService courseDao=null;
	
	// Before的含义是在运行这个类中的测试方法的时候，首先会运行这个方法，对一些属性进行初始化，

	// 比如说这里我们是要读取Spring的配置文件，然后初始化Spring的容器以及其它的一些信息

	@Before
	public void setUp() throws Exception {

		beanFactory = new ClassPathXmlApplicationContext("org/yhb/config/ApplicationContext.xml");
		this.userDao=(IUserTableDAOService)beanFactory.getBean("IUserTableDAOService");
		this.courseDao=(ICourseTableDAOService)beanFactory.getBean("ICourseTableDAOService");;
	}

	@After
	public void tearDown() throws Exception {
		userDao=null;
		courseDao=null;
		beanFactory = null;
	}

	@Test
	public void saveUserTest() {
		int totalCourses=courseDao.getCount();
		System.err.println("一共有"+totalCourses+"个课题");
		int leftCourses=0;
		//剩余可选题目数
		List<UserTable> teachers=userDao.getAllTeachers();
		if(teachers!=null && teachers.size()>0){
			Iterator<UserTable> ite=teachers.iterator();
			//需要显示其课题老师的所有编号的list
			List<Integer> teaIds=new ArrayList<Integer>();
			while(ite.hasNext()){
				UserTable temp=ite.next();
				//判断该老师的出题是否够了a
				//并且，当前老师的带生人数要小于最大带生人数
				int cs=(int)(temp.getTeaMaxStu()*1.5);
				if(cs<=courseDao.getCountOneTeacher(temp.getUserId())
					&&temp.getTeaCurrentStu()<temp.getTeaMaxStu()){
					teaIds.add(temp.getUserId());
				}else{
					System.out.println("这个老师的题没有出够"+temp.getUserId()+" ,"+temp.getUserName());
				}
			}
			if(teaIds!=null&& teaIds.size()>0){
				List<CourseTea> results=courseDao.doGetCoursesByTeaIds(teaIds);
				if(results!=null && results.size()>0){
					Iterator<CourseTea> iteTemp=results.iterator();
					while(iteTemp.hasNext()){
						CourseTea temp=iteTemp.next();
						if(temp.getIsSelected()==1){
							iteTemp.remove();
						}
					}
				}
				leftCourses=results.size();
				System.err.println("未选的课题有"+leftCourses+"个 ");
			}
		}
	}
}
