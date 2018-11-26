package com.bean;
import java.util.Set;
public class Vendor {
private int vendorId;
private String vendorName;
private Set Children;
public int getVendorId() {
	return vendorId;
}
public void setVendorId(int vendorId) {
	this.vendorId = vendorId;
}
public String getVendorName() {
	return vendorName;
}
public void setVendorName(String vendorName) {
	this.vendorName = vendorName;
}
public Set getChildren() {
	return Children;
}
public void setChildren(Set children) {
	Children = children;
}
}
