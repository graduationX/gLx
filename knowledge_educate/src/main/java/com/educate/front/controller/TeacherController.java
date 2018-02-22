package com.educate.front.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
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
}
