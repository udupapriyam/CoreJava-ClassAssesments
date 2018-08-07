package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Smartphone cc=(Smartphone)context.getBean("mob");
		System.out.println(cc.getName());
		System.out.println(cc.getPrice());
		System.out.println(cc.app.getName());
		System.out.println(cc.app.getType());
	}

}
