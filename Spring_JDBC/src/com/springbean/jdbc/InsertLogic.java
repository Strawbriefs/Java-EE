package com.springbean.jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InsertLogic {

	public static void main(String args[]) {
		
		Resource res=new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		SpringJdbcInsert in=(SpringJdbcInsert)factory.getBean("id3");
		in.insertRow();
	}

}
