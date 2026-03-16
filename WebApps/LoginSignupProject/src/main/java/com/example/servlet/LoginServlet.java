package com.example.servlet;

import java.io.IOException;

import com.example.dao.UserDAO;
import com.example.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String email = req.getParameter("email");
		String password = req.getParameter("password");

		UserDAO dao = new UserDAO();
		User user = dao.loginUser(email, password);

		if (user != null) {
			HttpSession session = req.getSession();
			session.setAttribute("user", user);

			resp.sendRedirect("home.jsp");
		} else {
			resp.getWriter().println("Invalid Credentials");
		}
	}
}
