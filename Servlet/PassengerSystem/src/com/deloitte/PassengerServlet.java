package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PassengerServlet
 */
public class PassengerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String dest=request.getParameter("destination");
		DBHelper db=new DBHelper();
		ArrayList passengerList=db.getALLPassenger(dest);
		
		String str1="<table border=1><tr>"
				+ "<th>First Name</th>"
				+ "<th>Last Name</th>"
				+ "<th>Source</th>"
				+ "<th>Destination</th>"
				+ "<th>Gender</th>"
				+ "</tr>";
		pw.println(str1);
		for(int i=0; i<passengerList.size(); i++) {
			PassengerVO pvo=(PassengerVO)passengerList.get(i);
			String str2="<tr>"
					+ "<td>"+pvo.getFname()+"</td>"
					+ "<td>"+pvo.getLname()+"</td>"
					+ "<td>"+pvo.getSource()+"</td>"
					+ "<td>"+pvo.getDestination()+"</td>"
					+ "<td>"+pvo.getGender()+"</td>"
					+ "</tr>";
			pw.println(str2);
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
