package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
@SuppressWarnings("deprecation")
public class Save_Data {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//it is a deprecated object that's why making a strike line
		//deprecated objects are nothing but removed from one api to another(means which is not an important)
		@SuppressWarnings("deprecation")
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Product p=new Product();
		
		p.setProductId(102);
		p.setProName("phone");
		p.setPrice(5000);
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		System.out.println("Object saved succeffully using annotations.....!");
		tx.commit();
		session.close();
		factory.close();

	}

}
