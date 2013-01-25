/**
 * 
 */
package org.yhb.dao.service;

import java.util.Iterator;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.yhb.dao.IClassTableDAO;
import org.yhb.dao.ICollegeTableDAO;
import org.yhb.dao.IMajorTableDAO;
import org.yhb.util.BeanFactory;
import org.yhb.vo.ClassTable;
import org.yhb.vo.CollegeTable;
import org.yhb.vo.MajorTable;

/**
 * @author Harry
 *
 */
public class FetchDataService {
	//将所有的学院转换为JSON
	public String fetchCollegeToJSON(){
		//[{"":"","":"","":""},{"":"","":"","":""}]
		JSONArray array=new JSONArray();
		ICollegeTableDAOService dao=(ICollegeTableDAOService)BeanFactory.getBean("ICollegeTableDAOService");
		List<CollegeTable> res=dao.doQueryAll();
		Iterator<CollegeTable> ite=res.iterator();
		while(ite.hasNext()){
			CollegeTable coll=ite.next();
			JSONObject json = new JSONObject();
			try {
				json.put("collegeId", coll.getCollegeId());
				json.put("collegeName", coll.getCollegeName());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			array.put(json);
		}
		return array.toString();
	}
	
	//将给定学院下所有的专业转换为JSON
	public String fetchMajorToJSON(int collegeId){
		//[{"":"","":"","":""},{"":"","":"","":""}]
		JSONArray array=new JSONArray();
		IMajorTableDAOService dao=(IMajorTableDAOService)BeanFactory.getBean("IMajorTableDAOService");
		List<MajorTable> res=dao.getMajorsByCollegeId(collegeId);
		Iterator<MajorTable> ite=res.iterator();
		while(ite.hasNext()){
			MajorTable major=ite.next();
			JSONObject json = new JSONObject();
			try {
				json.put("majorId", major.getMajorId());
				json.put("majorName", major.getMajorName());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			array.put(json);
		}
		return array.toString();
	}
	
	//将给定专业下所有的班级转换为JSON
	public String fetchClassesToJSON(int majorId){
		//[{"":"","":"","":""},{"":"","":"","":""}]
		JSONArray array=new JSONArray();
		IClassTableDAOService dao=(IClassTableDAOService)BeanFactory.getBean("IClassTableDAOService");
		List<ClassTable> res=dao.getClassesByMajorId(majorId);
		Iterator<ClassTable> ite=res.iterator();
		while(ite.hasNext()){
			ClassTable c=ite.next();
			JSONObject json = new JSONObject();
			try {
				json.put("classId", c.getClassId());
				json.put("className", c.getClassNameChi());
			} catch (JSONException e) {
				e.printStackTrace();
			}
			array.put(json);
		}
		return array.toString();
	}
	
}
