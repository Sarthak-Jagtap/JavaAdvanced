package com.view;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class AddStaffServlet
 */
@WebServlet("/AddStaffServlet")
public class AddStaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStaffServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		List<String> errors = (List<String>) request.getAttribute("errors");

		out.println("<html><body>");
		if (errors != null) {
			out.println("<h2> Error...</h2>");
			out.println("<ul>");
			for (String str : errors) {
				out.println("<li>" + str + "</li>");
			}
			out.println("<ul>");
		}

		out.println("<h2>Add Staff Member</h2>\n");
		out.println("<form action='AddFormContoller' method='post'>\n");
		out.println();
		out.println("DOJ <input type='date' name='doj'> <br>\n");
		out.println("Name <input type='text' name='name'> <br>\n");
		out.println("Salary <input type='text' name='salary'> <br>\n");
		out.println("Gender ");
		out.println("<input type='radio' name='gender' value='Male'> Male ");
		out.println("<input type='radio' name='gender' value='Female'> Female <br>\n");
		out.println("<input type='submit' value='Save Data'>\n");
		out.println("</form>");
		out.println("</body></html>\n");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
