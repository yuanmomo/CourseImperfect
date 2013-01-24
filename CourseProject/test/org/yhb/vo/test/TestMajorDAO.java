package org.yhb.vo.test;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhb.dao.IMajorTableDAO;
import org.yhb.vo.MajorTable;

public class TestMajorDAO{
	private BeanFactory beanFactory = null;
	private IMajorTableDAO dao = null;

	@Before
	public void setUp() throws Exception {
		//绝对路径
		//beanFactory=new ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml" );
		//相对路径
		beanFactory = new ClassPathXmlApplicationContext(
				"org/yhb/config/ApplicationContext.xml");
		dao =(IMajorTableDAO) beanFactory.getBean("IMajorTableDAOService");
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
		beanFactory = null;
	}

	@Test
	public void testDoInsert() {
		MajorTable temp=new MajorTable();
//		temp.setMajorName("软件工程");
//		temp.setInCollege(1);
//		this.dao.doInsert(temp);
//		
//		temp=new MajorTable();
//		temp.setMajorName("计算机科学与技术");
//		temp.setInCollege(1);
//		this.dao.doInsert(temp);
//		
//		temp=new MajorTable();
//		temp.setMajorName("地球物理");
//		temp.setInCollege(1);
//		this.dao.doInsert(temp);

		temp=new MajorTable();
		temp.setMajorName("勘探工程");
		temp.setInCollege(4);
		this.dao.doInsert(temp);
	}
	
	@Test
	public void testDoUpdate(){
		MajorTable temp=this.dao.getById(6);
		temp.setStartSelectDate(new Date());
		temp.setEndSelectDate(new Date((new Date().getTime()+1000000000L)));
		this.dao.doUpdate(temp);
	}
	@Test
	public void testDoDelete(){
		MajorTable temp=this.dao.getById(7);
		this.dao.doDelete(temp);
	}
	@Test
	public void testGetCount(){
		System.out.println(this.dao.getCount());
	}
	@Test
	public void testGetCountByCollegeId(){
		System.out.println(this.dao.getCountOfCollege(4));
		System.out.println(this.dao.getCountOfCollege(1));
		System.out.println(this.dao.getCountOfCollege(3));
	}
	@Test
	public void testGetById(){
		MajorTable temp=this.dao.getById(2);
		System.out.println(temp.getMajorId());
		System.out.println(temp.getMajorName());
		System.out.println(temp.getInCollege());
		System.out.println(temp.getEndSelectDate());
		System.out.println(temp.getStartSelectDate());
		System.out.println(temp.getIsDeleted());
	}
	@Test
	public void testGetMajors(){
		List<MajorTable> res=this.dao.getMajors(1, 10);
		Iterator<MajorTable> ite=res.iterator();
		while(ite.hasNext()){
			MajorTable temp=ite.next();
			System.out.println(temp.getMajorId());
			System.out.println(temp.getMajorName());
			System.out.println(temp.getInCollege());
			System.out.println(temp.getEndSelectDate());
			System.out.println(temp.getStartSelectDate());
			System.out.println(temp.getIsDeleted());
		}
	}
	@Test
	public void testGetByMajorName(){
		List<MajorTable> res=this.dao.getByMajorName("信工");
		Iterator<MajorTable> ite=res.iterator();
		while(ite.hasNext()){
			MajorTable temp=ite.next();
			System.out.println(temp.getMajorId());
			System.out.println(temp.getMajorName());
			System.out.println(temp.getInCollege());
			System.out.println(temp.getEndSelectDate());
			System.out.println(temp.getStartSelectDate());
			System.out.println(temp.getIsDeleted());
		}
	}
	@Test
	public void testGetMajorsByCollegeId(){
		List<MajorTable> res=this.dao.getMajorsByCollegeId(4);
		Iterator<MajorTable> ite=res.iterator();
		while(ite.hasNext()){
			MajorTable temp=ite.next();
			System.out.println(temp.getMajorId());
			System.out.println(temp.getMajorName());
			System.out.println(temp.getInCollege());
			System.out.println(temp.getEndSelectDate());
			System.out.println(temp.getStartSelectDate());
			System.out.println(temp.getIsDeleted());
		}
	}
}