package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.ITimeTableDAO;
import org.yhb.vo.TimeTable;

public class ITimeTableDAOService {
	private ITimeTableDAO dao;
	
	public ITimeTableDAO getDao() {
		return dao;
	}

	public void setDao(ITimeTableDAO dao) {
		this.dao = dao;
	}

	public List<TimeTable> doGetAllTimes() {
		// TODO Auto-generated method stub
		return this.dao.doGetAllTimes();
	}

	public boolean doUpdate(TimeTable time) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(time);
	}

	public TimeTable getATimeTableById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getATimeTableById(id);
	}

	public TimeTable getATimeTableByName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getATimeTableByName(name);
	}

}
