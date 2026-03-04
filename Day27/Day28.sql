

-- Create Database
create database Day28;
show databases;

use Day28;

-- Assume table EMPLOYEE
-- emp_id
-- name
-- dept
-- salary
-- city
-- hire_date

drop table Employee;
create table Employee(
	emp_id int primary key,
    name varchar(70) not null,
    dept varchar(30),
    salary float(2),
    city varchar(50),
    hire_date date
);
describe Employee;

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(1,'Amit Sharma','IT',72000,'Pune','2016-01-12'),
(2,'Priya Patel','HR',48000,'Mumbai','2017-03-18'),
(3,'Rahul Verma','Finance',65000,'Delhi','2018-07-25'),
(4,'Sneha Iyer','Marketing',54000,'Bangalore','2019-09-10'),
(5,'Karan Mehta','Operations',60000,'Hyderabad','2015-11-05'),
(6,'Neha Kulkarni','IT',81000,'Chennai','2020-02-14'),
(7,'Rohit Singh','Finance',70000,'Jaipur','2017-04-21'),
(8,'Ananya Reddy','HR',52000,'Ahmedabad','2021-06-30'),
(9,'Vikram Joshi','IT',90000,'Delhi','2016-08-09'),
(10,'Pooja Nair','Marketing',56000,'Mumbai','2018-12-19'),
(11,'Siddharth Gupta','IT',88000,'Pune','2019-05-16'),
(12,'Meera Desai','Finance',73000,'Surat','2017-02-11'),
(13,'Arjun Kapoor','Operations',64000,'Nagpur','2016-10-28'),
(14,'Divya Sharma','HR',50000,'Bangalore','2015-06-15'),
(15,'Manish Chavan','IT',95000,'Hyderabad','2022-01-05'),
(16,'Tanvi Bhosale','Marketing',59000,'Pune','2018-04-12'),
(17,'Harsh Agarwal','Finance',77000,'Delhi','2019-07-20'),
(18,'Ishita Malhotra','HR',51000,'Mumbai','2020-09-03'),
(19,'Aditya Rao','IT',83000,'Chennai','2017-01-18'),
(20,'Ritika Jain','Operations',62000,'Jaipur','2016-03-25'),
(21,'Nikhil Sinha','IT',91000,'Bangalore','2021-11-14'),
(22,'Kavya Pillai','Marketing',58000,'Hyderabad','2018-05-09'),
(23,'Yash Thakur','Finance',69000,'Ahmedabad','2019-08-17'),
(24,'Shruti Menon','HR',53000,'Pune','2020-12-22'),
(25,'Omkar Patil','IT',87000,'Mumbai','2016-07-30'),
(26,'Aarav Shah','Operations',66000,'Delhi','2017-09-06'),
(27,'Simran Kaur','Marketing',61000,'Chandigarh','2018-11-19'),
(28,'Rajat Bansal','Finance',74000,'Jaipur','2019-02-28'),
(29,'Anushka Shetty','HR',52000,'Bangalore','2020-04-10'),
(30,'Varun Nair','IT',89000,'Chennai','2015-12-15'),
(31,'Krishna Yadav','Operations',63000,'Lucknow','2017-06-21'),
(32,'Palak Arora','Marketing',60000,'Delhi','2018-08-08'),
(33,'Tushar Kulkarni','Finance',71000,'Pune','2019-10-13'),
(34,'Bhavya Mehra','HR',54000,'Mumbai','2021-01-27'),
(35,'Saurabh Mishra','IT',92000,'Hyderabad','2016-02-14'),
(36,'Aishwarya Iyer','Finance',76000,'Chennai','2017-03-18'),
(37,'Rohan Deshmukh','Operations',65000,'Nagpur','2018-05-23'),
(38,'Nandini Rao','Marketing',59000,'Bangalore','2019-07-12'),
(39,'Abhishek Tiwari','IT',85000,'Delhi','2020-09-29'),
(40,'Mitali Shah','HR',51000,'Ahmedabad','2016-11-05'),
(41,'Deepak Verma','Finance',72000,'Jaipur','2017-01-17'),
(42,'Komal Joshi','Marketing',57000,'Pune','2018-03-26'),
(43,'Gaurav Khanna','IT',93000,'Mumbai','2019-06-04'),
(44,'Riya Kapoor','HR',55000,'Delhi','2021-08-16'),
(45,'Mohit Soni','Operations',68000,'Bangalore','2015-10-22'),
(46,'Anjali Patil','Finance',74000,'Hyderabad','2016-12-30'),
(47,'Kunal Malhotra','IT',88000,'Chennai','2017-04-11'),
(48,'Sakshi Gupta','Marketing',60000,'Lucknow','2018-06-19'),
(49,'Pratik Desai','Operations',66000,'Surat','2019-09-07'),
(50,'Isha Sharma','HR',52000,'Pune','2020-11-25'),
(51,'Rakesh Nair','IT',91000,'Mumbai','2016-02-13'),
(52,'Tanmay Kulkarni','Finance',77000,'Delhi','2017-04-29'),
(53,'Kritika Mehta','Marketing',62000,'Ahmedabad','2018-07-14'),
(54,'Vivek Pandey','Operations',69000,'Jaipur','2019-10-01'),
(55,'Sanya Bhatia','HR',54000,'Bangalore','2020-12-18'),
(56,'Ashwin Rao','IT',94000,'Hyderabad','2015-03-27'),
(57,'Pallavi Singh','Finance',75000,'Chennai','2016-05-09'),
(58,'Yuvraj Choudhary','Operations',67000,'Delhi','2017-07-22'),
(59,'Ira Menon','Marketing',61000,'Mumbai','2018-09-30'),
(60,'Lakshya Kapoor','IT',86000,'Pune','2019-11-12'),
(61,'Zoya Ansari','HR',50000,'Lucknow','2020-01-15'),
(62,'Kartik Iyer','Finance',72000,'Bangalore','2016-03-18'),
(63,'Ridhima Jain','Marketing',58000,'Hyderabad','2017-05-24'),
(64,'Aman Verma','Operations',64000,'Jaipur','2018-08-03'),
(65,'Diya Nair','IT',90000,'Chennai','2019-10-17'),
(66,'Harshit Gupta','Finance',76000,'Delhi','2020-12-02'),
(67,'Navya Reddy','HR',53000,'Pune','2016-02-19'),
(68,'Tejas Patil','IT',87000,'Mumbai','2017-04-08'),
(69,'Muskan Shah','Marketing',60000,'Ahmedabad','2018-06-26'),
(70,'Rohit Bansal','Operations',68000,'Nagpur','2019-09-15'),
(71,'Snehal Kulkarni','Finance',71000,'Pune','2020-11-21'),
(72,'Aditya Singh','IT',92000,'Delhi','2015-01-30'),
(73,'Shreya Pillai','HR',52000,'Chennai','2016-03-14'),
(74,'Nitin Yadav','Operations',65000,'Lucknow','2017-05-09'),
(75,'Bhakti Deshmukh','Marketing',59000,'Mumbai','2018-07-28'),
(76,'Rohan Mehta','IT',88000,'Ahmedabad','2019-09-18'),
(77,'Anushree Sharma','Finance',74000,'Bangalore','2020-12-05'),
(78,'Siddhant Jain','Operations',67000,'Jaipur','2016-02-22'),
(79,'Mansi Kapoor','HR',55000,'Delhi','2017-04-16'),
(80,'Aakash Verma','IT',91000,'Hyderabad','2018-06-11'),
(81,'Prerna Gupta','Marketing',60000,'Pune','2019-08-25'),
(82,'Rahul Desai','Finance',73000,'Mumbai','2020-10-13'),
(83,'Kavita Nair','HR',51000,'Chennai','2016-12-29'),
(84,'Arnav Malhotra','IT',94000,'Bangalore','2017-03-07'),
(85,'Nisha Patil','Operations',66000,'Nagpur','2018-05-21'),
(86,'Devansh Shah','Finance',78000,'Ahmedabad','2019-07-09'),
(87,'Ritika Sinha','Marketing',62000,'Delhi','2020-09-14'),
(88,'Manav Kulkarni','IT',87000,'Pune','2016-11-03'),
(89,'Poonam Iyer','HR',54000,'Hyderabad','2017-01-19'),
(90,'Aryan Thakur','Operations',69000,'Jaipur','2018-04-27'),
(91,'Saloni Mehta','Finance',75000,'Mumbai','2019-06-18'),
(92,'Dhruv Sharma','IT',92000,'Delhi','2020-08-08'),
(93,'Trisha Rao','Marketing',61000,'Bangalore','2016-10-24'),
(94,'Keshav Gupta','Finance',77000,'Chennai','2017-12-13'),
(95,'Rhea Kapoor','HR',52000,'Pune','2018-02-20'),
(96,'Abhinav Joshi','IT',89000,'Ahmedabad','2019-05-04'),
(97,'Tanya Singh','Operations',66000,'Lucknow','2020-07-22'),
(98,'Jay Mehra','Marketing',60000,'Mumbai','2016-09-17'),
(99,'Ishaan Reddy','Finance',72000,'Hyderabad','2017-11-11'),
(100,'Shivani Bhatia','HR',53000,'Delhi','2018-01-29');

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(101,'Akshay Patil','IT',87000,'Pune','2019-03-12'),
(102,'Nikita Sharma','HR',52000,'Mumbai','2018-06-18'),
(103,'Ritesh Verma','Finance',74000,'Delhi','2017-09-25'),
(104,'Swati Iyer','Marketing',61000,'Bangalore','2020-11-10'),
(105,'Chirag Mehta','Operations',68000,'Hyderabad','2016-01-05'),
(106,'Neeraj Kulkarni','IT',92000,'Chennai','2021-04-14'),
(107,'Payal Singh','Finance',76000,'Jaipur','2018-07-21'),
(108,'Arpita Reddy','HR',54000,'Ahmedabad','2019-10-30'),
(109,'Vishal Joshi','IT',95000,'Delhi','2017-02-09'),
(110,'Kritika Nair','Marketing',60000,'Mumbai','2020-05-19'),
(111,'Sandeep Gupta','IT',89000,'Pune','2018-08-16'),
(112,'Lavanya Desai','Finance',72000,'Surat','2016-03-11'),
(113,'Raghav Kapoor','Operations',65000,'Nagpur','2019-12-28'),
(114,'Ishika Sharma','HR',51000,'Bangalore','2017-06-15'),
(115,'Pranay Chavan','IT',97000,'Hyderabad','2022-02-05'),
(116,'Tanisha Bhosale','Marketing',63000,'Pune','2019-01-12'),
(117,'Harshita Agarwal','Finance',78000,'Delhi','2018-04-20'),
(118,'Ishan Malhotra','HR',55000,'Mumbai','2021-09-03'),
(119,'Adarsh Rao','IT',84000,'Chennai','2017-03-18'),
(120,'Ruchi Jain','Operations',69000,'Jaipur','2016-05-25'),
(121,'Naveen Sinha','IT',91000,'Bangalore','2020-12-14'),
(122,'Keerthi Pillai','Marketing',62000,'Hyderabad','2019-07-09'),
(123,'Yatin Thakur','Finance',73000,'Ahmedabad','2018-10-17'),
(124,'Smita Menon','HR',53000,'Pune','2021-01-22'),
(125,'Om Prakash Patil','IT',88000,'Mumbai','2016-06-30'),
(126,'Aarushi Shah','Operations',67000,'Delhi','2017-08-06'),
(127,'Simarjeet Kaur','Marketing',64000,'Chandigarh','2019-11-19'),
(128,'Rohan Bansal','Finance',76000,'Jaipur','2018-02-28'),
(129,'Anita Shetty','HR',52000,'Bangalore','2020-03-10'),
(130,'Varsha Nair','IT',93000,'Chennai','2015-12-15'),
(131,'Krunal Yadav','Operations',66000,'Lucknow','2017-04-21'),
(132,'Palvi Arora','Marketing',61000,'Delhi','2018-09-08'),
(133,'Tapan Kulkarni','Finance',75000,'Pune','2019-12-13'),
(134,'Bhavna Mehra','HR',56000,'Mumbai','2021-02-27'),
(135,'Saurav Mishra','IT',96000,'Hyderabad','2016-03-14'),
(136,'Aarti Iyer','Finance',79000,'Chennai','2017-04-18'),
(137,'Rohini Deshmukh','Operations',68000,'Nagpur','2018-06-23'),
(138,'Nikhita Rao','Marketing',62000,'Bangalore','2019-08-12'),
(139,'Abhay Tiwari','IT',87000,'Delhi','2020-10-29'),
(140,'Minal Shah','HR',54000,'Ahmedabad','2016-12-05'),
(141,'Deepali Verma','Finance',74000,'Jaipur','2017-02-17'),
(142,'Komalika Joshi','Marketing',59000,'Pune','2018-05-26'),
(143,'Gagan Khanna','IT',94000,'Mumbai','2019-07-04'),
(144,'Ritika Kapoor','HR',57000,'Delhi','2021-09-16'),
(145,'Mohan Soni','Operations',70000,'Bangalore','2015-11-22'),
(146,'Anvi Patil','Finance',76000,'Hyderabad','2016-12-30'),
(147,'Karan Malhotra','IT',91000,'Chennai','2017-03-11'),
(148,'Sakina Gupta','Marketing',63000,'Lucknow','2018-06-19'),
(149,'Pranav Desai','Operations',69000,'Surat','2019-08-07'),
(150,'Ila Sharma','HR',55000,'Pune','2020-11-25'),
(151,'Rajesh Nair','IT',92000,'Mumbai','2016-01-13'),
(152,'Tanushree Kulkarni','Finance',78000,'Delhi','2017-03-29'),
(153,'Kiran Mehta','Marketing',65000,'Ahmedabad','2018-06-14'),
(154,'Vikas Pandey','Operations',71000,'Jaipur','2019-09-01'),
(155,'Sonal Bhatia','HR',56000,'Bangalore','2020-11-18'),
(156,'Ashish Rao','IT',97000,'Hyderabad','2015-04-27'),
(157,'Pooja Singh','Finance',77000,'Chennai','2016-06-09'),
(158,'Yogesh Choudhary','Operations',68000,'Delhi','2017-07-22'),
(159,'Ina Menon','Marketing',64000,'Mumbai','2018-10-30'),
(160,'Lakshmi Kapoor','IT',89000,'Pune','2019-12-12'),
(161,'Zubair Ansari','HR',51000,'Lucknow','2020-02-15'),
(162,'Karthik Iyer','Finance',74000,'Bangalore','2016-04-18'),
(163,'Ritika Jain','Marketing',60000,'Hyderabad','2017-06-24'),
(164,'Amar Verma','Operations',67000,'Jaipur','2018-09-03'),
(165,'Divyanshi Nair','IT',94000,'Chennai','2019-11-17'),
(166,'Harendra Gupta','Finance',79000,'Delhi','2020-12-02'),
(167,'Navneet Reddy','HR',54000,'Pune','2016-03-19'),
(168,'Tejal Patil','IT',88000,'Mumbai','2017-05-08'),
(169,'Muskhan Shah','Marketing',62000,'Ahmedabad','2018-07-26'),
(170,'Rohini Bansal','Operations',70000,'Nagpur','2019-10-15'),
(171,'Sneha Kulkarni','Finance',75000,'Pune','2020-12-21'),
(172,'Adarsh Singh','IT',96000,'Delhi','2015-02-28'),
(173,'Shweta Pillai','HR',53000,'Chennai','2016-04-14'),
(174,'Nitin Kumar Yadav','Operations',66000,'Lucknow','2017-06-09'),
(175,'Bhavika Deshmukh','Marketing',61000,'Mumbai','2018-08-28'),
(176,'Raghav Mehta','IT',91000,'Ahmedabad','2019-10-18'),
(177,'Anupriya Sharma','Finance',78000,'Bangalore','2020-12-05'),
(178,'Siddharth Jain','Operations',69000,'Jaipur','2016-03-22'),
(179,'Mansi Verma','HR',56000,'Delhi','2017-05-16'),
(180,'Akhil Sharma','IT',93000,'Hyderabad','2018-07-11'),
(181,'Pranjal Gupta','Marketing',64000,'Pune','2019-09-25'),
(182,'Rahul Deshmukh','Finance',75000,'Mumbai','2020-11-13'),
(183,'Kavya Nair','HR',52000,'Chennai','2016-01-29'),
(184,'Arnav Malpani','IT',97000,'Bangalore','2017-04-07'),
(185,'Nidhi Patil','Operations',67000,'Nagpur','2018-06-21'),
(186,'Devendra Shah','Finance',80000,'Ahmedabad','2019-08-09'),
(187,'Ritu Sinha','Marketing',65000,'Delhi','2020-10-14'),
(188,'Manoj Kulkarni','IT',89000,'Pune','2016-12-03'),
(189,'Poonam Iyer','HR',55000,'Hyderabad','2017-02-19'),
(190,'Aryaman Thakur','Operations',72000,'Jaipur','2018-05-27'),
(191,'Salman Mehta','Finance',76000,'Mumbai','2019-07-18'),
(192,'Dhruvi Sharma','IT',95000,'Delhi','2020-09-08'),
(193,'Trishita Rao','Marketing',62000,'Bangalore','2016-11-24'),
(194,'Keshav Gupta','Finance',78000,'Chennai','2017-12-13'),
(195,'Rhea Kapoor','HR',54000,'Pune','2018-02-20'),
(196,'Abhinandan Joshi','IT',91000,'Ahmedabad','2019-05-04'),
(197,'Tanmay Singh','Operations',69000,'Lucknow','2020-07-22'),
(198,'Jayant Mehra','Marketing',64000,'Mumbai','2016-09-17'),
(199,'Ishwar Reddy','Finance',75000,'Hyderabad','2017-11-11'),
(200,'Shalini Bhatia','HR',56000,'Delhi','2018-01-29');

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(201,'Alok Tripathi','IT',88000,'Pune','2017-02-14'),
(202,'Bhavana Joshi','HR',54000,'Mumbai','2018-04-18'),
(203,'Chetan Rao','Finance',76000,'Delhi','2019-06-25'),
(204,'Diksha Menon','Marketing',62000,'Bangalore','2020-08-10'),
(205,'Eshan Kulkarni','Operations',69000,'Hyderabad','2016-10-05'),
(206,'Farhan Qureshi','IT',94000,'Chennai','2021-01-14'),
(207,'Gauri Deshpande','Finance',78000,'Jaipur','2018-03-21'),
(208,'Hemant Batra','HR',56000,'Ahmedabad','2019-05-30'),
(209,'Irfan Sheikh','IT',97000,'Delhi','2017-07-09'),
(210,'Jhanvi Kapoor','Marketing',64000,'Mumbai','2020-09-19'),
(211,'Kamal Arora','IT',91000,'Pune','2018-11-16'),
(212,'Leena Thomas','Finance',75000,'Surat','2016-02-11'),
(213,'Mayank Goyal','Operations',70000,'Nagpur','2019-12-28'),
(214,'Nazia Khan','HR',55000,'Bangalore','2017-05-15'),
(215,'Ojas Kulshrestha','IT',99000,'Hyderabad','2022-03-05'),
(216,'Parul Saxena','Marketing',66000,'Pune','2019-01-12'),
(217,'Qamar Siddiqui','Finance',80000,'Delhi','2018-04-20'),
(218,'Rupal Shah','HR',57000,'Mumbai','2021-06-03'),
(219,'Sameer Chatterjee','IT',86000,'Chennai','2017-03-18'),
(220,'Tanush Gupta','Operations',72000,'Jaipur','2016-05-25'),
(221,'Uday Pratap','IT',93000,'Bangalore','2020-10-14'),
(222,'Vaishnavi Iyer','Marketing',65000,'Hyderabad','2019-07-09'),
(223,'Wasim Ali','Finance',77000,'Ahmedabad','2018-10-17'),
(224,'Xenia Dsouza','HR',54000,'Pune','2021-02-22'),
(225,'Yogita Kulkarni','IT',90000,'Mumbai','2016-06-30'),
(226,'Zeeshan Mirza','Operations',71000,'Delhi','2017-08-06'),
(227,'Aniket Salvi','Marketing',68000,'Chandigarh','2019-11-19'),
(228,'Brinda Nambiar','Finance',79000,'Jaipur','2018-02-28'),
(229,'Charanpreet Singh','HR',56000,'Bangalore','2020-03-10'),
(230,'Darshan Solanki','IT',95000,'Chennai','2015-12-15'),
(231,'Ekta Tandon','Operations',70000,'Lucknow','2017-04-21'),
(232,'Falguni Parekh','Marketing',67000,'Delhi','2018-09-08'),
(233,'Gokul Krishnan','Finance',78000,'Pune','2019-12-13'),
(234,'Harleen Kaur','HR',58000,'Mumbai','2021-03-27'),
(235,'Imran Pathan','IT',98000,'Hyderabad','2016-04-14'),
(236,'Juhi Trivedi','Finance',81000,'Chennai','2017-05-18'),
(237,'Keshav Nanda','Operations',72000,'Nagpur','2018-07-23'),
(238,'Lata Mahajan','Marketing',66000,'Bangalore','2019-08-12'),
(239,'Manan Bhatt','IT',89000,'Delhi','2020-10-29'),
(240,'Niharika Talwar','HR',56000,'Ahmedabad','2016-12-05'),
(241,'Onkar Jadhav','Finance',76000,'Jaipur','2017-02-17'),
(242,'Prisha Sethi','Marketing',69000,'Pune','2018-05-26'),
(243,'Raghunath Pillai','IT',97000,'Mumbai','2019-07-04'),
(244,'Saba Rizvi','HR',59000,'Delhi','2021-09-16'),
(245,'Teerth Modi','Operations',73000,'Bangalore','2015-11-22'),
(246,'Urvashi Naidu','Finance',80000,'Hyderabad','2016-12-30'),
(247,'Vineet Bhatia','IT',92000,'Chennai','2017-03-11'),
(248,'Wahid Khan','Marketing',67000,'Lucknow','2018-06-19'),
(249,'Yamini Rawat','Operations',71000,'Surat','2019-08-07'),
(250,'Zara Contractor','HR',58000,'Pune','2020-11-25'),
(251,'Abeer Mathew','IT',93000,'Mumbai','2016-01-13'),
(252,'Bhupendra Rathore','Finance',79000,'Delhi','2017-03-29'),
(253,'Chaitali Bose','Marketing',70000,'Ahmedabad','2018-06-14'),
(254,'Devika Purohit','Operations',74000,'Jaipur','2019-09-01'),
(255,'Eklavya Sharma','HR',56000,'Bangalore','2020-11-18'),
(256,'Faiza Rahman','IT',99000,'Hyderabad','2015-04-27'),
(257,'Girish Hegde','Finance',81000,'Chennai','2016-06-09'),
(258,'Harsh Vardhan','Operations',72000,'Delhi','2017-07-22'),
(259,'Indira Mukherjee','Marketing',68000,'Mumbai','2018-10-30'),
(260,'Jatin Oberoi','IT',91000,'Pune','2019-12-12'),
(261,'Kritesh Anand','HR',55000,'Lucknow','2020-02-15'),
(262,'Lakshmi Narayanan','Finance',77000,'Bangalore','2016-04-18'),
(263,'Mubeen Ahmed','Marketing',65000,'Hyderabad','2017-06-24'),
(264,'Nakul Grover','Operations',70000,'Jaipur','2018-09-03'),
(265,'Oindrila Sen','IT',96000,'Chennai','2019-11-17'),
(266,'Pritam Das','Finance',80000,'Delhi','2020-12-02'),
(267,'Qudrat Ali','HR',57000,'Pune','2016-03-19'),
(268,'Ramanjeet Kaur','IT',89000,'Mumbai','2017-05-08'),
(269,'Shashank Tyagi','Marketing',67000,'Ahmedabad','2018-07-26'),
(270,'Tanaya Kulshrestha','Operations',72000,'Nagpur','2019-10-15'),
(271,'Umesh Patwardhan','Finance',76000,'Pune','2020-12-21'),
(272,'Vasudha Ghosh','IT',94000,'Delhi','2015-02-28'),
(273,'Wasika Banerjee','HR',54000,'Chennai','2016-04-14'),
(274,'Yashraj Chauhan','Operations',69000,'Lucknow','2017-06-09'),
(275,'Zubin Engineer','Marketing',66000,'Mumbai','2018-08-28'),
(276,'Anmol Duggal','IT',92000,'Ahmedabad','2019-10-18'),
(277,'Bhavik Parekh','Finance',79000,'Bangalore','2020-12-05'),
(278,'Chandni Arora','Operations',71000,'Jaipur','2016-03-22'),
(279,'Darshil Mehta','HR',58000,'Delhi','2017-05-16'),
(280,'Eesha Chawla','IT',95000,'Hyderabad','2018-07-11'),
(281,'Feroz Alam','Marketing',69000,'Pune','2019-09-25'),
(282,'Gautami Patnaik','Finance',78000,'Mumbai','2020-11-13'),
(283,'Himanshu Luthra','HR',55000,'Chennai','2016-01-29'),
(284,'Ipsita Roy','IT',98000,'Bangalore','2017-04-07'),
(285,'Jagdish Suryavanshi','Operations',72000,'Nagpur','2018-06-21'),
(286,'Kashish Malhotra','Finance',82000,'Ahmedabad','2019-08-09'),
(287,'Lokesh Bhandari','Marketing',67000,'Delhi','2020-10-14'),
(288,'Mahira Siddiqui','IT',90000,'Pune','2016-12-03'),
(289,'Nirav Bhavsar','HR',56000,'Hyderabad','2017-02-19'),
(290,'Ojaswini Naik','Operations',73000,'Jaipur','2018-05-27'),
(291,'Pranesh Iyer','Finance',77000,'Mumbai','2019-07-18'),
(292,'Qasim Raza','IT',96000,'Delhi','2020-09-08'),
(293,'Ritika Ahuja','Marketing',65000,'Bangalore','2016-11-24'),
(294,'Soham Kulshreshtha','Finance',80000,'Chennai','2017-12-13'),
(295,'Tara Bhagat','HR',57000,'Pune','2018-02-20'),
(296,'Utkarsh Pandya','IT',91000,'Ahmedabad','2019-05-04'),
(297,'Vaidehi Apte','Operations',70000,'Lucknow','2020-07-22'),
(298,'Waseem Farooqui','Marketing',68000,'Mumbai','2016-09-17'),
(299,'Yuvika Talreja','Finance',76000,'Hyderabad','2017-11-11'),
(300,'Zainab Shaikh','HR',58000,'Delhi','2018-01-29');

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(301,'Aaditya Kulshreshtha','IT',93000,'Pune','2017-03-14'),
(302,'Bhavini Trivedi','HR',56000,'Mumbai','2018-05-18'),
(303,'Chirantan Das','Finance',79000,'Delhi','2019-07-25'),
(304,'Devyani Shelar','Marketing',67000,'Bangalore','2020-09-10'),
(305,'Eshwar Prasad','Operations',72000,'Hyderabad','2016-11-05'),
(306,'Fathima Noor','IT',98000,'Chennai','2021-02-14'),
(307,'Gauransh Kapoor','Finance',81000,'Jaipur','2018-04-21'),
(308,'Hiral Vora','HR',59000,'Ahmedabad','2019-06-30'),
(309,'Ilaa Bhattacharya','IT',96000,'Delhi','2017-08-09'),
(310,'Jivesh Sharma','Marketing',69000,'Mumbai','2020-10-19'),
(311,'Kairavi Deshpande','IT',92000,'Pune','2018-12-16'),
(312,'Lalit Mohanty','Finance',77000,'Surat','2016-03-11'),
(313,'Meghna Rawal','Operations',73000,'Nagpur','2019-01-28'),
(314,'Nilesh Chitre','HR',57000,'Bangalore','2017-07-15'),
(315,'Oorja Parikh','IT',99000,'Hyderabad','2022-04-05'),
(316,'Pradyumna Nair','Marketing',70000,'Pune','2019-02-12'),
(317,'Quratulain Khan','Finance',82000,'Delhi','2018-05-20'),
(318,'Rishabh Talwar','HR',60000,'Mumbai','2021-07-03'),
(319,'Saanvi Kamat','IT',88000,'Chennai','2017-04-18'),
(320,'Tathagat Bose','Operations',74000,'Jaipur','2016-06-25'),
(321,'Ujjwal Rathod','IT',94000,'Bangalore','2020-11-14'),
(322,'Vineesha Pillai','Marketing',71000,'Hyderabad','2019-08-09'),
(323,'Waris Siddiqui','Finance',80000,'Ahmedabad','2018-11-17'),
(324,'Yashika Mehra','HR',58000,'Pune','2021-03-22'),
(325,'Zubin Choksi','IT',91000,'Mumbai','2016-07-30'),
(326,'Aakriti Shukla','Operations',75000,'Delhi','2017-09-06'),
(327,'Bhaskar Raut','Marketing',69000,'Chandigarh','2019-12-19'),
(328,'Chandrika Pillai','Finance',82000,'Jaipur','2018-03-28'),
(329,'Darshit Parekh','HR',60000,'Bangalore','2020-04-10'),
(330,'Eira Mathew','IT',97000,'Chennai','2015-12-15'),
(331,'Faraz Khan','Operations',72000,'Lucknow','2017-05-21'),
(332,'Gitanjali Patankar','Marketing',68000,'Delhi','2018-10-08'),
(333,'Hriday Malhotra','Finance',81000,'Pune','2019-12-13'),
(334,'Ishaani Kulkarni','HR',59000,'Mumbai','2021-04-27'),
(335,'Jahanvi Rane','IT',98000,'Hyderabad','2016-05-14'),
(336,'Kartikeya Iyer','Finance',83000,'Chennai','2017-06-18'),
(337,'Liyana Dsouza','Operations',75000,'Nagpur','2018-08-23'),
(338,'Mihir Lodha','Marketing',71000,'Bangalore','2019-09-12'),
(339,'Nimisha Goyal','IT',93000,'Delhi','2020-11-29'),
(340,'Owais Merchant','HR',60000,'Ahmedabad','2016-12-05'),
(341,'Prisha Bendre','Finance',79000,'Jaipur','2017-03-17'),
(342,'Qaisar Ahmed','Marketing',72000,'Pune','2018-06-26'),
(343,'Raghavi Srinivasan','IT',97000,'Mumbai','2019-08-04'),
(344,'Samarjeet Singh','HR',62000,'Delhi','2021-10-16'),
(345,'Tanirika Shah','Operations',76000,'Bangalore','2015-11-22'),
(346,'Urvil Pandya','Finance',84000,'Hyderabad','2016-12-30'),
(347,'Vaibhavi Kulshreshtha','IT',91000,'Chennai','2017-04-11'),
(348,'Waseeka Khan','Marketing',69000,'Lucknow','2018-07-19'),
(349,'Yatin Parekh','Operations',74000,'Surat','2019-09-07'),
(350,'Zahra Contractor','HR',60000,'Pune','2020-12-25'),
(351,'Aviral Tiwari','IT',94000,'Mumbai','2016-02-13'),
(352,'Bhoomi Mistry','Finance',81000,'Delhi','2017-04-29'),
(353,'Charvi Anand','Marketing',73000,'Ahmedabad','2018-07-14'),
(354,'Devraj Shetty','Operations',78000,'Jaipur','2019-10-01'),
(355,'Eshita Chandra','HR',59000,'Bangalore','2020-12-18'),
(356,'Firoz Alam','IT',99000,'Hyderabad','2015-05-27'),
(357,'Gautam Bhardwaj','Finance',83000,'Chennai','2016-07-09'),
(358,'Himani Kothari','Operations',75000,'Delhi','2017-08-22'),
(359,'Ibrahim Shaikh','Marketing',71000,'Mumbai','2018-11-30'),
(360,'Jasleen Sandhu','IT',92000,'Pune','2019-12-12'),
(361,'Kanishka Soni','HR',57000,'Lucknow','2020-03-15'),
(362,'Lakshman Rao','Finance',79000,'Bangalore','2016-05-18'),
(363,'Mrunal Thakur','Marketing',72000,'Hyderabad','2017-07-24'),
(364,'Nakul Mehra','Operations',76000,'Jaipur','2018-10-03'),
(365,'Oindrila Dutta','IT',96000,'Chennai','2019-12-17'),
(366,'Parthiv Shah','Finance',82000,'Delhi','2020-12-02'),
(367,'Qamar Abbas','HR',60000,'Pune','2016-04-19'),
(368,'Riddhima Arora','IT',91000,'Mumbai','2017-06-08'),
(369,'Suhani Deshpande','Marketing',70000,'Ahmedabad','2018-08-26'),
(370,'Tanmoy Roy','Operations',75000,'Nagpur','2019-11-15'),
(371,'Udayan Bhatt','Finance',78000,'Pune','2020-12-21'),
(372,'Vartika Nair','IT',95000,'Delhi','2015-03-28'),
(373,'Wasim Qadri','HR',58000,'Chennai','2016-05-14'),
(374,'Yashvardhan Singh','Operations',73000,'Lucknow','2017-07-09'),
(375,'Zinal Patel','Marketing',69000,'Mumbai','2018-09-28'),
(376,'Anvay Joshi','IT',94000,'Ahmedabad','2019-11-18'),
(377,'Bhumi Kaul','Finance',82000,'Bangalore','2020-12-05'),
(378,'Chirayu Mehta','Operations',76000,'Jaipur','2016-04-22'),
(379,'Devika Awasthi','HR',61000,'Delhi','2017-06-16'),
(380,'Eshan Arvind','IT',98000,'Hyderabad','2018-08-11'),
(381,'Farheen Ali','Marketing',72000,'Pune','2019-10-25'),
(382,'Girish Chawla','Finance',81000,'Mumbai','2020-12-13'),
(383,'Hema Raghavan','HR',58000,'Chennai','2016-02-19'),
(384,'Ivaan Sehgal','IT',99000,'Bangalore','2017-05-07'),
(385,'Jhanak Suri','Operations',75000,'Nagpur','2018-07-21'),
(386,'Kiaan Merchant','Finance',83000,'Ahmedabad','2019-09-09'),
(387,'Lavisha Arora','Marketing',71000,'Delhi','2020-11-14'),
(388,'Mansoor Ali','IT',92000,'Pune','2016-12-03'),
(389,'Naveli Desai','HR',60000,'Hyderabad','2017-03-19'),
(390,'Ojas Bedi','Operations',77000,'Jaipur','2018-06-27'),
(391,'Prakriti Iyer','Finance',80000,'Mumbai','2019-08-18'),
(392,'Qudsiya Rahman','IT',96000,'Delhi','2020-10-08'),
(393,'Riaan Kapoor','Marketing',73000,'Bangalore','2016-12-24'),
(394,'Saanjh Bhatia','Finance',82000,'Chennai','2017-12-13'),
(395,'Tisha Pandey','HR',59000,'Pune','2018-03-20'),
(396,'Udit Wagh','IT',91000,'Ahmedabad','2019-06-04'),
(397,'Vihana Reddy','Operations',76000,'Lucknow','2020-08-22'),
(398,'Wahid Sheikh','Marketing',70000,'Mumbai','2016-10-17'),
(399,'Yuvansh Sethi','Finance',79000,'Hyderabad','2017-12-11'),
(400,'Zoya Bhardwaj','HR',62000,'Delhi','2018-02-28');

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(401,'Aaryan Kulkarni','IT',95000,'Pune','2017-04-12'),
(402,'Binal Shah','HR',61000,'Mumbai','2018-06-18'),
(403,'Chaitanya Rao','Finance',82000,'Delhi','2019-08-25'),
(404,'Disha Menon','Marketing',72000,'Bangalore','2020-10-10'),
(405,'Eklavya Singh','Operations',77000,'Hyderabad','2016-12-05'),
(406,'Farida Khan','IT',99000,'Chennai','2021-03-14'),
(407,'Gautami Kulkarni','Finance',84000,'Jaipur','2018-05-21'),
(408,'Harshil Mehta','HR',62000,'Ahmedabad','2019-07-30'),
(409,'Ira Bansal','IT',97000,'Delhi','2017-09-09'),
(410,'Jatin Choudhary','Marketing',73000,'Mumbai','2020-11-19'),
(411,'Kavish Kapoor','IT',94000,'Pune','2018-01-16'),
(412,'Lavanya Iyer','Finance',81000,'Surat','2016-03-11'),
(413,'Madhav Tiwari','Operations',76000,'Nagpur','2019-02-28'),
(414,'Nandita Pillai','HR',60000,'Bangalore','2017-07-15'),
(415,'Omkar Deshpande','IT',99000,'Hyderabad','2022-05-05'),
(416,'Prerna Shah','Marketing',75000,'Pune','2019-03-12'),
(417,'Qasim Ali','Finance',83000,'Delhi','2018-06-20'),
(418,'Rachit Verma','HR',64000,'Mumbai','2021-08-03'),
(419,'Sakshi Nair','IT',91000,'Chennai','2017-05-18'),
(420,'Tanishq Jain','Operations',78000,'Jaipur','2016-07-25'),
(421,'Urvashi Kulkarni','IT',96000,'Bangalore','2020-12-14'),
(422,'Varad Patil','Marketing',74000,'Hyderabad','2019-09-09'),
(423,'Wasifa Sheikh','Finance',82000,'Ahmedabad','2018-12-17'),
(424,'Yogeshwari Rao','HR',63000,'Pune','2021-04-22'),
(425,'Zaid Merchant','IT',95000,'Mumbai','2016-08-30'),
(426,'Aishani Ghosh','Operations',77000,'Delhi','2017-10-06'),
(427,'Bhavesh Reddy','Marketing',71000,'Chandigarh','2019-12-19'),
(428,'Charu Sharma','Finance',84000,'Jaipur','2018-04-28'),
(429,'Darshana Vora','HR',65000,'Bangalore','2020-05-10'),
(430,'Ehan Kapoor','IT',98000,'Chennai','2015-12-15'),
(431,'Falak Siddiqui','Operations',76000,'Lucknow','2017-06-21'),
(432,'Girish Nayak','Marketing',72000,'Delhi','2018-11-08'),
(433,'Himani Shah','Finance',83000,'Pune','2019-12-13'),
(434,'Iva Mehra','HR',62000,'Mumbai','2021-05-27'),
(435,'Jayesh Solanki','IT',99000,'Hyderabad','2016-06-14'),
(436,'Khushi Bhatia','Finance',85000,'Chennai','2017-07-18'),
(437,'Lakshit Arora','Operations',78000,'Nagpur','2018-09-23'),
(438,'Meenal Jain','Marketing',73000,'Bangalore','2019-10-12'),
(439,'Niranjan Rao','IT',95000,'Delhi','2020-12-29'),
(440,'Ojasvi Desai','HR',64000,'Ahmedabad','2016-12-05'),
(441,'Pankaj Suri','Finance',82000,'Jaipur','2017-04-17'),
(442,'Qudrat Singh','Marketing',75000,'Pune','2018-07-26'),
(443,'Ritika Malhotra','IT',97000,'Mumbai','2019-09-04'),
(444,'Siddhi Patel','HR',66000,'Delhi','2021-11-16'),
(445,'Tanmay Kulshrestha','Operations',79000,'Bangalore','2015-11-22'),
(446,'Uday Shetty','Finance',86000,'Hyderabad','2016-12-30'),
(447,'Vandana Iyer','IT',92000,'Chennai','2017-05-11'),
(448,'Waris Khan','Marketing',74000,'Lucknow','2018-08-19'),
(449,'Yashika Parekh','Operations',77000,'Surat','2019-10-07'),
(450,'Zara Siddiqui','HR',65000,'Pune','2020-12-25'),
(451,'Amitabh Joshi','IT',96000,'Mumbai','2016-03-13'),
(452,'Bhavna Choudhary','Finance',84000,'Delhi','2017-05-29'),
(453,'Chirag Patel','Marketing',76000,'Ahmedabad','2018-08-14'),
(454,'Deepika Rane','Operations',80000,'Jaipur','2019-11-01'),
(455,'Eshaan Mehta','HR',63000,'Bangalore','2020-12-18'),
(456,'Fariha Ansari','IT',99000,'Hyderabad','2015-06-27'),
(457,'Gaurav Pillai','Finance',87000,'Chennai','2016-08-09'),
(458,'Harini Krishnan','Operations',78000,'Delhi','2017-09-22'),
(459,'Irfan Shaikh','Marketing',75000,'Mumbai','2018-12-30'),
(460,'Jinal Vora','IT',94000,'Pune','2019-12-12'),
(461,'Ketan Deshmukh','HR',61000,'Lucknow','2020-04-15'),
(462,'Lisha Fernandes','Finance',82000,'Bangalore','2016-06-18'),
(463,'Manan Tandon','Marketing',76000,'Hyderabad','2017-08-24'),
(464,'Nisha Iyer','Operations',79000,'Jaipur','2018-11-03'),
(465,'Omkar Bhatt','IT',98000,'Chennai','2019-12-17'),
(466,'Paridhi Shah','Finance',85000,'Delhi','2020-12-02'),
(467,'Qais Ahmed','HR',64000,'Pune','2016-05-19'),
(468,'Rishika Soni','IT',93000,'Mumbai','2017-07-08'),
(469,'Samar Jain','Marketing',77000,'Ahmedabad','2018-09-26'),
(470,'Tanvi Kulkarni','Operations',80000,'Nagpur','2019-12-15'),
(471,'Uday Kulshreshtha','Finance',83000,'Pune','2020-12-21'),
(472,'Vaishali Rao','IT',97000,'Delhi','2015-04-28'),
(473,'Wasim Shaikh','HR',65000,'Chennai','2016-06-14'),
(474,'Yuvraj Malhotra','Operations',78000,'Lucknow','2017-08-09'),
(475,'Zinal Shah','Marketing',74000,'Mumbai','2018-10-28'),
(476,'Aadit Suri','IT',95000,'Ahmedabad','2019-12-18'),
(477,'Bhavika Trivedi','Finance',86000,'Bangalore','2020-12-05'),
(478,'Chirag Kulkarni','Operations',80000,'Jaipur','2016-05-22'),
(479,'Devanshi Patel','HR',66000,'Delhi','2017-07-16'),
(480,'Eshan Nair','IT',99000,'Hyderabad','2018-09-11'),
(481,'Farheen Khan','Marketing',76000,'Pune','2019-11-25'),
(482,'Gautam Sharma','Finance',84000,'Mumbai','2020-12-13'),
(483,'Hiral Mehta','HR',62000,'Chennai','2016-03-19'),
(484,'Ivaan Desai','IT',98000,'Bangalore','2017-06-07'),
(485,'Jhanvi Kapoor','Operations',79000,'Nagpur','2018-08-21'),
(486,'Kiaan Shah','Finance',87000,'Ahmedabad','2019-10-09'),
(487,'Lavanya Nair','Marketing',75000,'Delhi','2020-12-14'),
(488,'Mohit Kulkarni','IT',94000,'Pune','2016-12-03'),
(489,'Nirali Patel','HR',63000,'Hyderabad','2017-04-19'),
(490,'Ojas Singh','Operations',81000,'Jaipur','2018-07-27'),
(491,'Pranav Shah','Finance',85000,'Mumbai','2019-09-18'),
(492,'Qudsia Rahman','IT',99000,'Delhi','2020-10-08'),
(493,'Rohan Iyer','Marketing',77000,'Bangalore','2016-12-24'),
(494,'Sanya Kapoor','Finance',82000,'Chennai','2017-12-13'),
(495,'Tanisha Gupta','HR',65000,'Pune','2018-03-20'),
(496,'Utkarsh Mehta','IT',96000,'Ahmedabad','2019-06-04'),
(497,'Viveka Reddy','Operations',80000,'Lucknow','2020-08-22'),
(498,'Wajid Ali','Marketing',76000,'Mumbai','2016-10-17'),
(499,'Yash Deshpande','Finance',84000,'Hyderabad','2017-12-11'),
(500,'Zoya Naira','HR',null,'Delhi','2018-02-28');
INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(501,'Yash Desh','Finance',null,'Hyderabad','2017-12-11'),
(502,'Zoyaaa Nair','HR',null,'Delhi','2018-02-28');

