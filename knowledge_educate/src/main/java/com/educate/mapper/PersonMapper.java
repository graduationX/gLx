package com.educate.mapper;

import com.educate.pojo.Person;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 *
 * @author lin
 *	数据库操作的接口
 */
public interface PersonMapper {

    int deleteByPrimaryKey(String personid);

    int insert(Person record) throws Exception;

    int insertSelective(Person record);


    Person selectByPrimaryKey(String personid);

    int updateByPrimaryKeySelective(Person record);

    int updateByPrimaryKey(Person record);

    /**
     * 查询学生列表
     * @return  返回学生列表
     * @throws Exception
     * ceshi
     */
	List<Person> selectList()throws Exception;
}