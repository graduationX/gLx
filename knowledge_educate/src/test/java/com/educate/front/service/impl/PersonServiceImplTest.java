package com.educate.front.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.ws.rs.ext.MessageBodyWriter;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.educate.front.service.PersonService;
import com.educate.front.service.StudentService;
import com.educate.front.service.TeacherService;
import com.educate.mapper.PersonMapper;
import com.educate.pojo.Person;
import com.educate.pojo.Student;
import com.educate.pojo.StudentQuery;
import com.educate.pojo.Teacher;
import com.educate.util.pagehelper.PageInfo;
import com.educate.util.pagehelper.PageUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-*.xml")
public class PersonServiceImplTest {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private TeacherService teacherService;
	
	
	@Autowired
	private StudentService studentset;
	
	@Test
	public void testPersonInsert() {
		Person person =new Person();
		Date date =new Date(1987-10-03);
		person.setBirthday(date);
		person.setName("第2条数据");
		person.setPassword("123456");
		person.setSex("1");
		person.setPersonid("1424");
		personService.personInsert(person);
		
	}

	@Test
	public void testTeacher(){
		Teacher teacher =new Teacher();
		teacher =teacherService.findtea("123");
		System.out.println("============="+teacher.toString());
	}
	
	@Test
	public void testStu() {
		List<Student> list =new ArrayList<>();
		StudentQuery studentQuery =new StudentQuery();
		studentQuery.setSclass("52");
		list =studentset.stuInfo(studentQuery);
		System.out.println(list.get(0).toString());
	
	}
	
	@Test
	public void teseP() {
		/*PageUtil pageUtil =new  PageUtil();
		PageHelper.startPage(pageUtil.getOffset(),pageUtil.getLimit());*/
		//PageInfo<Object> list =new PageInfo<>();
		//list = personService.selectlist();
		
		//List<Person> list =new ArrayList<>();
		//list =personService.selectlist();
	/*	
		Page<ExXzzfBusiness> exXzzfBusinesses =exbService.findByPage(pageNo,pageSize);
		PageInfo<ExXzzfBusiness> pageInfo = new PageInfo<>(exXzzfBusinesses);
		Assert.notNull(exXzzfBusinesses);*/
		
		Page<Person> pages =personService.selectlist(1, 2);
		PageInfo<Person> pageInfo =new PageInfo<>(pages);
		//list =personService.selectlist(1, 1);
		System.out.println("++++++++++++"+JSON.toJSON(pageInfo));
	
	}

}
