package org.yhb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.IClassTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.ClassDetail;
import org.yhb.vo.ClassTable;

public class IClassTableDAOImpl extends BasicSqlSupport implements IClassTableDAO {

	public boolean doDelete(int id) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.Class.doDelete",id);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doInsert(ClassTable cla) {
		boolean flag=false;
		int count=this.session.insert("org.yhb.dao.mapper.Class.doInsert",cla);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doUpdate(ClassTable cla) {
		boolean flag=false;
		int count=this.session.update("org.yhb.dao.mapper.Class.doUpdate",cla);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public ClassDetail getClassByClassId(int classId) {
		ClassDetail cla=null;
		cla=(ClassDetail) this.session.selectOne("org.yhb.dao.mapper.Class.getClassByClassId",classId);
		return cla;
	}

	public ClassTable getClassByClassNameChi(String chineseName) {
		ClassTable cla=null;
		cla=(ClassTable) this.session.selectOne("org.yhb.dao.mapper.Class.getClassByClassNameChi",chineseName);
		return cla;
	}

	public ClassTable getClassByClassNameNumber(String classNameNumber) {
		ClassTable cla=null;
		cla=(ClassTable) this.session.selectOne("org.yhb.dao.mapper.Class.getClassByClassNameNumber",classNameNumber);
		return cla;
	}

	@SuppressWarnings("unchecked")
	public List<ClassTable> getClassesByMajorId(int majorId) {
		List<ClassTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Class.getClassedByMajorId", majorId);
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<ClassDetail> getAllClasses(int currentPage,int pageSize) {
		List<ClassDetail> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.Class.getAllClasses",
				null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return (Integer)this.session.selectOne("org.yhb.dao.mapper.Class.getCount");
	}

	public int isClassNameExsit(String className) {
		Integer temp=(Integer)this.session.selectOne("org.yhb.dao.mapper.Class.isClassNameExsit",className);
		int res=0;
		if(temp!=null){
			res=temp;
		}
		return res;
	}

	public int isClassNumberExsit(String classNumber) {
		Integer temp=(Integer)this.session.selectOne("org.yhb.dao.mapper.Class.isClassNumberExsit",classNumber);
		int res=0;
		if(temp!=null){
			res=temp;
		}
		return res;
	}
}
