package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.maths.Arithmatic;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		System.out.println("Welcome to HefShine");

		PrintWriter writer = response.getWriter();
		Arithmatic arithmatic = new Arithmatic();
		
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		
		writer.write("<h1>"+ arithmatic.getAddition(number1, number2)  +"</h1>");

		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
}