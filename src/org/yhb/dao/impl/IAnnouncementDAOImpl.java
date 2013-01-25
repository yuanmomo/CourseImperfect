package org.yhb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.IAnnouncementDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.Announcement;

public class IAnnouncementDAOImpl extends BasicSqlSupport implements IAnnouncementDAO {

	public boolean doDelete(int id) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.Announcement.doDelete",id);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doInsert(Announcement annou) {
		// TODO Auto-generated method stub
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.Announcement.doInsert",annou);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<Announcement> doQuery(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List<Announcement> res=new ArrayList<Announcement>();
		res=this.session.selectList("org.yhb.dao.mapper.Announcement.doQuery",
					null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public boolean doUpdate(Announcement annou) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.Announcement.doUpdate",annou);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public Announcement getAnnouncementById(int id) {
		Announcement temp=null;
		temp=(Announcement)this.session.selectOne("org.yhb.dao.mapper.Announcement.getAnnouncementById",id);
		return temp;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		int count=0;
		count=(Integer)this.session.selectOne("org.yhb.dao.mapper.Announcement.getCount");
		return count;
	}

	public void initialSystem() {
		// TODO Auto-generated method stub
		this.session.delete("org.yhb.dao.mapper.Announcement.initialSystem");
	}
}
