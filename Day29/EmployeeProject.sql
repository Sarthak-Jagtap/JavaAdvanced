show databases;

use Employee;

show tables;

desc Employee;


drop table Employee;


create table Department(
	deptId int primary key,
    deptName text,
    deptLoc text
);

INSERT INTO Department (deptId, deptName, deptLoc) VALUES
(1,'Information Technology','Pune'),
(2,'Human Resources','Mumbai'),
(3,'Finance','Delhi'),
(4,'Marketing','Bangalore'),
(5,'Operations','Hyderabad'),
(6,'Research and Development','Chennai'),
(7,'Sales','Ahmedabad'),
(8,'Customer Support','Jaipur'),
(9,'Logistics','Nagpur'),
(10,'Administration','Lucknow'),
(11,'Procurement','Surat'),
(12,'Legal','Kolkata'),
(13,'Quality Assurance','Indore'),
(14,'Business Analytics','Noida'),
(15,'Product Management','Gurgaon'),
(16,'Training and Development','Chandigarh'),
(17,'Security','Bhopal'),
(18,'Public Relations','Patna'),
(19,'Strategy','Coimbatore'),
(20,'Technical Support','Visakhapatnam');



create table Employee(
	empId int primary key,
    empName text,
    salary int,
    deptId int,
    foreign key(deptId) references Department(deptId)
);
INSERT INTO Employee (empId, empName, salary, deptId) VALUES
(101,'Amit Sharma',75000,1),
(102,'Priya Patel',52000,2),
(103,'Rahul Verma',68000,3),
(104,'Krish Iyer',60000,4),
(105,'Karan Mehta',72000,5),
(106,'Neha Kulkarni',85000,1),
(107,'Rohit Singh',65000,7),
(108,'Ananya Reddy',55000,2),
(109,'Vikram Joshi',92000,6),
(110,'Pooja Nair',58000,8),
(111,'Siddharth Gupta',88000,14),
(112,'Meera Desai',73000,3),
(113,'Arjun Kapoor',69000,15),
(114,'Divya Sharma',50000,16),
(115,'Manish Chavan',97000,1),
(116,'Tanvi Bhosale',61000,4),
(117,'Harsh Agarwal',78000,11),
(118,'Ishita Malhotra',56000,18),
(119,'Aditya Rao',83000,19),
(120,'Ritika Jain',62000,10);

-- Get employee with salary greater than average salary.
select empId, empName, salary from Employee where salary > (select avg(salary) from Employee);

-- Find the employees working in the department located in the Hyderabad.
select * from Employee where deptId in(select deptId from Department where deptLoc = "Hyderabad");

-- Employees earning more than any salary in department 10;
select * from Employee where salary > (select max(salary) from Employee where deptId = 10);
select * from Employee where salary > ALL(select salary from Employee where deptId = 10);

-- Employee with department name
select empName, (select deptName from Department d where d.deptId = e.deptId) as DeptName from Employee e;

-- 