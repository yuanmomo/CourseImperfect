//package org.yhb.vo.test;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.yhb.dao.IAnnouncementDAO;
//import org.yhb.dao.service.IAnnouncementDAOService;
//
//public class TestAnnouncementDAO{
//	private BeanFactory beanFactory = null;
//	private IAnnouncementDAO dao = null;
//
//	@Before
//	public void setUp() throws Exception {
//		//绝对路径
//		//beanFactory=new ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml" );
//		//相对路径
//		beanFactory = new ClassPathXmlApplicationContext(
//				"org/yhb/config/ApplicationContext.xml");
//		dao =(IAnnouncementDAOService) beanFactory.getBean("IAnnouncementDAOService");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		dao = null;
//		beanFactory = null;
//	}
//
//	@Test
//	public void saveUserTest() {
//		System.out.println(this.dao.getCount()+"************");
//	}
//}