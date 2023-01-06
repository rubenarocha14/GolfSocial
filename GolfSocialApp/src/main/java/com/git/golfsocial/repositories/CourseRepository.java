package com.git.golfsocial.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.git.golfsocial.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	//this is what actually touches the database
	
	List<Course> findAll();
	
	Course findById(int courseId);

}
