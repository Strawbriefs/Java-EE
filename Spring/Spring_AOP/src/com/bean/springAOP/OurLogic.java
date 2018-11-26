package com.bean.springAOP;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class OurLogic {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("spconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		MyInterface inter=(MyInterface)factory.getBean("id4");	
		inter.deposit();
		inter.withdraw();

	}
	
}
