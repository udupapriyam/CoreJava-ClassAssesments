package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookiesDemo
 */
public class CookiesDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie allCookie[]=request.getCookies();
		PrintWriter pw=response.getWriter();
		
		if(allCookie==null) {
			String str="<body bgcolor=yellow></body>";
			pw.println(str);
			Cookie c=new Cookie("location","Mangalore");
			c.setMaxAge(24*60*60);
			response.addCookie(c);
			pw.println("Welcome to the site");
			pw.println("<br>Get offers on first purchase");
		}
		else {
			String str1="<body bgcolor=pink></body>";
			pw.println(str1);
			for(int i=0; i<allCookie.length; i++) {
				Cookie cc=allCookie[i];
				System.out.println(cc.getName()+" and "+cc.getValue());
				String name=cc.getName();
				String val=cc.getValue();
				if(name.equals("location") && val.equals("Mangalore")) {
					pw.println("Welcome back to the site");
					pw.println("<br>We have more offers for regular customers");
				}
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
