package org.yhb.mvc.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.yhb.dao.IAnnouncementDAO;
import org.yhb.dao.ICourseTableDAO;
import org.yhb.dao.IPositionTableDAO;
import org.yhb.dao.ITimeTableDAO;
import org.yhb.dao.IUserTableDAO;
import org.yhb.dao.service.FetchAnnouncementService;
import org.yhb.dao.service.IAnnouncementDAOService;
import org.yhb.dao.service.ICourseTableDAOService;
import org.yhb.dao.service.IPositionTableDAOService;
import org.yhb.dao.service.ITimeTableDAOService;
import org.yhb.dao.service.IUserTableDAOService;
import org.yhb.mvc.controller.panel.BuildLeftBar;
import org.yhb.util.BeanFactory;
import org.yhb.util.FinalDatas;
import org.yhb.util.MD5;
import org.yhb.util.PageSplit;
import org.yhb.util.StringContainsChi;
import org.yhb.vo.Announcement;
import org.yhb.vo.PositionTable;
import org.yhb.vo.TimeTable;
import org.yhb.vo.UserTable;
import org.yhb.vo.entity.UserLoginEntity;

@Controller
@RequestMapping("/login.do")
public class LoginController{
	
	//默认跳转至login.jsp
	@RequestMapping
	public String defaultForwardToLogin(HttpServletRequest request,ModelMap modelMap){
		UserTable user=(UserTable)request.getSession().getAttribute("user");
		if(user!=null){//已经登录过了
			modelMap.put("message", "你已经登录成功，正在跳转，请稍后...");
			modelMap.put("url", "login.do?success");
			modelMap.put("time", "3");
			return "global/notify";
		}else{
			return "login";
		}
	}
	
	@RequestMapping(params="submit")
	public String doUserLogin(ModelMap map,HttpServletRequest request,
			HttpServletResponse response){
		//取得用户名
		String loginName=request.getParameter("loginName").trim();
		if(loginName==null || "".equals(loginName)){
			map.put("errorMsg", "请输入用户名！");
			return "login";
		}
		
		boolean isChi=false;//是否是中文名字
		boolean isStuNumber=false;//是否是一个学号
		boolean isAdmin=false;//是否是管理员
		isChi=StringContainsChi.isAChineseStr(loginName);//判断用户名是全为汉字，是则为教师用户或者管理员
		isStuNumber=loginName.matches("\\d{12,13}");//判断是否为学生用户
		isAdmin="admin".equals(loginName);
		if(!isChi&&!isStuNumber&&!isAdmin){
			map.put("errorMsg", "请输入正确的用户名！");
			return "login";
		}
		
		//得到用户密码
		String loginPass=request.getParameter("loginPass");
		if(loginPass==null ||"".equals(loginPass)){
			map.put("errorMsg", "请输入您的密码！");
			map.put("loginName", loginName);
			return "login";
		}
		
		//登录用户名和密码均合法，则登录
		IUserTableDAOService dao=(IUserTableDAOService)BeanFactory.getBean("IUserTableDAOService");
		UserLoginEntity entity=new UserLoginEntity();
		if(isChi || isAdmin){
			entity.setUserName(loginName);
		}
		if(isStuNumber){
			entity.setStuNumber(loginName);
		}
		entity.setPassword(MD5.getMD5(loginPass));
		UserTable user=dao.getUserByLogin(entity);
		
		//判断是否得到用户
		if(user==null){
			map.put("errorMsg", "用户名密码错误！！");
			return "login";
		}else{
			//查找到用户，登录成功，刷新上次登录IP 和时间
			String IP=request.getRemoteAddr();
			Date time=new Date();
			user.setLastLoginIp(IP);
			user.setLastLoginTime(time);
			dao.doUpdate(user);
			
			//将用户与加入session
			request.getSession().setAttribute("user", user);
			//注册URL,notify.jsp将进行跳转
			map.put("url","login.do?success");
			map.put("time",1);
			map.put("message", "登录成功，正在跳转，请稍等....");
			
			return "global/notify";
		}
	}
	
	@RequestMapping(params="success")
	public String doLoginSuccess(ModelMap map,HttpServletRequest request){
		UserTable user=(UserTable)request.getSession().getAttribute("user");
		
		
		//页面左边边栏操作栏目
		String leftBar=BuildLeftBar.build(user,
				FinalDatas.xmlFileBasicLocation,null);
		map.put("leftBar", leftBar);
		
		
		//如果是教师登录成功过后，得判断电话和email是否为空，如果为空则跳转至用户资料修改界面
		if(user.getRole()==2){
			ICourseTableDAOService courseDao=(ICourseTableDAOService)BeanFactory.getBean("ICourseTableDAOService");
			request.getSession().setAttribute("teaCurrentCourses",courseDao.getCountOneTeacher(user.getUserId()));
			
			if((user.getEmail()==null || "".equals(user.getEmail())
			 || user.getPhone()==null || "".equals(user.getPhone()))){
				//初始化职称信息
				IPositionTableDAOService positionDao=(IPositionTableDAOService)
						BeanFactory.getBean("IPositionTableDAOService");
				List<PositionTable> res=positionDao.doQueryAll();
				map.put("positionList", res);
				map.put("module","tea_edit");
				map.put("teacher", user);
				return "panel/panel";
			}
		}
		//判断是否已过截止出题时间，根据出题是否达到要求给特定的提示
		if(user.getRole()==2){
			//是否截止出题时间
			ITimeTableDAOService timeDao=(ITimeTableDAOService)BeanFactory.
				getBean("ITimeTableDAOService");
			TimeTable importTime=timeDao.getATimeTableByName("课题导入时间");
			long now=new Date().getTime();
			if(now >(importTime.getTimeEnd().getTime())){
				request.getSession().setAttribute("teacherSpecialNotice","抱歉地通知：<br />" +
						"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;由于您今年出题量未达到要求，不能参加指导本科毕业生的工作。");
			}else{
				request.getSession().setAttribute("teacherSpecialNotice", "特别提示：<br />"
        				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;您的立题数量未到达要求，则无法进入选题题库。<br />"
        				+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;继续努力，否则您本年度无法参加指导毕业生论文的工作。");
			}
		}
		
		// 初始化右边的公告列表
		PageSplit page=new PageSplit();
		//设置参数
		page.setParameters(request);
		IAnnouncementDAOService dao=(IAnnouncementDAOService)BeanFactory.getBean("IAnnouncementDAOService");
		List<Announcement> news = ((FetchAnnouncementService) BeanFactory
				.getBean("FetchAnnouncementService")).adminGetAnnouList(page.getCurrentPage(),page.getPageSize());
		map.put("news", news);
		page.setResultCount(dao.getCount());
		
		map.put("pageSplit",page.split("news.do?c=newslist"));
		//右边加载模块
		request.setAttribute("module","news_list");
		return "panel/panel";
	}
	@RequestMapping(params="exit")
	public String exit(HttpServletRequest request,ModelMap map){
		UserTable user=(UserTable)request.getSession().getAttribute("user");
		if(user!=null){
			request.getSession().removeAttribute("user");
			request.getSession().removeAttribute("teaCurrentCourses");
			request.getSession().invalidate();
		}
		map.put("message", "安全退出");
		map.put("url","login.do");
		map.put("time",3);
		return "global/notify";
	}
}
