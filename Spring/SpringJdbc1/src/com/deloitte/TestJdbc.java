package com.deloitte;

import java.sql.Array;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJdbc {

	public static void main(String[] args) {
		// create an object of employee class
		//Employee emp = new Employee(2, "Ram", 103);

		// invoke the appropriate dao method
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		EmployeeDao eDao = (EmployeeDao) context.getBean("eDao");
		//eDao.insertRow(emp);
		//eDao.deleteRow(emp);
		
//		Employee arr[] = new Employee[4];
//		arr[0] = new Employee(2, "Khana", 16);
//		arr[1] = new Employee(3, "Radha", 14);
//		arr[2] = new Employee(4, "Raj", 15);
//		arr[3] = new Employee(5, "Sita", 16);
		//eDao.insertMultipleRow(arr);
		
		//eDao.updateRow(emp);
		
		List<Employee>allEmployees=eDao.readAll();
		Iterator<Employee> it=allEmployees.iterator();
		while(it.hasNext())
		{
			Employee e=it.next();
			System.out.println(e.getDepartmentId()+" "+e.getEmployeeName()+" "+e.getDepartmentId());
		}

	}

}
