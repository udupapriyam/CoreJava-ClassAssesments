package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WelcomeTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		WelcomePOJO ww=(WelcomePOJO)context.getBean("w1");
		System.out.println(ww.getMsg());

	}

}
