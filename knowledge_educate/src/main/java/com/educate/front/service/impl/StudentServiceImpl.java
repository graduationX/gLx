package com.educate.front.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.educate.front.service.StudentService;
import com.educate.mapper.StudentMapper;
import com.educate.pojo.Student;
import com.educate.pojo.StudentQuery;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student byStu(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Student> stuInfo(StudentQuery key) {
		Page<Student> list =new Page<>();
		PageHelper.startPage(key.getPageNum(),key.getPageSize());
		try {
			list = studentMapper.stulist(key);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝执行了　？");
		return list;
	}

}