INSERT INTO Employee (emp_id, name, dept, salary, city, hire_date) VALUES
(503,'Yash Deshasd','Finance',null,'Hyderabad','2017-12-11'),
(504,'Zoyaaa Naiurr','HR',null,'Delhi','2018-02-28');
-- Display all records from the employee table.
select * from Employee;

-- Display only name and salary.
select name, salary from Employee;

-- Display distinct departments.
select distinct dept from Employee;

-- Display employees working in IT department.
select * from Employee
where dept = "IT";

-- Display employees with salary greater than 50,000.
select * from Employee
where salary > 50000;

-- Display employees whose city is Bangalore.
select * from Employee
where city = "Bangalore";

-- WHERE, AND, OR, IN, BETWEEN

-- Employees from IT department and salary > 60,000.
select * from Employee
where dept = "IT" and salary > 60000;

-- Employees from IT or HR department.
select * from Employee
where dept = "IT" or dept = "HR";

-- Employees whose salary is between 40,000 and 70,000.
select * from Employee
where salary between 40000 and 70000;

-- Employees hired after 2022-01-01.
select * from Employee
where hire_date > "2022-01-01";

-- Employees whose city is in (Delhi, Mumbai, Chennai).
select * from Employee where city in ("Delhi", "Mumbai", "Chennai");

