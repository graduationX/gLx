package com.educate.front.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.educate.front.service.PersonService;
import com.educate.mapper.PersonMapper;
import com.educate.pojo.Person;
import com.educate.pojo.Student;
import com.educate.util.pagehelper.PageInfo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


/**
 * 服务层的实现类，处理controller 与mapper 交互
 * @author lin
 * 
 */
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonMapper personMapper;
	
	@Override
	public void personInsert(Person person) {
	
		try {
			personMapper.insert(person);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Page<Person> selectlist(int pageNo, int pageSize) {
		/*PageInfo<Person> stuPage =new PageInfo<>();
		List<Person> slist=new ArrayList<>();
		try {
			
			PageHelper.startPage(pageNo, pageSize);
			stuPage =personMapper.selectList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		PageHelper.startPage(pageNo, pageSize);
		
		Page<Person> page =new Page<>();
		try {
			page =personMapper.selectList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return page;
	}

}
