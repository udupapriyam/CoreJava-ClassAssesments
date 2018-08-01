package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		
		//To support html tags
		response.setContentType("text/html");
		
		//read existing session
		HttpSession session=request.getSession(true);
		
		if(session!=null) {
			String uname=(String)session.getAttribute("uname");
			if(uname!=null) {
				pw.println("You are valid user");
				pw.println("Welcome Servlet.. this is protected");
				pw.print("<a href=Logout.html>Logout?</a>");
			}
			else {
				pw.println("You are not valid user");
				pw.println("Please log in");
				pw.print("<a href=Login.html>Login</a>");
			}
		}
		
	}

}
