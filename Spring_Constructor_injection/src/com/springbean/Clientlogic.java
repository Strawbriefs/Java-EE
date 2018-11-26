package com.springbean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Clientlogic {

	public static void main(String[] args) {
		Resource res =new ClassPathResource("spconfig2.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o=factory.getBean("id1");
		Categories1 wb=(Categories1)o;
		
		wb.show();

	}

}
