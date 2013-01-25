package org.yhb.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.ICollegeTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.CollegeTable;

public class ICollegeTableDAOImpl extends BasicSqlSupport implements ICollegeTableDAO {

	public boolean doDelete(CollegeTable coll) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.College.doDelete",coll.getCollegeId());
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doInsert(CollegeTable coll) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.College.doInsert",coll);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<CollegeTable> doQueryAll() {
		// TODO Auto-generated method stub
		List<CollegeTable> res=new ArrayList<CollegeTable>();
		res=this.session.selectList("org.yhb.dao.mapper.College.doQueryAll",
					null,new RowBounds(0,30));
		return res;
	}

	public boolean doUpdate(CollegeTable coll) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.College.doUpdate",coll);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public CollegeTable getCollegeById(int id) {
		CollegeTable temp=null;
		temp=(CollegeTable)this.session.selectOne("org.yhb.dao.mapper.College.getCollegeById",id);
		return temp;
	}

	public int getCount() {
		int count=0;
		count=(Integer)this.session.selectOne("org.yhb.dao.mapper.College.getCount");
		return count;
	}

}
