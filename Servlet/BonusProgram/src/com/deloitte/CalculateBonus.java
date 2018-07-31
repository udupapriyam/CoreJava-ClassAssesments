package com.deloitte;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculateBonus
 */
@WebServlet("/CalculateBonus")
public class CalculateBonus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculateBonus() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("empname");
		double salary=Double.parseDouble(request.getParameter("salary"));
		String grade=request.getParameter("grade");
		double bonus = 0;
		if(salary>100000 && grade.equals("A"))
			 bonus = salary*0.05;
		else if(salary>50000 && salary<100000 && grade.equals("B"))
			bonus = salary*0.07;
		else if(salary<50000 && grade.equals("C"))
			bonus = salary*0.2;
		double tax=salary*0.25;
		double net=salary+bonus-tax;
		String str="<table border=1><tr>"
				+ "<th>Employee Name</th>"
				+ "<th>Basic Salary</th>"
				+ "<th>Bonus</th>"
				+ "<th>Tax</th>"
				+ "<th>Net Salary</th>"
				+ "</tr>"
				+ "<tr>"
				+ "<td>"+name+"</td>"
				+ "<td>"+salary+"</td>"
				+ "<td>"+bonus+"</td>"
				+ "<td>"+tax+"</td>"
				+ "<td>"+net+"</td>"
				+ "</tr></table>";
		
		pw.println(str);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
