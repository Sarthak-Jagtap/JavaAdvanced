package com.examples;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstPage")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html> <body>");
		out.println("Languages: ");
		
		// A servlet configuration object is used by a servlet container to pass information to a servlet during initialization
		ServletConfig config = getServletConfig();
		String langs = config.getInitParameter("languages");
		String[] lang = langs.split(", ");
		
		for (String l: lang)
		{
			out.println(l);
		}
		
		// Read about servlet context in javadocs
		ServletContext context = getServletContext();
		out.println("Country: " + context.getInitParameter("country"));
		
		
		out.println("</body> </html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
