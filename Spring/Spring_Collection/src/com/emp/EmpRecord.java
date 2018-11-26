package com.emp;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmpRecord {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("empconfig.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		
		Object o=factory.getBean("id1");
		Employee wb=(Employee)o;
		
		wb.show();

	}

}
