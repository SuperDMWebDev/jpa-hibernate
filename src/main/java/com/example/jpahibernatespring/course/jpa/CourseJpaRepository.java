package com.example.jpahibernatespring.course.jpa;

import org.springframework.stereotype.Repository;

import com.example.jpahibernatespring.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	public void findById(int id) {
		entityManager.find(Course.class, id);
	}
	public void deleteByid(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
