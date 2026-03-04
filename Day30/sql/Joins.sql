create database dbtemp;

use dbtemp;

create table Department( deptId int primary key, deptName text, deptLoc text );

create table Employee( empId int primary key, empName text, salary int, deptId int );

INSERT INTO Department (deptId, deptName, deptLoc) VALUES
(1,'IT','Pune'),
(2,'HR','Mumbai'),
(3,'Finance','Delhi'),
(4,'Marketing','Bangalore'),
(5,'Operations','Hyderabad'),
(6,'Sales','Chennai'),
(7,'Legal','Kolkata'),
(8,'Admin','Ahmedabad'),
(9,'Client','Ahmedabad');

INSERT INTO Employee (empId, empName, salary, deptId) VALUES
(101,'Amit Sharma',75000,1),
(102,'Priya Patel',52000,2),
(103,'Rahul Verma',68000,3),
(104,'Sneha Iyer',60000,1),
(105,'Karan Mehta',72000,5),
(106,'Neha Kulkarni',85000,1),
(107,'Rohit Singh',65000,6),
(108,'Ananya Reddy',55000,2),
(109,'Vikram Joshi',92000,16),
(110,'Pooja Nair',58000,4),
(111,'Poasdfoja Nair',58000,12),
(112,'Amflknfit Sharma',75000,11);


-- Inner join
select * from Employee e  inner join Department d  on e.deptId = d.deptId;
select * from Department d inner join  Employee e on e.deptId = d.deptId;

-- Left join
select * from Employee e left join Department d on e.deptId = d.deptId;

-- Right join
select * from Employee e right join Department d on e.deptId = d.deptId;

-- Full join or union
select * from Employee e left join Department d on e.deptId = d.deptId
union
select * from Employee e right join Department d on e.deptId = d.deptId;

-- cross join
select * from Employee e cross join Department d;
