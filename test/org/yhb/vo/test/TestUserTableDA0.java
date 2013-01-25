//package org.yhb.vo.test;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.yhb.dao.IUserTableDAO;
//import org.yhb.dao.service.IUserTableDAOService;
//import org.yhb.vo.UserTable;
//
//public class TestUserTableDA0 {
//	private BeanFactory beanFactory = null;
//	private IUserTableDAO dao = null;
//
//	@Before
//	public void setUp() throws Exception {
//		//绝对路径
//		//beanFactory=new ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml" );
//		//相对路径
//		beanFactory = new ClassPathXmlApplicationContext(
//				"org/yhb/config/ApplicationContext.xml");
//		dao =(IUserTableDAOService) beanFactory.getBean("IUserTableDAOService");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		dao = null;
//		beanFactory = null;
//	}
//	
//	@Test
//	public void testLogin(){
//		String number="200805010604";
//		String password="12345";
//		UserTable u=new UserTable();
//		u.setStuNumber(number);
//		u.setPassword(password);
//		UserTable user=dao.getUserByLogin(null);
//		System.out.println(user);
//		if(user!=null){
//			System.out.println(user.getUserId());
//			System.out.println(user.getUserName());
//			System.out.println(user.getPassword());
//			System.out.println(user.getPhone());
//			System.out.println(user.getEmail());
//			System.out.println(user.getTeaCurrentStu());
//			System.out.println(user.getTeaDescription());
//			System.out.println(user.getTeaMaxStu());
//			System.out.println(user.getTeaPosition());
//			System.out.println(user.getRegIp());
//			System.out.println(user.getRegTime());
//			System.out.println(user.getLastLoginIp());
//			System.out.println(user.getLastLoginTime());
//			System.out.println(user.getStuClassId());
//			System.out.println(user.getStuCourseId());
//			System.out.println(user.getStuNumber());
//			System.out.println(user.getStuTeacherId());
//			System.out.println(user.getIsDeleted());
//			System.out.println(user.getRole());
//		}
//	}
//}
