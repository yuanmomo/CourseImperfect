package org.yhb.dao;

import java.util.List;

import org.yhb.vo.StudentDetail;
import org.yhb.vo.TeacherPosition;
import org.yhb.vo.UserTable;
import org.yhb.vo.entity.UserLoginEntity;

public interface IUserTableDAO {
	//do insert a student
	public boolean doInsertAStu(UserTable user);
	//do insert a teacher
	public boolean doInsertATea(UserTable user);
	//do update a user
	public boolean doUpdate(UserTable user);
	//do delete a user
	public boolean doDelete(int userId);
	//is the studentNumber exist?
	public boolean isStuNumberExist(String stuNumber);
	public UserTable getStudentByStuNumber(String stuNumber);
	//user login and return this user by (Name or StudentNumber) and password
	public UserTable getUserByLogin(UserLoginEntity entity);
	//get a user by id
	public UserTable getUserById(int id);
	//is a teacherName exist
	public UserTable isTeaNameExist(String userName);
	//do query and get all teachers
	public List<TeacherPosition> getTeachers(int currentPage,int pageSize);
	//do query and get all teachers
	public List<UserTable> getAllTeachers();
	//get teachers count
	public int getTeachersCount();
	//get a teacher with position
	public TeacherPosition getTeacherPositionById(int id);
	//do query and get all students
	public List<StudentDetail> getStudentsWithClass(int currentPage,int pageSize);
	//do query and get all students
	public List<StudentDetail> getStudentsWithClass();
	//get students count
	public int getStudentsCount();
	//get student detail by id
	public StudentDetail getStudentDetailById(int id);
	//do query and get all students by teacherid
	public List<StudentDetail> getStudentDetailByTeacherId(int currentPage,int pageSize,int teacherId);
	//get students count
	public int getStudentsCountByTeacherId(int teacherId);
	//delete datas when initial system 
	public void initialSystemDeleteStudents();
	//delete datas when initial system 
	public void initialSystemDeleteTeachers();
	

	//将学生的选题情况清空，STTTeacheid=0 stuCourseId=0
	public void eraseStudentsSelections();
	//将老师的被选情况清空，teacurrentstu=0
	public void eraseTeacherCurrentStudents();
}
