package com.hefshine.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hefshine.beans.User;
import com.hefshine.dao.UserDAO;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Login() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		User user = new User();
		UserDAO ud = new UserDAO();
		PrintWriter pw = response.getWriter();

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		user.setUsername(username);
		user.setPassword(password);
		
		if(ud.isValidUser(user)) {
			pw.write("<h1>Voila</h1>");
		}else {
			pw.write("<h1>Invalid</h1>");
			pw.write("<a href='login.html'>Login again</>");
		}
		
	}

}
