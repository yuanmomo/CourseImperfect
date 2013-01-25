package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IPositionTableDAO;
import org.yhb.vo.PositionTable;

public class IPositionTableDAOService {
	IPositionTableDAO dao=null;
	
	public IPositionTableDAO getDao() {
		return dao;
	}
	public void setDao(IPositionTableDAO dao) {
		this.dao = dao;
	}
	public List<PositionTable> doQueryAll() {
		// TODO Auto-generated method stub
		return this.dao.doQueryAll();
	}
	public PositionTable getPositionById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getPositionById(id);
	}
	public boolean doInsert(PositionTable position) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(position);
	}
	public PositionTable getPositionByName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getPositionByName(name);
	}
	public List<PositionTable> getAll(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getAll(currentPage, pageSize);
	}
	public int getAllCount() {
		// TODO Auto-generated method stub
		return this.dao.getAllCount();
	}
	public boolean doDelete(int id) {
		// TODO Auto-generated method stub
		return this.dao.doDelete(id);
	}
	public boolean doUpdate(PositionTable p) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(p);
	}
	public int isPositionNameExit(String name) {
		// TODO Auto-generated method stub
		return this.dao.isPositionNameExit(name);
	}

}
