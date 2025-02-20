package com.DhineshDeveloper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DAY66 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		String name = req.getParameter("usernanme");
		HttpSession session = req.getSession();
		session.setAttribute("username", name);
		resp.sendRedirect("/servlet");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
		HttpSession session = req.getSession();
		Object un = session.getAttribute("username");
		
		PrintWriter writer = resp.getWriter();
		writer.println(un);
		
		RequestDispatcher rd = req.getRequestDispatcher("/servlet1");
		rd.include(req, resp);
	}
}
