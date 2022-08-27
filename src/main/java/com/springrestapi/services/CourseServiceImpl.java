package com.springrestapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.dao.CourseDao;
import com.springrestapi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Course> list;
	
	public CourseServiceImpl() {
		
//		list = new ArrayList<>();
//		list.add(new Course(145, "Kursus Java Dasar", "ini kursus java dasar"));
//		list.add(new Course(433, "Kursus spring boot", "pengunaan rest api di spring boot"));
//	
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		
//		Course c = null;
//		for(Course course : list) {
//			if(course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {		
//		list.add(course);
		courseDao.save(course);
		return course;
	}
	

	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
	@Override
	public void deleteCourse(long parseLong) {
		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);
	}
	
}