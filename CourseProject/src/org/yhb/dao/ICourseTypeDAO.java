package org.yhb.dao;

import java.util.List;

import org.yhb.vo.CourseType;

public interface ICourseTypeDAO {
	public CourseType getCourseTypeObjById(int id);
	public CourseType getCourseTypeObjByName(String name);
	public List<CourseType> queryAllCourseTypeObj();
}
