package com.sessioncheck;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCheck
 */
@WebServlet(description = "Project to check jsessionID values", urlPatterns = { "/SessionCheck" })
public class SessionCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			HttpSession session = request.getSession();
			session.setAttribute("sessionVal", new String("Content") );
			PrintWriter out = response.getWriter();
			Cookie cookies [] = request.getCookies();
			for (Cookie cookie : cookies) {
				out.println("<h3>"+cookie.getName()+" : "+cookie.getValue()+"</h3>");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}


}
