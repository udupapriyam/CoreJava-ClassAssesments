package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Passport pp1=new Passport();
		pp1.setPpid(1);
		pp1.setPpname("India");
		
		Person p1=new Person();
		p1.setPid(27);
		p1.setName("Dell");
		p1.setPp(pp1);
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		session.save(pp1);
		session.save(p1);
		tx.commit();
		System.out.println("Done..");
	}

}
