package com.educate.front.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.educate.front.service.PersonService;
import com.educate.pojo.Person;

/**
 * @author lin
 * @param model 数据存入前端
 * @return
 */
@Controller
@RequestMapping("/page/front/person")

public class PersonController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "/personList", method = RequestMethod.GET)
	public @ResponseBody String personList(Model model){
		List<Person> list =new ArrayList<>();
		list =personService.selectlist();
		return  JSON.toJSONString(list);
	} 
	
}
