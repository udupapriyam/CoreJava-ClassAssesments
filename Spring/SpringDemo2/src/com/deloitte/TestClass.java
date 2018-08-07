package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		ComputerPOJO cc=(ComputerPOJO)context.getBean("Comp");
		System.out.println(cc.getBrandName());
		System.out.println(cc.cpu1.getCpubrand());
	}

}
