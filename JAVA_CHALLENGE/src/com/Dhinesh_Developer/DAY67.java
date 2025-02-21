package com.DhineshDeveloper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DAY67 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		String un = req.getParameter("username");
		
		/*cookies are text files stored in client side.
		 * they are kept for tracking system
		 * the server script sends the set of cookies to the client,
		 * the client stores in the local system for future reference.
		 * cookies can stror only String values.*/
		Cookie cookie = new Cookie("username",un);
		
		resp.sendRedirect("/servlet");
		
	} 
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
		
		Cookie[] cookies = req.getCookies();
		
		PrintWriter writer = resp.getWriter();
		
		for(int i=0;i<cookies.length;i++) {
			writer.println(cookies[i].getName()+" "+cookies[i].getValue());
		}
	}
	
}
