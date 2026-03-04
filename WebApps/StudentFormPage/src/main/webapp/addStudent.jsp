<%@page import="com.example.dao.StudentDao"%>
<%@ page import="com.example.model.Student"%>
<%@ page import="com.example.dao.StudentDao"%>
<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>

	<h2>Add Student</h2>

	<%
	String nameValue = "";
	String ageValue = "";
	String emailValue = "";

	StringBuilder errorMsg = new StringBuilder();

	if ("POST".equalsIgnoreCase(request.getMethod())) {

		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		String email = request.getParameter("email");

		nameValue = name;
		ageValue = ageStr;
		emailValue = email;

		boolean isValid = true;
		int age = 0;

		// 🔥 Validation

		if (name == null || name.trim().isEmpty()) {
			isValid = false;
			errorMsg.append("Name cannot be empty <br>");
		}

		try {
			age = Integer.parseInt(ageStr);
			if (age <= 0) {
		isValid = false;
		errorMsg.append("Age must be positive <br>");
			}
		} catch (Exception e) {
			isValid = false;
			errorMsg.append("Invalid Age <br>");
		}

		if (email == null || !email.contains("@")) {
			isValid = false;
			errorMsg.append("Invalid Email <br>");
		}

		// 🔥 If valid → Call DAO
		if (isValid) {

			Student student = new Student(name, age, email);
			StudentDao dao = new StudentDao();

			boolean result = dao.addStudent(student);

			if (result) {
		request.setAttribute("studentName", name);
		request.getRequestDispatcher("success.jsp").forward(request, response);
		return;
			} else {
		response.sendRedirect("error.jsp");
		return;
			}
		}
	}
	%>

	<!-- 🔴 Show Validation Errors -->
	<%
	if (errorMsg.length() > 0) {
	%>
	<p style="color: red;">
		<%=errorMsg.toString()%>
	</p>
	<%
	}
	%>

	<!-- 📝 Form -->
	<form action="addStudent.jsp" method="post">

		Name: <input type="text" name="name" value="<%=nameValue%>">
		<br>
		<br> Age: <input type="number" name="age" value="<%=ageValue%>">
		<br>
		<br> Email: <input type="text" name="email"
			value="<%=emailValue%>"> <br>
		<br> <input type="submit" value="Add Student">

	</form>

	<br>
	<a href="home.html">Go Home</a>

</body>
</html>