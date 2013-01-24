package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IMajorTableDAO;
import org.yhb.vo.MajorTable;

public class IMajorTableDAOService {
	private IMajorTableDAO dao=null;
	public IMajorTableDAO getDao() {
		return dao;
	}
	public void setDao(IMajorTableDAO dao) {
		this.dao = dao;
	}

	public boolean doDelete(MajorTable major) {
		return this.dao.doDelete(major);
	}

	public boolean doInsert(MajorTable major) {
		// TODO Auto-generated method stub
		return this.dao.doInsert(major);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
	}

	public boolean doUpdate(MajorTable major) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(major);
	}

	public MajorTable getById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getById(id);
	}

	public List<MajorTable> getByMajorName(String name) {
		// TODO Auto-generated method stub
		return this.dao.getByMajorName(name);
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return this.dao.getCount();
	}

	public int getCountOfCollege(int colleeId) {
		// TODO Auto-generated method stub
		return this.dao.getCountOfCollege(colleeId);
	}

	public List<MajorTable> getMajors(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getMajors(currentPage, pageSize);
	}

	public List<MajorTable> getMajorsByCollegeId(int collegeId) {
		// TODO Auto-generated method stub
		return this.dao.getMajorsByCollegeId(collegeId);
	}
	public List<MajorTable> getMajorsByGroupMajorId(List<String> majorsList) {
		// TODO Auto-generated method stub
		return this.dao.getMajorsByGroupMajorId(majorsList);
	}
	public int isMajorNameExsit(String majorName) {
		// TODO Auto-generated method stub
		return this.dao.isMajorNameExsit(majorName);
	}
	public int isMajorNumberExsit(String majorNumber) {
		// TODO Auto-generated method stub
		return this.dao.isMajorNumberExsit(majorNumber);
	}

}
