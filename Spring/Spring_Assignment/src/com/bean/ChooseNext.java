package com.bean;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.Statement;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ChooseNext {
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	public void enterid() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Customer ID:");
		Integer id = s.nextInt();
		Resource res=new ClassPathResource("check.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		CustomerInfo in=(CustomerInfo)factory.getBean("id3");
		in.isUserExists(id);
	}
	public void selector(int input,Integer id) {
		if(input==1) {
			editAdd(id);
		}else {
		editCell(id);
		}
		
	}
	//update address
	public void editAdd(Integer ID) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please update your address:");
		String add = s.nextLine();
		
		System.out.println("update address.");
		}
	//update cell phone
	public void editCell(Integer ID) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please Update your phone number:");
		String cell = s.nextLine();
		String query1 =  "insert into employees " + " (id, cell_num)" + " values (?, ?)";
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System", "0703");
		if(con!=null)
		{
			System.out.println("Connected Successfull..");
		}
		Statement st = con.createStatement();
		st.executeUpdate(query1);
		// System.out.println("update Cell phone number.");
		}
		 catch(Exception e)
		 {
		 System.out.println(e);
		 }
		
	}

	}
