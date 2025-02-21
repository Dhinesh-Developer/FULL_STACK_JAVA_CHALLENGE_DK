package com.DhineshDeveloper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DAY68 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
		/*servlet config and the servlet content are two objects created at the time of servlet inintialization
		 * and used to provide initial parametes or configuration information to the servlet*/
		
		ServletConfig config = getServletConfig();
		String name =config.getInitParameter("admin");
		
		PrintWriter writer = resp.getWriter();
		writer.println("Adming Name : "+ name);
	}
}
