package com.git.golfsocial.services;

import java.util.List;

import com.git.golfsocial.entities.Course;

public interface CourseService {
	
	List <Course> getCourses();
	
	Course getCourse(Integer courseId);
	
	Course createCourse(Course course);
	
	Course update(Integer courseId, Course course);
	
	Boolean delete (Integer courseId);

}