-- Employees whose salary is not equal to 30,000.
select * from Employee 
where salary != 30000;

-- LIKE, NULL, ORDER BY

-- Employees whose name starts with A.
select emp_id,name from Employee
where name like "A%";

-- Employees whose name ends with n.
select emp_id, name from Employee
where name like "%n";

-- Employees whose name contains ra.
select emp_id, name from Employee
where name like "%ra%";

-- Employees whose salary is NULL.
select emp_id, name from Employee
where salary is null;

-- Display employees ordered by salary ascending.
select emp_id, name, salary from Employee
order by salary;

-- Display employees ordered by hire_date descending.
select emp_id, name, hire_date from Employee
order by hire_date desc;

-- Aggregate Functions

-- Find total number of employees.
select count(emp_id) as "Number of Employees" from Employee;

-- Find maximum salary.
select max(salary) from Employee;

-- Find minimum salary in IT department.
select min(salary) from Employee
where dept = "IT";

-- Find average salary of all employees.
select avg(salary) from Employee;

-- Find total salary paid to HR department.
select sum(salary) from Employee
where dept = "HR";

-- GROUP BY & HAVING

-- Department-wise total salary.
select dept, sum(salary) from Employee
group by dept;

-- Department-wise average salary.
select dept, avg(salary) from Employee
group by dept;

-- Count employees in each department.
select dept, count(emp_id) from Employee
group by dept;

-- Departments having more than 100 employees.
select dept, count(emp_id) from Employee
group by dept having count(emp_id) > 100;

-- Departments where average salary > 60,000.
select dept, avg(salary) from Employee
group by dept having avg(salary) > 60000;

select * from Employee
where name like "Sneha%";

update Employee 
set name = "Sneha Salunke"
where emp_id in (4, 171);

select * from Employee
where name like "Sneha %";