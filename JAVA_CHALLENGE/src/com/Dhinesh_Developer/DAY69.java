package com.DhineshDeveloper;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DAY69")
public class DAY69 extends HttpServlet{
	
	/*Life cycle of servlet
	 * 
	 * Loads Servlet class -> web container loads the servlet class
	 * Create Servlet instance -> immediately after the class gets loaded the object of servlet class
	 * Calls init() -> After creating the servlet instance the webcontainer calls the init.
	 * Call Service() -> service() is called for every instance
	 * Call destroy() -> Destroy() would ask to release all the resources associated with it
	 * */
	
	@Override
	public void init() throws ServletException {
		super.init();
		System.out.println("Servlet is being initailized");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
		
		System.out.println("Hanled GET request");
	}
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("Servlet is being destroyed");
	}
	
	/*Work flow -> of servlet
	 * 
	 * start -> class will be loaded -> object of servlet is created -> ready for service 
	 * -> providing service to client -> stop
	 * */
}
