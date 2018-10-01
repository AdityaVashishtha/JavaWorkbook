package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Emp {
	@Id
	private int empno;
	private Name ename;
	private Address address;
	@ManyToMany
	private List<Product> products = new ArrayList<Product>();
	@ManyToOne
	private Area area;
	@ManyToOne
	private Branch branch;
	
	public Emp(int empno, Name ename, Address address, List<Product> products, Area area, Branch branch) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.address = address;
		this.products = products;
		this.area = area;
		this.branch = branch;
	}

	public Emp() {
		super();
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public Name getEname() {
		return ename;
	}

	public void setEname(Name ename) {
		this.ename = ename;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", address=" + address + ", products=" + products
				+ ", area=" + area + ", branch=" + branch + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
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
		Emp other = (Emp) obj;
		if (empno != other.empno)
			return false;
		return true;
	}
	
	
	
}
