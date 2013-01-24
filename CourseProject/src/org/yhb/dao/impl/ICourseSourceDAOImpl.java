package org.yhb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.ICourseSourceDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.Announcement;
import org.yhb.vo.CourseSource;

public class ICourseSourceDAOImpl extends BasicSqlSupport implements ICourseSourceDAO {

	public CourseSource getCourseSourceObjById(int id) {
		// TODO Auto-generated method stub
		CourseSource temp=null;
		temp=(CourseSource)this.session.selectOne("org.yhb.dao.mapper.CourseSource.getCourseSourceObjById",id);
		return temp;
	}

	public CourseSource getCourseSourceObjByName(String name) {
		// TODO Auto-generated method stub
		CourseSource temp=null;
		temp=(CourseSource)this.session.selectOne("org.yhb.dao.mapper.CourseSource.getCourseSourceObjByName",name);
		return temp;
	}

	public List<CourseSource> queryAllCourseSourceObj() {
		// TODO Auto-generated method stub
		List<CourseSource> res=new ArrayList<CourseSource>();
		res=this.session.selectList("org.yhb.dao.mapper.CourseSource.queryAllCourseSourceObj");
		return res;
	}

}
