
package com.bean;

import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

public class ForOurLogic { 

 public static void main(String[] args)
 {
  
  Configuration cfg = new Configuration();
  cfg.configure("hibernate.cfg.xml"); 
  
  SessionFactory factory = cfg.buildSessionFactory();
  Session session = factory.openSession();  
 
  //Query qry = session.createQuery("from Product p where p.productId= ?");
  Query qry=session.createQuery("from Product p");
        // qry.setParameter(0,106);
   
         List l =qry.list();
   System.out.println("Total Number Of Records : "+l.size());  
   Iterator it = l.iterator();
   
   while(it.hasNext())
   {
    Object o = (Object) it.next();
    Product p = (Product)o;
    System.out.println("Product ID : "+p.getProductId());
    System.out.println("Product Name : "+p.getProName());
    System.out.println("Product Price : "+p.getPrice());
    System.out.println("---------------------------");
    
   }  

  session.close();
  factory.close();
 }
 
}
/*package com.bean;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {
		 	//configure the configuration file and manage the sessionfactory of hib application
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml"); 
        	//allow to provide the factory methods of every session objects,
        SessionFactory factory = cfg.buildSessionFactory();
        	//allow to do the transctation with DB tables
        Session session = factory.openSession();
            //Query qry=session.createQuery("from Product p where p.productId=?");
        Query qry=session.createQuery("from Product p");
        	//qry.setParameter(0,106);
        	List l=qry.list();
        	System.out.println("Total NUmber of records: "+l.size());;
        	Iterator it=l.iterator();
        	
        	while(it.hasNext())
        	{
        		Object o=(Object) it.next();
        		Product p=(Product)o;
        		System.out.println("Product ID : "+p.getProductId());
        		System.out.println("Product Name : "+p.getProName());
        		System.out.println("Product Price : "+p.getPrice());
        		System.out.println("-------------------------------");
        	}
        	
        	session.close();
        	factory.close();
	}

}*/

