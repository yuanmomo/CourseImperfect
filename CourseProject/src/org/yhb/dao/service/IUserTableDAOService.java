package org.yhb.dao.service;

import java.util.List;

import org.yhb.dao.IUserTableDAO;
import org.yhb.vo.StudentDetail;
import org.yhb.vo.TeacherPosition;
import org.yhb.vo.UserTable;
import org.yhb.vo.entity.UserLoginEntity;

public class IUserTableDAOService implements IUserTableDAO{
	private IUserTableDAO dao=null;
	
	public IUserTableDAO getDao() {
		return dao;
	}

	public void setDao(IUserTableDAO dao) {
		this.dao = dao;
	}

	public boolean doDelete(int userId) {
		// TODO Auto-generated method stub
		return this.dao.doDelete(userId);
	}

	public boolean doInsertAStu(UserTable user) {
		// TODO Auto-generated method stub
		return this.dao.doInsertAStu(user);
	}

	public boolean doInsertATea(UserTable user) {
		// TODO Auto-generated method stub
		return this.dao.doInsertATea(user);
	}

	public boolean doUpdate(UserTable user) {
		// TODO Auto-generated method stub
		return this.dao.doUpdate(user);
	}

	public boolean isStuNumberExist(String stuNumber) {
		// TODO Auto-generated method stub
		return this.dao.isStuNumberExist(stuNumber);
	}

	public UserTable getUserByLogin(UserLoginEntity entity) {
		// TODO Auto-generated method stub
		return this.dao.getUserByLogin(entity);
	}

	public UserTable getUserById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getUserById(id);
	}

	public UserTable isTeaNameExist(String userName) {
		// TODO Auto-generated method stub
		return this.dao.isTeaNameExist(userName);
	}

	public List<TeacherPosition> getTeachers(int currentPage,int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getTeachers(currentPage,pageSize);
	}

	public int getTeachersCount() {
		// TODO Auto-generated method stub
		return this.dao.getTeachersCount();
	}

	public TeacherPosition getTeacherPositionById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getTeacherPositionById(id);
	}

	public List<StudentDetail> getStudentsWithClass(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return this.dao.getStudentsWithClass(currentPage, pageSize);
	}

	public int getStudentsCount() {
		// TODO Auto-generated method stub
		return this.dao.getStudentsCount();
	}

	public StudentDetail getStudentDetailById(int id) {
		// TODO Auto-generated method stub
		return this.dao.getStudentDetailById(id);
	}

	public List<StudentDetail> getStudentDetailByTeacherId(int currentPage,
			int pageSize, int teacherId) {
		// TODO Auto-generated method stub
		return this.dao.getStudentDetailByTeacherId(currentPage, pageSize, teacherId);
	}

	public int getStudentsCountByTeacherId(int teacherId) {
		// TODO Auto-generated method stub
		return this.dao.getStudentsCountByTeacherId(teacherId);
	}

	public List<UserTable> getAllTeachers() {
		// TODO Auto-generated method stub
		return this.dao.getAllTeachers();
	}

	public List<StudentDetail> getStudentsWithClass() {
		// TODO Auto-generated method stub
		return this.dao.getStudentsWithClass();
	}

	public void initialSystemDeleteStudents() {
		// TODO Auto-generated method stub
		this.dao.initialSystemDeleteStudents();
	}

	public void initialSystemDeleteTeachers() {
		// TODO Auto-generated method stub
		this.dao.initialSystemDeleteTeachers();
	}

	public UserTable getStudentByStuNumber(String stuNumber) {
		// TODO Auto-generated method stub
		return this.dao.getStudentByStuNumber(stuNumber);
	}
	public void eraseStudentsSelections() {
		// TODO Auto-generated method stub
		this.dao.eraseStudentsSelections();
	}
	public void eraseTeacherCurrentStudents() {
		// TODO Auto-generated method stub
		this.dao.eraseTeacherCurrentStudents();
	}

}
