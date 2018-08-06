package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddRecords {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Laptop l1=new Laptop();
		l1.setId(27);
		l1.setBrandname("Dell");
		l1.setPrice(330.00);
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(l1);
		tx.commit();
		System.out.println("Successfully inserted one row to the table");
	}

}
