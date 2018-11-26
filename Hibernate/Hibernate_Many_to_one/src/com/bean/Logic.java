package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();

		Vendor v=new Vendor();
			v.setVendorId(101);
			v.setVendorName("American software");
			
		Customer c1=new Customer();
				c1.setCustomerId(100);
				c1.setCustomerName("Pardils");
				c1.setParentObjects(v);
				
			Customer c2=new Customer();
				c2.setCustomerId(101);
				c2.setCustomerName("sashi");
				c1.setParentObjects(v);
				
			Customer c3=new Customer();
				c3.setCustomerId(102);
				c3.setCustomerName("gaurav");
				c1.setParentObjects(v);
				
			Customer c4=new Customer();
				c4.setCustomerId(103);
				c4.setCustomerName("rohan");
				c1.setParentObjects(v);
				
						
					Transaction tx=session.beginTransaction();
							session.save(c1);
							session.save(c2);
							session.save(c3);
							session.save(c4);
							
				tx.commit();
				session.close();
				System.out.println("Many to one is done..!!");
				factory.close();

			}

	}


