package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld cc=(HelloWorld)context.getBean("helloWorld");
		System.out.println(cc.getMessage1());
		System.out.println(cc.getMessage2());
		HelloIndia ii=(HelloIndia)context.getBean("helloIndia");
		System.out.println(ii.getMessage1());
		System.out.println(ii.getMessage2());
		System.out.println(ii.getMessage3());
	}

}
