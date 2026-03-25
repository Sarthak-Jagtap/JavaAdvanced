package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.repoistory.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepo;

	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	public Course getCourseById(int id) {
		return courseRepo.findById(id).orElseThrow(() -> new RuntimeException("Course not found"));
	}
}