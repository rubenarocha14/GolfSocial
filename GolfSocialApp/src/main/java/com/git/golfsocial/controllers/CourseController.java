package com.git.golfsocial.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.git.golfsocial.entities.Course;
import com.git.golfsocial.services.CourseService;

@RestController
@RequestMapping("api/")
@CrossOrigin({ "*", "http://localhost/" })
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@GetMapping("courses")
	public List<Course> index(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("index");
		List<Course> courses = courseService.getCourses();
		if(courses.size() == 0) {
			resp.setStatus(404);
		}
		return courses;
	}
}
