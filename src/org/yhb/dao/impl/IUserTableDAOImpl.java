package org.yhb.dao.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.yhb.dao.IUserTableDAO;
import org.yhb.util.BasicSqlSupport;
import org.yhb.vo.StudentDetail;
import org.yhb.vo.TeacherPosition;
import org.yhb.vo.UserTable;
import org.yhb.vo.entity.UserLoginEntity;

public class IUserTableDAOImpl extends BasicSqlSupport implements IUserTableDAO {
	public boolean doUpdate(UserTable user) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.User.doUpdate",user);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean isStuNumberExist(String stuNumber) {
		int count=(Integer)this.session.selectOne("org.yhb.dao.mapper.User.isStuNumberExist", stuNumber);
		return count>0?true:false;
	}

	public boolean doInsertAStu(UserTable user) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.User.doInsertAStu",user);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doInsertATea(UserTable user) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.User.doInsertATea",user);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public boolean doDelete(int userId) {
		boolean flag=false;
		int count=this.session.delete("org.yhb.dao.mapper.User.doDelete",userId);
		if(count>0){
			flag=true;
		}
		return flag;
	}

	public UserTable getUserByLogin(UserLoginEntity entity) {
		UserTable u=(UserTable)this.session.selectOne("org.yhb.dao.mapper.User.getUserByLogin",entity);
		return u;
	}

	public UserTable getUserById(int id) {
		// TODO Auto-generated method stub
		UserTable u=(UserTable)this.session.selectOne("org.yhb.dao.mapper.User.getUserById",id);
		return u;
	}

	public UserTable isTeaNameExist(String userName) {
		// TODO Auto-generated method stub
		UserTable u=(UserTable)this.session.selectOne("org.yhb.dao.mapper.User.isTeaNameExist", userName);
		return u;
	}

	@SuppressWarnings("unchecked")
	public List<TeacherPosition> getTeachers(int currentPage,int pageSize) {
		List<TeacherPosition> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.User.getTeachers",null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getTeachersCount() {
		int count=(Integer)this.session.selectOne("org.yhb.dao.mapper.User.getTeachersCount");
		return count;
	}

	public TeacherPosition getTeacherPositionById(int id) {
		TeacherPosition temp=(TeacherPosition)this.session.selectOne("org.yhb.dao.mapper.User.getTeacherPositionById",id);
		return temp;
	}

	@SuppressWarnings("unchecked")
	public List<StudentDetail> getStudentsWithClass(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		List<StudentDetail> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.User.getStudentsWithClass",null,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getStudentsCount() {
		int count=(Integer)this.session.selectOne("org.yhb.dao.mapper.User.getStudentsCount");
		return count;
	}

	public StudentDetail getStudentDetailById(int id) {
		// TODO Auto-generated method stub
		StudentDetail stu=(StudentDetail)this.session.selectOne("org.yhb.dao.mapper.User.getStudentDetailById",id);
		return stu;
	}

	@SuppressWarnings("unchecked")
	public List<StudentDetail> getStudentDetailByTeacherId(int currentPage,
			int pageSize, int teacherId) {
		// TODO Auto-generated method stub
		List<StudentDetail> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.User.getStudentDetailByTeacherId",teacherId,new RowBounds((currentPage-1)*pageSize,pageSize));
		return res;
	}

	public int getStudentsCountByTeacherId(int teacherId) {
		// TODO Auto-generated method stub
		int count=(Integer)this.session.selectOne("org.yhb.dao.mapper.User.getStudentsCountByTeacherId",teacherId);
		return count;
	}

	@SuppressWarnings("unchecked")
	public List<UserTable> getAllTeachers() {
		List<UserTable> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.User.getAllTeachers");
		return res;
	}

	@SuppressWarnings("unchecked")
	public List<StudentDetail> getStudentsWithClass() {
		// TODO Auto-generated method stub
		List<StudentDetail> res=null;
		res=this.session.selectList("org.yhb.dao.mapper.User.getStudentsWithClass",null);
		return res;
	}
	public void initialSystemDeleteStudents() {
		// TODO Auto-generated method stub
		this.session.delete("org.yhb.dao.mapper.User.initialSystemDeleteStudents");
	}

	public void initialSystemDeleteTeachers() {
		// TODO Auto-generated method stub
		this.session.delete("org.yhb.dao.mapper.User.initialSystemDeleteTeachers");
	}

	public UserTable getStudentByStuNumber(String stuNumber) {
		// TODO Auto-generated method stub
		UserTable u=(UserTable)this.session.selectOne("org.yhb.dao.mapper.User.getStudentByStuNumber", stuNumber);
		return u;
	}
	public void eraseStudentsSelections() {
		this.session.update("org.yhb.dao.mapper.User.eraseStudentsSelections");
	}

	public void eraseTeacherCurrentStudents() {
		this.session.update("org.yhb.dao.mapper.User.eraseTeacherCurrentStudents");
	}
}
