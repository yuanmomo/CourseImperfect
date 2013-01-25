package org.yhb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.IPositionTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.PositionTable;

public class IPositionTableDAOImpl extends BasicSqlSupport implements IPositionTableDAO {

	public PositionTable getPositionById(int id) {
		PositionTable position=null;
		position=(PositionTable)this.session.selectOne("org.yhb.dao.mapper.Position.getPositionById",id);
		return position;
	}

	@SuppressWarnings("unchecked")
	public List<PositionTable> doQueryAll() {
		List<PositionTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Position.doQueryAll");
		return res;
	}

	public boolean doInsert(PositionTable position) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.Position.doInsert",position);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public PositionTable getPositionByName(String name) {
		PositionTable position=null;
		position=(PositionTable)this.session.selectOne("org.yhb.dao.mapper.Position.getPositionByName",name);
		return position;
	}

	@SuppressWarnings("unchecked")
	public List<PositionTable> getAll(int currentPage, int pageSize) {
		List<PositionTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Position.getAll",null,
				new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getAllCount() {
		// TODO Auto-generated method stub
		return (Integer)this.session.selectOne("org.yhb.dao.mapper.Position.getAllCount");
	}

	public boolean doDelete(int id) {
		// TODO Auto-generated method stub\\
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.Position.doDelete",id);
		flag=count>0?true:false;
		return flag;
	}

	public boolean doUpdate(PositionTable p) {
		// TODO Auto-generated method stub\\
		boolean flag=false;
		int count=this.session.update("org.yhb.dao.mapper.Position.doUpdate",p);
		flag=count>0?true:false;
		return flag;
	}

	public int isPositionNameExit(String name) {
		Integer temp=(Integer)this.session.selectOne("org.yhb.dao.mapper.Position.isPostionNameExist",name);
		int res=0;
		if(temp!=null){
			res=temp;
		}
		return res;
	}
}
