package com.educate.front.service;

import java.util.List;

import com.educate.pojo.Teacher;

/**
 * 教师服务接口
 * @author lin
 *
 */
public interface TeacherService {
	
	
	/**
	 * 按id查询出教师
	 * @param tid
	 * @return
	 */
	Teacher  findtea(String tid);
	
	/**
	 * 按名字查询教师
	 * @param tname
	 * @return
	 */
	Teacher  findtname(String tname);
	
	
	List<Teacher> listTesa();
	
	
}
