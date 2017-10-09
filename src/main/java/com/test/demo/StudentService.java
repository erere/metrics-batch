package com.test.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private StudentDao dao;
	
	@Override
	public void save(List<Student> students) {
		dao.save(students);

	}

}
