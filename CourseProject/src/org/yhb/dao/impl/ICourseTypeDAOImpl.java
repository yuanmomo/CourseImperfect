package org.yhb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.yhb.dao.ICourseTypeDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.CourseSource;
import org.yhb.vo.CourseType;

public class ICourseTypeDAOImpl extends BasicSqlSupport implements ICourseTypeDAO {

	public CourseType getCourseTypeObjById(int id) {
		// TODO Auto-generated method stub
		CourseType temp=null;
		temp=(CourseType)this.session.selectOne("org.yhb.dao.mapper.CourseType.getCourseTypeObjById",id);
		return temp;
	}

	public CourseType getCourseTypeObjByName(String name) {
		// TODO Auto-generated method stub
		CourseType temp=null;
		temp=(CourseType)this.session.selectOne("org.yhb.dao.mapper.CourseType.getCourseTypeObjByName",name);
		return temp;
	}

	public List<CourseType> queryAllCourseTypeObj() {
		// TODO Auto-generated method stub
		List<CourseType> res=new ArrayList<CourseType>();
		res=this.session.selectList("org.yhb.dao.mapper.CourseType.queryAllCourseTypeObj");
		return res;
	}

}
