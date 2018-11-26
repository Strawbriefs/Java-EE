package com.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Clientogic {

	public static void main(String[] args) {
		// ClassPathResource it return the spring bean path which defind in the spconfig.xml
		//Resource object can have all the bean resource
		Resource res=new ClassPathResource("spconfig.xml");
		
		//BeanFactory object can have all the list of bean properties return by xmlbeanfactory.
		
		BeanFactory factory=new XmlBeanFactory(res);
		
		//Object o can have only one bean preperties associated with its id
		Object o=factory.getBean("id1");
		WelcomeBean wb=(WelcomeBean)o;
		
		wb.show();

	}

}
