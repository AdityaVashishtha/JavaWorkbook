package com.empLaptop;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

@javax.persistence.Entity
public class Employee {
	@Id
	private int empNo;
	private String ename;
	private int sal;
	private Address address;
	@ManyToMany
	private List<Laptop> laptops = new ArrayList<Laptop>();
	
	public List<Laptop> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}

	public Employee(int empNo, String ename, int sal, Address address, List<Laptop> laptops) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
		this.laptops = laptops;
	}

	public Employee(int empNo, String ename, int sal, Address address) {
		super();
		this.empNo = empNo;
		this.ename = ename;
		this.sal = sal;
		this.address = address;
	}
	
	public Employee() {
		super();
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empNo != other.empNo)
			return false;
		return true;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", ename=" + ename + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
	
}
