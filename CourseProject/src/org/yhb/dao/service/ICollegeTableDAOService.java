package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.ICollegeTableDAO;
import org.yhb.vo.CollegeTable;

public class ICollegeTableDAOService{
	private ICollegeTableDAO dao;
	
	public ICollegeTableDAO getDao() {
		return dao;
	}
	public void setDao(ICollegeTableDAO dao) {
		this.dao = dao;
	}

	
	public boolean doDelete(CollegeTable coll) {
		boolean flag=false;
		flag=this.dao.doDelete(coll);
		return flag;
	}

	public boolean doInsert(CollegeTable coll) {
		boolean flag=false;
		flag=this.dao.doInsert(coll);
		return flag;
	}

	public List<CollegeTable> doQueryAll() {
		// TODO Auto-generated method stub
		List<CollegeTable> res=this.dao.doQueryAll();
		return res;
	}

	public boolean doUpdate(CollegeTable coll) {
		boolean flag=false;
		flag=this.dao.doUpdate(coll);
		return flag;
	}

	public CollegeTable getCollegeById(int id) {
		// TODO Auto-generated method stub
		CollegeTable temp=null;
		temp=this.dao.getCollegeById(id);
		return temp;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return this.dao.getCount();
	}

}
