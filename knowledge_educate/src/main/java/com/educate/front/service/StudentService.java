package com.educate.front.service;

import java.util.List;

import com.educate.pojo.Student;
import com.educate.pojo.StudentQuery;
import com.github.pagehelper.Page;

public interface StudentService {
	
	public Student byStu(String key);
	
	public Page<Student> stuInfo(StudentQuery key);

}
