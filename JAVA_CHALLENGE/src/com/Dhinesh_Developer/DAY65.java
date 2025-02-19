package com.DhineshDeveloper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DAY65")
public class DAY65 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int sum = num1+num2;
		
		// setter -> setAttribute is used to transfer the info to another servlet
		req.setAttribute("sum", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("/DAY64");
		rd.forward(req, resp);
		
		PrintWriter writer = resp.getWriter();
		writer.println("Sum : "+sum);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		// getter -> getAttribute is used to get the info from another servlet
		int sum = (int)req.getAttribute("sum");
		
		int pro = num1 * num2;
		PrintWriter writer = resp.getWriter();
		writer.println("sum : "+sum);
		writer.println("pro : "+pro);
	}
	
	
}
