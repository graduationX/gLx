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
import com.educate.util.pagehelper.PageInfo;
import com.github.pagehelper.Page;

@Controller
@RequestMapping("page/front/student")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value="stulist" ,method =RequestMethod.GET)
	public @ResponseBody String  stulist(String key){
		StudentQuery sQuery=new StudentQuery();
		sQuery.setSclass(key);
		sQuery.setPageNum(1);
		sQuery.setPageSize(1);
		/*System.out.println(key+"======");
		List<Student> list=new ArrayList<>();
		list =studentService.stuInfo(sQuery);*/
		Page<Student> pageStu =studentService.stuInfo(sQuery);
		PageInfo<Student> pageInfo =new PageInfo<>(pageStu);
		System.out.println("+++++======="+pageInfo.getList().get(0).getBirth());
		System.out.println("+++++++++++++"+JSON.toJSONString(pageInfo));
		return JSON.toJSONString(pageInfo);
	}
	
}
