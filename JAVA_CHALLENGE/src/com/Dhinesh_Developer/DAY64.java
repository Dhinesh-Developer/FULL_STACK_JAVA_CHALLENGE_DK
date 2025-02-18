package com.DhineshDeveloper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Day64")
public class DAY64 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		RequestDispatcher rd = req.getRequestDispatcher("/DAY63");
		rd.forward(req, resp);
		
		resp.sendRedirect("DAY63.html");
		System.out.println("Request Dispatcher and send Redirect");
		
	}
}
