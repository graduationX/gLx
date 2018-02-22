package com.educate.front.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.educate.front.service.TeacherService;
import com.educate.mapper.TeacherMapper;
import com.educate.pojo.Teacher;

/**
 * 
 * @author lin
 *
 */
public class TeacherServiceImpl implements TeacherService{

	/**
	 * 教师Mapper
	 */
	@Autowired
	private TeacherMapper teacherMapper;


	@Override
	public List<Teacher> listTesa() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public Teacher findtea(String tid) {
		Teacher teacheres=new Teacher();
		
		teacheres = teacherMapper.findByTeaid(tid);
		
		return teacheres;
	}

	public Teacher findtname(String tname){
        Teacher teacher=new Teacher();
        teacher = teacherMapper.findByTname(tname);
        
        return teacher;
	}
	
}
