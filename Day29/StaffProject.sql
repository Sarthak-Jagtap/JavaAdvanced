create database StaffDB;
use StaffDB;

drop database Staff;


create table Staff(
	id int primary key auto_increment,
    name text,
    dateOfJoining date,
    salary double
);

SELECT * FROM Staff;