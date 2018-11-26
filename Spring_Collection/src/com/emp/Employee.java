package com.emp;
import java.util.*;
public class Employee {
	private Set empId;
	private List empName;
	private List empRole;
	private List dept;
	public Set getEmpId() {
		return empId;
	}
	public void setEmpId(Set empId) {
		this.empId = empId;
	}
	public List getEmpName() {
		return empName;
	}
	public void setEmpName(List empName) {
		this.empName = empName;
	}
	public List getEmpRole() {
		return empRole;
	}
	public void setEmpRole(List empRole) {
		this.empRole = empRole;
	}
	public List getDept() {
		return dept;
	}
	public void setDept(List dept) {
		this.dept = dept;
	}
	public void show()
	{
		System.out.println("Emp ID: "+empId);
		System.out.println("Emp Name: "+empName);
		System.out.println("Emp Role: "+empRole);
		System.out.println("Emp is: "+dept);
	}
}
