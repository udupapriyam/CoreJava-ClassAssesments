package com.deloitte;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class SelectWhere {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from com.deloitte.Laptop");
		
		Criteria c=session.createCriteria(Laptop.class);
		//here price is property of POJO class
		c.add(Restrictions.gt("price", 300.0));
		
		List li=c.list();
		Iterator it=li.iterator();
		while(it.hasNext()) {
			Laptop lt=(Laptop)it.next();
			System.out.println(lt.getId()+" "+lt.getBrandname()+" "+lt.getPrice());
		}

	}

}
