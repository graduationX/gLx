package com.educate.front.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.educate.front.service.StudentService;
import com.educate.pojo.Student;
import com.educate.pojo.StudentQuery;

@Controller
@RequestMapping("page/front/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="stulist" ,method =RequestMethod.GET)
	public @ResponseBody String  stulist(String key){
		StudentQuery sQuery=new StudentQuery();
		sQuery.setSclass(key);
		System.out.println(key+"======");
		List<Student> list=new ArrayList<>();
		list =studentService.stuInfo(sQuery);
		 
		return JSON.toJSONString(list);
	}
	
}
