package com.git.golfsocial.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.git.golfsocial.entities.Course;
import com.git.golfsocial.repositories.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService  {

	@Autowired
	private CourseRepository courseRepo;
	
	@Override
	public List<Course> getCourses(){
		System.out.println("courses");
		List<Course> courses = courseRepo.findAll();
		return courses;
	}


	@Override
	public Course getCourse(Integer courseId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Course update(Integer courseId, Course course) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Boolean delete(Integer courseId) {
		// TODO Auto-generated method stub
		return null;
	}
}
