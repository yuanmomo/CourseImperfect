package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IAnnouncementDAO;
import org.yhb.util.BeanFactory;
import org.yhb.vo.Announcement;

public class FetchAnnouncementService {
	public List<Announcement> adminGetAnnouList(int currentPage,int pageSize){
		List<Announcement> res=null;
		IAnnouncementDAOService dao=(IAnnouncementDAOService)BeanFactory.getBean("IAnnouncementDAOService");
		res=dao.doQuery(currentPage, pageSize);
		return res;
	}
}
