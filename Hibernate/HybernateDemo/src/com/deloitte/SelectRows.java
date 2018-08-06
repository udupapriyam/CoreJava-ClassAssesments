package com.deloitte;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectRows {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from com.deloitte.Laptop");
		
		List li=query.list();
		Iterator it=li.iterator();
		while(it.hasNext()) {
			Laptop lt=(Laptop)it.next();
			System.out.println(lt.getId()+" "+lt.getBrandname()+" "+lt.getPrice());
		}
	}

}
