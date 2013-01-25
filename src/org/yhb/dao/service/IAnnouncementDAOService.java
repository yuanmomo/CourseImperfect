package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IAnnouncementDAO;
import org.yhb.vo.Announcement;

public class IAnnouncementDAOService{
	private IAnnouncementDAO dao;
	
	public void setDao(IAnnouncementDAO dao) {
		this.dao = dao;
	}
	public IAnnouncementDAO getDao() {
		return dao;
	}

	public boolean doDelete(int id) {
		boolean flag=false;
		flag=this.dao.doDelete(id);
		return flag;
	}
	public boolean doInsert(Announcement annou) {
		boolean flag=false;
		flag=this.dao.doInsert(annou);
		return flag;
	}
	public List<Announcement> doQuery(int currentPage, int pageSize) {
		List<Announcement> res=this.dao.doQuery(currentPage, pageSize);
		return res;
	}
	public boolean doUpdate(Announcement annou) {
		boolean flag=false;
		flag=this.dao.doUpdate(annou);
		return flag;
	}
	public Announcement getAnnouncementById(int id) {
		Announcement a=null;
		a=this.dao.getAnnouncementById(id);
		return a;
	}
	public int getCount() {
		return this.dao.getCount();
	}
	public void initialSystem() {
		this.dao.initialSystem();
	}
}
