package com.example;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        StudentDao dao = new StudentDao();

        dao.addStudent(new Student("Ram", 85, "CS"));
        dao.addStudent(new Student("Krishna", 90, "CS"));
        dao.addStudent(new Student("Arjun", 70, "IT"));
        dao.addStudent(new Student("Ravi", 60, "IT"));
        dao.addStudent(new Student("Shyam", 88, "CS"));
        dao.addStudent(new Student("Amit", 75, "ME"));
        dao.addStudent(new Student("Neha", 92, "CS"));
        dao.addStudent(new Student("Karan", 55, "ME"));
        dao.addStudent(new Student("Anita", 78, "IT"));
        dao.addStudent(new Student("Sita", 81, "CS"));

        System.out.println("Top 3 Students:");

        List<Student> top = dao.getTopStudents();

        for(Student s : top)
            System.out.println(s);

        System.out.println("\nIncreasing CS marks by 5%");
        dao.increaseCSMarks();

        System.out.println("\nDeleting below average students");
        dao.deleteBelowAverage();

        System.out.println("\nBranch Wise Average:");
        dao.branchWiseAverage();
    }
}