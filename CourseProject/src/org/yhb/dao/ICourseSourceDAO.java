package org.yhb.dao;

import java.util.List;

import org.yhb.vo.CourseSource;

public interface ICourseSourceDAO {
	public CourseSource getCourseSourceObjById(int id);
	public CourseSource getCourseSourceObjByName(String name);
	public List<CourseSource> queryAllCourseSourceObj();
}
