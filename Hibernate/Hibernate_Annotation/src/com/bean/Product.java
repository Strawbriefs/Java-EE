package com.bean;

import javax.persistence.Id;
import javax.persistence.Column;

public class Product {
	@Id
	@Column(name="proid")
	private int productId;
	@Column(name="proName", length=10)
	private String proName;
	@Column(name="price")
	private double price;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
