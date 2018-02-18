package com.educate.front.service.impl;

import com.educate.front.service.TeacherService;
import com.educate.mapper.TeacherMapper;
import com.educate.pojo.Teacher;

public class TeacherServiceImpl implements TeacherService{

	private TeacherMapper teacherMapper;
	
	@Override
	public Teacher findtea(String tid) {
		
		Teacher teacheres=new Teacher();
		teacheres = teacherMapper.findByTeaid(tid);
		
		return null;
	}

}
