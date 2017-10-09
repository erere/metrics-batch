package com.test.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class StudentItemWriter implements org.springframework.batch.item.ItemWriter<StudentDTO> {

	@Autowired
	IStudentService service;

	@Override
	public void write(List<? extends StudentDTO> items) throws Exception {
		List<Student> students = new ArrayList<Student>();
		Student student;
		for (StudentDTO dto : items) {
			student = new Student();
			student.setEmailAddress(dto.getEmailAddress());
			student.setName(dto.getName());
			student.setPurchasedPackage(dto.getPurchasedPackage());
			students.add(student);
		}
		service.save(students);

	}

}
