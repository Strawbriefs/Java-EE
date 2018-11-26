package com.bean;


import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import com.utils.HibernateUtils;

import org.hibernate.Session;
public class InsertData {

 public static void main(String[] args) {
  
  /* //configure the configuration file and manage the sessionfactory of hib application
          Configuration cfg = new Configuration();
          cfg.configure("hibernate.cfg.xml"); 
   //allow to provide the factory methods of every session objects,
          SessionFactory factory = cfg.buildSessionFactory();
          //allow to do the transctation with DB tables
          Session session = factory.openSession();*/
	 Session session = HibernateUtils.openSession();
	 Transaction tx = session.beginTransaction();
	     
          Product p=new Product(); 
   
          p.setProductId(107);
          p.setProName("Speaker");
          p.setPrice(200);
          
   
         // Transaction tx = session.beginTransaction();
          session.save(p);
          System.out.println("Object saved successfully.....!!");
          tx.commit();
          session.close();
         // factory.close();
      

 }

}


	
