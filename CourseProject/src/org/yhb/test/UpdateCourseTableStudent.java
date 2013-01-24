package org.yhb.test;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhb.dao.service.ICourseTableDAOService;
import org.yhb.dao.service.IUserTableDAOService;
import org.yhb.mvc.controller.UserController;
import org.yhb.vo.CourseTable;
import org.yhb.vo.StudentDetail;

public class UpdateCourseTableStudent {

	private BeanFactory beanFactory = null;

	@Before
	public void setUp() throws Exception {
		beanFactory = new ClassPathXmlApplicationContext(
				"classpath:org/yhb/config/ApplicationContext.xml");
	}

	// After是指在运行完这个测试方法过后回执行的一个方法。一般都是回收资源的。
	@After
	public void tearDown() throws Exception {
		beanFactory = null;
	}

	@Test
	public void saveUserTest() {
		// 测试插入方法
		ICourseTableDAOService courseDao=(ICourseTableDAOService)beanFactory.getBean("ICourseTableDAOService");
		IUserTableDAOService userDao=(IUserTableDAOService)beanFactory.getBean("IUserTableDAOService");
		List<CourseTable> courseList=courseDao.doQuery();
		List<StudentDetail> userList=userDao.getStudentsWithClass();
		for(CourseTable c:courseList){
			if(c.getIsSelected()==0){
				for(StudentDetail s:userList){
					if(s.getStuCourseId()==c.getCourse_Id()){
						System.out.println("当前学生"+s.getUserName()+" ,指导老师" +s.getStuTeacherId());
						c.setStudent(s.getUserId());
						c.setIsSelected(1);
						courseDao.doUpdate(c);
					}
				}
			}
		}
	}
	@Test
	public void count() {
		// 测试插入方法
		ICourseTableDAOService courseDao=(ICourseTableDAOService)beanFactory.getBean("ICourseTableDAOService");
		List<CourseTable> courseList=courseDao.doQuery();
		int count=0;
		for(CourseTable c:courseList){
			if(c.getIsSelected()!=0){
				count++;
			}
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!"+count);
	}
	
}
