package com.utils;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
	private static SessionFactory factory;
	//get the Session => 获得全新session
	static{
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	public static Session openSession(){
		
		Session session=factory.openSession();
		
		return session;
	}
	//get the session => 获得绑定的session
	public static Session getCurrentSession(){
		Session session=factory.getCurrentSession();
		return session;
	}
	/*public static void main(String[] args){
		System.out.println(HibernateUtils.openSession());
	}*/
	
}
