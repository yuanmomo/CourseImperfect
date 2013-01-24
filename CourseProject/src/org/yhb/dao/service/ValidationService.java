package org.yhb.dao.service;

import org.yhb.dao.IMajorTableDAO;
import org.yhb.util.BeanFactory;
import org.yhb.vo.UserTable;

public class ValidationService {
	public static boolean validateUserAvailable(UserTable user){
		int majorId=0;
		//validate
		
		//1.get the new user's studentNumber.
		//2.try to validate whether the studentNumber is available according to the ConfigTable value of "current_available_major"
		
		IMajorTableDAOService dao=(IMajorTableDAOService)BeanFactory.getBean("IMajorTableDAOService");
		majorId=dao.isMajorNumberExsit(user.getStuNumber().substring(0,8));

		return majorId>0? true:false;
	}
}
