package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.ICourseSourceDAO;
import org.yhb.vo.CourseSource;

public class ICourseSourceDAOService implements ICourseSourceDAO {
	private ICourseSourceDAO dao;
	
	public void setDao(ICourseSourceDAO dao) {
		this.dao = dao;
	}

	public CourseSource getCourseSourceObjById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getCourseSourceObjById(id);
	}

	public CourseSource getCourseSourceObjByName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getCourseSourceObjByName(name);
	}

	public List<CourseSource> queryAllCourseSourceObj() {
		// TODO Auto-generated method stub
		return this.dao.queryAllCourseSourceObj();
	}

}
