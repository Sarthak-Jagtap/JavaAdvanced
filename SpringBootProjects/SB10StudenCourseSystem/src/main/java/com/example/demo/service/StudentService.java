
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Course;
import com.example.demo.model.Student;
import com.example.demo.repoistory.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
    public Student createStudent(Student student) {

        // 🔥 IMPORTANT: Set student in each course
        if (student.getCourses() != null) {
            for (Course course : student.getCourses()) {
                course.setStudent(student);
            }
        }

        return studentRepo.save(student);
    }

    
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }


    public Student getStudentById(int id) {
        return studentRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }


    public Student updateStudent(int id, Student student) {

        Student existing = getStudentById(id);

        existing.setName(student.getName());


        if (student.getCourses() != null) {
            existing.getCourses().clear();

            for (Course course : student.getCourses()) {
                course.setStudent(existing);
                existing.getCourses().add(course);
            }
        }

        return studentRepo.save(existing);
    }


    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
	
}
