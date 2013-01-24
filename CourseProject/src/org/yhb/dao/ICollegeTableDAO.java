package org.yhb.dao;

import java.util.List;

import org.yhb.vo.CollegeTable;

public interface ICollegeTableDAO {
	//insert
	public boolean doInsert(CollegeTable coll);
	//delete
	public boolean doDelete(CollegeTable coll);
	//update a CollegeTable
	public boolean doUpdate(CollegeTable coll);
	//get a CollegeTable
	public CollegeTable getCollegeById(int id);
	//query a list of College
	public List<CollegeTable> doQueryAll();
	//get count of the table
	public int getCount();
}
