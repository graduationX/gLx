package com.educate.mapper;

import com.educate.pojo.Person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PersonMapper {

    int deleteByPrimaryKey(String personid);

    int insert(Person record) throws Exception;

    int insertSelective(Person record);


    Person selectByPrimaryKey(String personid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

	List<Person> selectList()throws Exception;
}