package org.yhb.dao;

import java.util.List;

import org.yhb.vo.TimeTable;

public interface ITimeTableDAO {
	public List<TimeTable> doGetAllTimes();
	public boolean doUpdate(TimeTable time);
	public TimeTable getATimeTableById(int id);
	public TimeTable getATimeTableByName(String name);
}
