package com.bean;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class OurLogic {

	public static void main(String[] args) {

Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();

Vendor v=new Vendor();
	v.setVendorId(101);
	v.setVendorName("ASR");
	
Customer c1=new Customer();
		c1.setCustomerId(501);
		c1.setCustomerName("Java C1");
		
	Customer c2=new Customer();
		c2.setCustomerId(502);
		c2.setCustomerName(".Net C1");
		
	Customer c3=new Customer();
		c3.setCustomerId(503);
		c3.setCustomerName("Devops C1");
		
		Set s=new HashSet();
				s.add(c1);
				s.add(c2);
				s.add(c3);
				
				v.setChildren(s);
				
			Transaction tx=session.beginTransaction();
					session.save(v);
					
		tx.commit();
		session.close();
		System.out.println("One to many is done..!!");
		factory.close();

	}

}
