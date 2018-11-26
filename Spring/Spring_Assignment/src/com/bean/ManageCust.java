package com.bean;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class ManageCust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("check.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		CustomerInfo in=(CustomerInfo)factory.getBean("id3");
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter Customer ID:");
		Integer id = s.nextInt();
		in.isUserExists(id);
		System.out.println("Enter option 1 to insert Address, option 2 to insert phone number:");
		Integer sl = s.nextInt();
		ChooseNext cn=new ChooseNext();
		cn.selector(sl,id);
		
	}
}

/*
create table customerinfo
(
id number(10)primary key,
name varchar(20),
address varchar(30),
cell_num varchar(20)
);
drop table customerinfo;

select*from customerinfo
insert into customerinfo (cell_num) values ('2165836945')
update customerinfo set address=null, cell_num=null;

insert all
into customerinfo(id,name,address,cell_num) values(10001,'luke','dallas','2145836940')
into customerinfo(id,name,address,cell_num) values(10002,'lucy','New York','2145836941')
into customerinfo(id,name) values(10003,'jack')
into customerinfo(id,name) values(10004,'tom')

select *from dual;
*/

