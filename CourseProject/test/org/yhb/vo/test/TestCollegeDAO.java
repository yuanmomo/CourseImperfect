package org.yhb.vo.test;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yhb.dao.ICollegeTableDAO;
import org.yhb.dao.service.FetchDataService;
import org.yhb.dao.service.ICollegeTableDAOService;
import org.yhb.vo.CollegeTable;

public class TestCollegeDAO {
	private BeanFactory beanFactory = null;
	private ICollegeTableDAOService dao = null;

	@Before
	public void setUp() throws Exception {
		//绝对路径
		//beanFactory=new ClassPathXmlApplicationContext("file:E:\\workspace\\7e-NewPlatform2.0\\WebContent\\WEB-INF\\applicationContext.xml" );
		//相对路径
		beanFactory = new ClassPathXmlApplicationContext(
				"org/yhb/config/ApplicationContext.xml");
		//dao =(ICollegeTableDAOService) beanFactory.getBean("ICollegeTableDAOService");
	}

	@After
	public void tearDown() throws Exception {
		dao = null;
		beanFactory = null;
	}

	@Test
	public void testGetCount() {
		
		System.out.println(this.dao.getCount()+"************");
	}
	
	@Test
	public void testDoInset(){
		CollegeTable table=new CollegeTable();
		table.setCollegeName("ccccc");
		table.setCollegeDescription("dddddd");
//		table.setCollegeName("信息管理科学学院");
//		table.setCollegeDescription("听说女生很多的学校，有电子商务专业");
		this.dao.doInsert(table);
	}
	@Test
	public void testDoDelete(){
		CollegeTable table=new CollegeTable();
		table=this.dao.getCollegeById(6);
		this.dao.doDelete(table);
	}
	
	@Test
	public void testDoGetOne(){
		CollegeTable table=new CollegeTable();
		table=this.dao.getCollegeById(4);
		System.out.println(table.getCollegeId());
		System.out.println(table.getCollegeName());
		System.out.println(table.getCollegeDescription());
		System.out.println(table.getIsDeleted());
	}
	
	@Test
	public void testDoUpdate(){
		CollegeTable table=new CollegeTable();
		table=this.dao.getCollegeById(4);
		table.setCollegeName("aaaa*****aa");
		table.setCollegeDescription("asdfffffffffff");
		this.dao.doUpdate(table);
		table=this.dao.getCollegeById(4);
		System.out.println(table.getCollegeId());
		System.out.println(table.getCollegeName());
		System.out.println(table.getCollegeDescription());
		System.out.println(table.getIsDeleted());
	}
	@Test
	public void testDoQueryAll(){
		List<CollegeTable> res=this.dao.doQueryAll();
		Iterator<CollegeTable> ite=res.iterator();
		while(ite.hasNext()){
			CollegeTable temp=ite.next();
			System.out.println(temp.getCollegeId());
			System.out.println(temp.getCollegeName());
			System.out.println(temp.getCollegeDescription());
			System.out.println(temp.getIsDeleted());
		}
	}
	
	@Test
	public void testFetchCollegeToJSON(){
//		FetchInitData fetch=(FetchInitData)this.beanFactory.getBean("FetchInitData");
//		ICollegeTableDAO temp=(ICollegeTableDAOService)beanFactory.getBean("ICollegeTableDAOService");
//		System.out.println(fetch.fetchCollegeToJSON(temp));
	}
}
