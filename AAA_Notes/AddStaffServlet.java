package com.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/AddStaffForm")
public class AddStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		List<String> lists = (List<String>) request.getAttribute("errors");
		
		
		out.println("<html><body>");
		if(lists != null) {
			out.println("<h2> Errors - </h2>");
			out.println("<ul>");
			for(String s : lists) {
				out.println("<li>"+ s +"</li>");
			}
			out.println("</ul>");
		}
		out.println("<h2> Add Staff Form</h2> ");
		out.println("<form action = 'AddFormCont' method='post'>");
		out.println("Name <input type='text' name='name'> <br><br>");
		out.println("DOJ <input type = 'date' name = 'doj'> <br><br>");
		out.println("Salary <input type = 'text' name= 'salary'><br><br>");
		out.println("Gender<input type = 'radio' name = 'gender' value='Male'> Male");
		out.println("<input type = 'radio' name = 'gender' value='Female'> Female<br><br>");
		out.println("<input type = 'submit' value = 'Save Data'>");
		out.println("</form>");
		out.println("</body> </html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
