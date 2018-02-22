package com.educate.front.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.educate.front.service.PersonService;
import com.educate.front.service.TeacherService;
import com.educate.mapper.PersonMapper;
import com.educate.pojo.Person;
import com.educate.pojo.Teacher;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring/applicationContext-*.xml")
public class PersonServiceImplTest {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private TeacherService teacherService;
	
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
	

}
