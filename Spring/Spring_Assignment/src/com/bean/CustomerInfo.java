package com.bean;
import org.springframework.jdbc.core.JdbcTemplate;

public class CustomerInfo {
	private Integer id;
	private String name;
	private String add;
	
	 JdbcTemplate jt;
	public void setJt(JdbcTemplate jt)
	{
		this.jt=jt;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	private String num;
	
	public void isUserExists(Integer id) {

	        String sql = "SELECT count(*) FROM customerinfo WHERE id = ?";
	        String result = "Correct!";

	        //The method queryForInt(String, Object...) from the type JdbcTemplate is deprecated
	        Integer count = getJdbcTemplate().queryForInt(sql, new Object[] { id });
				
		if (count == 0) {
			System.out.println("Incorrect ID!");
			ChooseNext c1=new ChooseNext();
			c1.enterid();
			
		}else {
			
		System.out.println(result);
		}
	  }
	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jt;
	}
}
