package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.ICourseTypeDAO;
import org.yhb.vo.CourseType;

public class ICourseTypeDAOService implements ICourseTypeDAO {
	private ICourseTypeDAO dao;
	
	public void setDao(ICourseTypeDAO dao) {
		this.dao = dao;
	}

	public CourseType getCourseTypeObjById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getCourseTypeObjById(id);
	}

	public CourseType getCourseTypeObjByName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getCourseTypeObjByName(name);
	}

	public List<CourseType> queryAllCourseTypeObj() {
		// TODO Auto-generated method stub
		return this.dao.queryAllCourseTypeObj();
	}

}
