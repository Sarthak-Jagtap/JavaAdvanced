<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>

	<h2>Student Registration Form</h2>

	<form  action="submit" method="post">

		<br> Id : <input type="text" name="id"> <br>
		<br> Name : <input type="text" name="name"> <br>
		<br> Email : <input type="email" name="email"> <br>
		<br> Date of Birth : <input type="date" name="dob"> <br>
		<br> Mobile Number : <input type="tel" name="mobile"> <br>
		<br> CGPA : <input type="number" step="0.01" name="cgpa">

		<br>
		<br> <input type="submit" value="Submit">

	</form>


</body>
</html>