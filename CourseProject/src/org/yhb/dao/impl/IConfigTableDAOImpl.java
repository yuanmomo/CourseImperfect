package org.yhb.dao.impl;

import java.util.List;

import org.yhb.dao.IConfigTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.ConfigTable;

public class IConfigTableDAOImpl extends BasicSqlSupport implements IConfigTableDAO {

	public boolean doInsert(ConfigTable config) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.Config.doInsert",config);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	@SuppressWarnings("unchecked")
	public List<ConfigTable> getConfigsByConfigName(String name) {
		List<ConfigTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Config.getConfigsByConfigName", name);
		return res;
	}
}
