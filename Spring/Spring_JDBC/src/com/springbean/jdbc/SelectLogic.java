package com.springbean.jdbc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SelectLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("select.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		SpringJdbcSelect in=(SpringJdbcSelect)factory.getBean("id3");
		in.loadRecords();

	}

}
