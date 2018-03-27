package com.educate.front.service;

import java.util.List;

import com.educate.pojo.Student;
import com.educate.pojo.StudentQuery;

public interface StudentService {
	
	public Student byStu(String key);
	
	public List<Student> stuInfo(StudentQuery key);

}
