package com.example.jpahibernatespring.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.jpahibernatespring.course.Course;
import com.example.jpahibernatespring.course.jpa.CourseJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner{

	@Autowired
//	private CourseJdbcRepository repository;
	
	private CourseJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.insert(new Course(1,"Learn jdbc","28minutes	"));
//		repository.delete(1);
		System.out.println(repository.findById(1));
		
	}

}
