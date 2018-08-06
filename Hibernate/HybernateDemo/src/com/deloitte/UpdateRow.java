package com.deloitte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRow {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		tx.begin();
		//finding a row with required id
		Laptop lt1=(Laptop)session.get(Laptop.class, 26);
		//modify it
		lt1.setBrandname(lt1.getBrandname()+" India");
		//update it
		session.update(lt1);
		tx.commit();
		System.out.println("Successfully updated a row");

	}

}
