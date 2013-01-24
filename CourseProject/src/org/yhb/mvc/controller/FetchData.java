package org.yhb.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yhb.dao.service.FetchDataService;
import org.yhb.util.BeanFactory;

@Controller
@RequestMapping("/fetchData.do")
public class FetchData{
	
	//异步请求学院列表
	@RequestMapping(params="fetchCollege")
	public String fetchCollege(int id,ModelMap modelMap){
		String colleges=((FetchDataService)BeanFactory.getBean("FetchDataService"))
		.fetchCollegeToJSON();
		modelMap.addAttribute("json", colleges);
		return "json";
	}
	//根据所选学院查询该学院所有的专业，AJAX传输JSON
	@RequestMapping(params="fetchMajor")
	public String fetchMajar(int id,ModelMap modelMap){
		String majors=((FetchDataService)BeanFactory.getBean("FetchDataService"))
			.fetchMajorToJSON(id);
		modelMap.addAttribute("json", majors);
		return "json";
	}
	
	//根据所选专业查询该专业所有的班级，AJAX传输JSON
	@RequestMapping(params="fetchClasses")
	public String fetchClasses(int id,ModelMap modelMap){
		String classes=((FetchDataService)BeanFactory.getBean("FetchDataService"))
			.fetchClassesToJSON(id);
		modelMap.addAttribute("json", classes);
		return "json";
	}
}
