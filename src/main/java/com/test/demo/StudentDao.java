package com.test.demo;

import org.springframework.data.repository.CrudRepository;

public interface StudentDao extends CrudRepository<Student, Long> {

}
