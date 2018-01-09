package com.educate.front.service;

import java.util.List;

import com.educate.pojo.Person;

public interface PersonService {

	public void  personInsert(Person person);

	public List<Person> selectlist();
}
