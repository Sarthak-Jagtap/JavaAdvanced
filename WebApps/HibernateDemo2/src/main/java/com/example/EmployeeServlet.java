//package com.example;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * Servlet implementation class EmployeeServlet
// */
//@WebServlet("/EmployeeServlet")
//public class EmployeeServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    public EmployeeServlet() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		
//		int page = 1;
//		int pageSize = 5;
//		
//		
//		String pageParam = request.getParameter("page");
//		
//		if(pageParam != null) {
//			page = Integer.parseInt(pageParam);
//		}
//		
//		EmployeeDao dao = new EmployeeDao();
//	
//	}
//	
//	
//
//
//}
