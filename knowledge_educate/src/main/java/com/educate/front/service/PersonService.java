package com.educate.front.service;

import java.util.List;

import com.educate.pojo.Person;
import com.educate.util.pagehelper.PageInfo;
import com.github.pagehelper.Page;

/**
 * 
 * 服务层接口 
 * @author lin
 *
 */
public interface PersonService {

	public void  personInsert(Person person);

	/**
	 * 
	 * @return 学生列表
	 */
	public Page<Person> selectlist(int pageNo, int pageSize);
}
