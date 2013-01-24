package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IClassTableDAO;
import org.yhb.vo.ClassDetail;
import org.yhb.vo.ClassTable;

public class IClassTableDAOService{
	private IClassTableDAO dao=null;
	
	
	public IClassTableDAO getDao() {
		return dao;
	}

	public void setDao(IClassTableDAO dao) {
		this.dao = dao;
	}

	public boolean doDelete(int id) {
		// TODO Auto-generated method stub
		return this.dao.doDelete(id);
	}

	public boolean doInsert(ClassTable cla) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(cla);
	}

	public boolean doUpdate(ClassTable cla) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(cla);
	}

	public ClassDetail getClassByClassId(int classId) {
		// TODO Auto-generated method stub
		return this.dao.getClassByClassId(classId);
	}

	public ClassTable getClassByClassNameChi(String chineseName) {
		// TODO Auto-generated method stub
		return this.dao.getClassByClassNameChi(chineseName);
	}

	public ClassTable getClassByClassNameNumber(String classNameNumber) {
		// TODO Auto-generated method stub
		return this.dao.getClassByClassNameNumber(classNameNumber);
	}

	public List<ClassTable> getClassesByMajorId(int majorId) {
		// TODO Auto-generated method stub
		return this.dao.getClassesByMajorId(majorId);
	}

	public List<ClassDetail> getAllClasses(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getAllClasses(currentPage, pageSize);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return this.dao.getCount();
	}

	public int isClassNameExsit(String className) {
		// TODO Auto-generated method stub
		return this.dao.isClassNameExsit(className);
	}

	public int isClassNumberExsit(String classNumber) {
		// TODO Auto-generated method stub
		return this.dao.isClassNumberExsit(classNumber);
	}
}
