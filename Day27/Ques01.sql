show databases;

-- Create a database named training_db-
create database training_db;
use training_db;

-- Create a Table- 
-- Create a table student with:
-- student_id (integer, primary key)
-- name (varchar 50, not null)
-- email (varchar 100, unique)
-- dob (date)

create table student(
	student_id int primary key,
    name varchar(50) not null,
    email varchar(100) unique,
    dob date
);

show tables;
desc student;

-- Alter Table – Add Column 
-- Add a column mobile (varchar 15) to student.

alter table student add mobile varchar(15);
desc student;

--  Alter Table – Modify Column 
-- Change name column size from 50 to 100 characters.

alter table student modify name varchar(100);
desc student;

--  Drop Column 
-- Remove the dob column from student.

alter table student drop dob;
desc student;

-- Constraints & Keys 


-- Create Table with Constraints
-- Create table course:
-- course_id (int, primary key)
-- course_name (varchar 50, not null)
-- duration (int, check duration > 0)
-- fees (decimal 8,2)

create table course(
	course_id int primary key,
    course_name varchar(50) not null,
    duration int check(duration > 0) ,
    fees decimal(8,2)
);
show tables;
describe course;

-- Foreign Key Constraint
-- Create table enrollment:
-- enroll_id (int, primary key)
-- student_id (foreign key → student.student_id)
-- course_id (foreign key → course.course_id)
-- enroll_date (date)

create table enrollment(
	enroll_id int primary key,
    student_id int,
	course_id int,
    enroll_date date,
    foreign key (student_id) references student(student_id),
    foreign key (course_id) references course(course_id)
);