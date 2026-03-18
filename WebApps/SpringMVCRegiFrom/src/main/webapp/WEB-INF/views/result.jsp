<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Data</title>
</head>
<body>

	Hi
	<b>${studData.name}</b>
	<br> ********** Your Details **********
	<br> Id = ${studData.id}
	<br> Name = ${studData.name}
	<br> Email = ${studData.email}
	<br> Date of Birth = ${studData.dob}
	<br> Mobile Number = ${studData.mobile}
	<br> CGPA = ${studData.cgpa}
	<br>
	
	<br>
		
	<a href="home">Go to Home</a>
	
</body>
</html>