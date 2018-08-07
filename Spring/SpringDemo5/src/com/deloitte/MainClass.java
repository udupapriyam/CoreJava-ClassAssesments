package com.deloitte;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		CollectionExample cc=(CollectionExample)context.getBean("CollectionExample");
		System.out.println(cc.getCityList());
		System.out.println(cc.getCitySet());
		System.out.println(cc.getCityMap());
		System.out.println(cc.getCityProp());

	}

}
