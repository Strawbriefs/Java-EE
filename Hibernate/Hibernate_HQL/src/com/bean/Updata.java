package com.bean;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Updata {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		  cfg.configure("hibernate.cfg.xml"); 
		  
		  SessionFactory factory = cfg.buildSessionFactory();
		  Session session = factory.openSession();  
		 
		  //Query qry = session.createQuery("from Product p where p.productId= ?");
		  Query qry=session.createQuery("update Product p set p.proName=? where p.productId=107");
		     qry.setParameter(0,"Speaker");
		     int res=qry.executeUpdate();
		    
		     System.out.println("Command successfully executed...");
		     System.out.println("Number of records effected due to update query"+res);
		  session.close();
		  factory.close();
		 }

	}


