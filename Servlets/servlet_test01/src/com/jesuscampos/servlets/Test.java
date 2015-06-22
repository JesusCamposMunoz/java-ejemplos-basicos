package com.jesuscampos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<body>");
		out.println("	<h1>Hola mundo!!!</h1>");
		out.println("	<p>---x Nuestra segunda aplicación web x---getAction</p>");
		out.println("	</body>");		
		out.println("</html>");	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<body>");
		out.println("	<h1>Hola mundo!!!</h1>");
		out.println("	<p>---x Nuestra segunda aplicación web x---postAction</p>");
		out.println("	</body>");		
		out.println("</html>");	
	}
}
