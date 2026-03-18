<%@ page import="java.util.List"%>
<%@ page import="com.example.model.Student"%>

<table border="1">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Email</th>
		<th>DOB</th>
		<th>Mobile</th>
		<th>CGPA</th>
	</tr>

	<%
	List<Student> students = (List<Student>) request.getAttribute("students");

	if (students != null) {
		for (Student s : students) {
	%>
	<tr>
		<td><%=s.getId()%></td>
		<td><%=s.getName()%></td>
		<td><%=s.getEmail()%></td>
		<td><%=s.getDob()%></td>
		<td><%=s.getMobile()%></td>
		<td><%=s.getCgpa()%></td>
	</tr>
	<%
}
}
%>

</table>

<a href="home">Go to Home</a>