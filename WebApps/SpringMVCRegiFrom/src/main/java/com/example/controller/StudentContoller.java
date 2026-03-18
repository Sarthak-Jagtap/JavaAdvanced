package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.StudentDAO;
import com.example.model.Student;

@Controller
public class StudentContoller {

	@Autowired
	StudentDAO dao;

	public void setDao(StudentDAO dao) {
		this.dao = dao;
	}

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/")
	public String showHome() {
		return "home";
	}

	@GetMapping("/form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "form";
	}

	@PostMapping("/submit")
	public String handleForm(@ModelAttribute("student") Student student, Model model) {
		model.addAttribute("studData", student);
		dao.insertData(student);
		return "result";
	}

	@GetMapping("/students")
	public String showAllStudents(Model model) {
		List<Student> students = dao.getAll();
		model.addAttribute("students", students);
		return "showAll";
	}

}
