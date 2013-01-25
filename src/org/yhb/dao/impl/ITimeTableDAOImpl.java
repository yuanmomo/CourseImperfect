package org.yhb.dao.impl;

import java.util.List;

import org.yhb.dao.ITimeTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.TimeTable;

public class ITimeTableDAOImpl extends BasicSqlSupport implements ITimeTableDAO {

	@SuppressWarnings("unchecked")
	public List<TimeTable> doGetAllTimes() {
		List<TimeTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Time.doGetAllTimes");
		return res;
	}

	public boolean doUpdate(TimeTable time) {
		int count=this.session.update("org.yhb.dao.mapper.Time.doUpdate",time);
		return count>0?true:false;
	}

	public TimeTable getATimeTableById(int id) {
		// TODO Auto-generated method stub
		TimeTable time=null;
		time=(TimeTable)this.session.selectOne("org.yhb.dao.mapper.Time.getATimeTableById",id);
		return time;
	}

	public TimeTable getATimeTableByName(String name) {
		// TODO Auto-generated method stub
		TimeTable time=null;
		time=(TimeTable)this.session.selectOne("org.yhb.dao.mapper.Time.getATimeTableByName",name);
		return time;
	}

}
