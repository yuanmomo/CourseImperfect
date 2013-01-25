package org.yhb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.ICourseTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.CourseTable;
import org.yhb.vo.CourseTea;

public class ICourseTableDAOImpl extends  BasicSqlSupport implements ICourseTableDAO {
	public boolean doDelete(int courseId) {
		int count=this.session.update("org.yhb.dao.mapper.Course.doDelete",courseId);
		return count>0?true:false;
	}

	public CourseTable doGetACourseById(int courseId) {
		CourseTable course=null;
		course=(CourseTable)this.session.selectOne("org.yhb.dao.mapper.Course.doGetACourseById",courseId);
		return course;
	}

	public boolean doInsert(CourseTable course) {
		int count=this.session.insert("org.yhb.dao.mapper.Course.doInsert",course);
		return count>0?true:false;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTable> doQuery(int currentPage, int pageSize) {
		List<CourseTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doQuery", 
				null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public boolean doUpdate(CourseTable course) {
		int count=this.session.update("org.yhb.dao.mapper.Course.doUpdate",course);
		return count>0?true:false;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTea> doQueryAndTeacher(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List<CourseTea> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doQueryAndTeacher", 
				null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return (Integer)this.session.selectOne("org.yhb.dao.mapper.Course.getCount");
	}

	public CourseTea doGetACourseWithTeaById(int courseId) {
		// TODO Auto-generated method stub
		CourseTea course=(CourseTea)this.session.selectOne("org.yhb.dao.mapper.Course.doGetACourseWithById",courseId);
		return course;
	}

	public boolean doInsert(CourseTea course) {
		int count=this.session.insert("org.yhb.dao.mapper.Course.doInsertACourseTea",course);
		return count>0?true:false;
	}

	public boolean doUpdate(CourseTea course) {
		int count=this.session.update("org.yhb.dao.mapper.Course.doUpdateACourseTea",course);
		return count>0?true:false;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTable> doQueryOneTeacher(int currentPage, int pageSize,
			int teacherId) {
		// TODO Auto-generated method stub
		List<CourseTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doQueryOneTeacher", 
				teacherId,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getCountOneTeacher(int teacherId) {
		// TODO Auto-generated method stub
		return (Integer)this.session.selectOne("org.yhb.dao.mapper.Course.getCountOneTeacher",teacherId);
	}

	@SuppressWarnings("unchecked")
	public List<CourseTable> doQueryOneTeacher(int teacherId) {
		// TODO Auto-generated method stub
		List<CourseTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doQueryOneTeacher", 
				teacherId);
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTea> doGetCoursesByTeaIds(int currentPage, int pageSize,
			List<Integer> ids) {
		List<CourseTea> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doGetCoursesByTeaIds", 
				ids,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getCountOfTeaIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		return (Integer)this.session.selectOne("org.yhb.dao.mapper.Course.getCountOfTeaIds",ids);
	}

	public int isCourseNameExist(String name) {
		Integer temp=(Integer)this.session.selectOne("org.yhb.dao.mapper.Course.isCourseNameExist",name);
		int res=0;
		if(temp!=null){
			res=temp;
		}
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTable> doQuery() {
		// TODO Auto-generated method stub
		List<CourseTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doQuery", 
				null);
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<CourseTea> doGetCoursesByTeaIds(List<Integer> ids) {
		// TODO Auto-generated method stub
		List<CourseTea> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Course.doGetCoursesByTeaIds", 
				ids);
		return res;
	}

	public void initialSystem() {
		this.session.delete("org.yhb.dao.mapper.Course.initialSystem");
	}

	public CourseTable doGetACourseByName(String courseName) {
		CourseTable course=null;
		course=(CourseTable)this.session.selectOne("org.yhb.dao.mapper.Course.doGetACourseByName",courseName);
		return course;
	}

	public void eraseCousrseSelected() {
		this.session.update("org.yhb.dao.mapper.Course.eraseCousrseSelected");
	}
}
