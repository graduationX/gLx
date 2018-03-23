package com.educate.front.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.educate.exception.CustomException;
import com.educate.front.service.TeacherService;
import com.educate.pojo.Teacher;

@Controller

@RequestMapping("/page/front/teacher")

public class TeacherController {
	

	@Autowired
	private TeacherService teacherService;
	
	
	//public 
	
	/*@RequestMapping(value="/jiaoshi" ,method=RequestMethod.GET)
	public @ResponseBody String teaInfo(String tid){
		Teacher teacher =new Teacher();
		teacher =teacherService.findtea(tid);
		return JSON.toJSONString(teacher);
	}*/
	
	@RequestMapping(value="/jiaoshiinfo" ,method=RequestMethod.GET)
	
	public @ResponseBody String teacherInfo(String tid){
		
		Teacher teacher =new Teacher();
		teacher= teacherService.findtea(tid);
		System.out.println("教师名字"+teacher.getTname());
		return JSON.toJSONString(teacher);
	}
   @RequestMapping(value="/teacherinfo",method = RequestMethod.GET)
	public @ResponseBody String bbhbhj(String tname){
		Teacher teacher =new Teacher();
		teacher = teacherService.findtname(tname);
		System.out.println("============"+teacher.getTname());
		return JSON.toJSONString(teacher);
	}
   
 //登陆提交路径 和配置文件路径一致
   @RequestMapping(value="/login")
   public String shiroLogin(HttpServletRequest request,Model model) throws Exception {
	   
	   //登陆失败获取失败信息
	  // CustomException customException =new CustomException();
	   String exceptionClassName = (String) request.getAttribute("shiroLoginFailure");
	  // shiro在认证过程中出现错误后将异常类路径通过request返回
	//   CustomException exception =new CustomException(message);
    if(exceptionClassName!=null) {
		
		if (UnknownAccountException.class.getName().equals(exceptionClassName)) {
			//throw new CustomException("账号不存在");
			//return null;
			String msg ="账号不存在！";
			model.addAttribute("msg",msg);
			
		} else if (IncorrectCredentialsException.class.getName().equals(
				exceptionClassName)) {
			//throw new CustomException("用户名/密码错误");
			//return null; 
			String msg ="密码不正确！";
			model.addAttribute("msg",msg);	 
		} else{	
			throw new Exception();//最终在异常处理器生成未知错误
			//return null;
		}
	   }
	   //登陆失败回到当前页面
	   return "page/login";
   }
}
