create database companyDB;
use companyDB;

create table Department(
	deptId INT PRIMARY KEY AUTO_INCREMENT,
	deptName VARCHAR(50),
	deptLoc VARCHAR(50)
);

create table Employee(
	empId INT PRIMARY KEY AUTO_INCREMENT,
	empName VARCHAR(50),
	empEmail VARCHAR(100),
	empSal DOUBLE,
	deptId INT,
	joiningDate DATE,
    foreign key (deptId) references Department(deptId)
);

show tables;

