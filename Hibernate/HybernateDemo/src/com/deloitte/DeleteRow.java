package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRow {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		//deletion based on primary key
		//finding a row with required id
		Laptop lt1=(Laptop)session.get(Laptop.class, 25);
		//delete it
		session.delete(lt1);
		tx.commit();
		System.out.println("Successfully deleted a row");
	}

}
