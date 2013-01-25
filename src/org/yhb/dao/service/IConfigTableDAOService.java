package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IConfigTableDAO;
import org.yhb.vo.ConfigTable;

public class IConfigTableDAOService{
	private IConfigTableDAO dao;
	
	public IConfigTableDAO getDao() {
		return dao;
	}
	public void setDao(IConfigTableDAO dao) {
		this.dao = dao;
	}
	public boolean doInsert(ConfigTable config) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(config);
	}
	public List<ConfigTable> getConfigsByConfigName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getConfigsByConfigName(name);
	}

}
