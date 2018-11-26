package com.springbean.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class SpringJdbcInsert {
	JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}public void insertRow()
	{
		int k=jt.update("insert into countries values(107,'US')");
		System.out.println(k+" row(s) inserted");
	}
}
