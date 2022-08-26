package com.springrestapi.services;

import java.util.List;

import com.springrestapi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
