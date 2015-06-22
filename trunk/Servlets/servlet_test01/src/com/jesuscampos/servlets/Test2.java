package com.jesuscampos.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Test2 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Test2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Ejecutado SERVELT #2");
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("pageTest2.jsp");
		
		String nombreCompleto = "Jesus Campos Muñoz";
		request.setAttribute("variable1", nombreCompleto);
		
		String[] listaPalabras = nombreCompleto.split("\\s+");
		request.setAttribute("lista1", listaPalabras);
		
		dispatcher.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Ejecutado SERVELT #2 - POST ACTION");
		String var1 = request.getParameter("campoOculto");
		System.out.println(var1);
		String var2 = request.getParameter("campoOcultoNombre");
		System.out.println(var2);
		Object s1 = request.getAttribute("jesusNombre");
		System.out.println(s1);
		Object s2 = request.getSession().getAttribute("jesus");
		System.out.println(s2);

	}
}
