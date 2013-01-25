package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.ICourseTableDAO;
import org.yhb.vo.CourseTable;
import org.yhb.vo.CourseTea;

public class ICourseTableDAOService implements ICourseTableDAO{
	ICourseTableDAO dao=null;
	
	public ICourseTableDAO getDao() {
		return dao;
	}
	public void setDao(ICourseTableDAO dao) {
		this.dao = dao;
	}

	public boolean doDelete(int courseId) {
		// TODO Auto-generated method stub
		return this.dao.doDelete(courseId);
	}

	public CourseTable doGetACourseById(int courseId) {
		// TODO Auto-generated method stub
		return this.dao.doGetACourseById(courseId);
	}

	public boolean doInsert(CourseTable course) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(course);
	}

	public List<CourseTable> doQuery(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.doQuery(currentPage, pageSize);
	}

	public boolean doUpdate(CourseTable course) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(course);
	}
	public List<CourseTea> doQueryAndTeacher(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.doQueryAndTeacher(currentPage, pageSize);
	}
	public int getCount() {
		// TODO Auto-generated method stub
		return this.dao.getCount();
	}
	public CourseTea doGetACourseWithTeaById(int courseId) {
		// TODO Auto-generated method stub
		return this.dao.doGetACourseWithTeaById(courseId);
	}
	public boolean doInsert(CourseTea course) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(course);
	}
	public boolean doUpdate(CourseTea course) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(course);
	}
	public List<CourseTable> doQueryOneTeacher(int currentPage, int pageSize,
			int teacherId) {
		// TODO Auto-generated method stub
		return this.dao.doQueryOneTeacher(currentPage, pageSize, teacherId);
	}
	public int getCountOneTeacher(int teacherId) {
		// TODO Auto-generated method stub
		return this.dao.getCountOneTeacher(teacherId);
	}
	public List<CourseTable> doQueryOneTeacher(int teacherId) {
		// TODO Auto-generated method stub
		return this.dao.doQueryOneTeacher(teacherId);
	}
	public List<CourseTea> doGetCoursesByTeaIds(int currentPage, int pageSize,
			List<Integer> ids) {
		// TODO Auto-generated method stub
		return this.dao.doGetCoursesByTeaIds(currentPage, pageSize, ids);
	}
	public int getCountOfTeaIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return this.dao.getCountOfTeaIds(ids);
	}
	public int isCourseNameExist(String name) {
		// TODO Auto-generated method stub
		return this.dao.isCourseNameExist(name);
	}
	public List<CourseTable> doQuery() {
		// TODO Auto-generated method stub
		return this.dao.doQuery();
	}
	public List<CourseTea> doGetCoursesByTeaIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return this.dao.doGetCoursesByTeaIds(ids);
	}
	public void initialSystem() {
		// TODO Auto-generated method stub
		this.dao.initialSystem();
	}
	public CourseTable doGetACourseByName(String courseName) {
		// TODO Auto-generated method stub
		return this.dao.doGetACourseByName(courseName);
	}
	public void eraseCousrseSelected() {
		// TODO Auto-generated method stub
		this.dao.eraseCousrseSelected();
	}
}
