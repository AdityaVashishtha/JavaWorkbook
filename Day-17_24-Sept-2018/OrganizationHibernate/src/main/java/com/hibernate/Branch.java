package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Branch {
	@Id
	private int bcode;
	private String bname;
	private Address address;
	@OneToMany(mappedBy="branch")
	private List<Emp> employees = new ArrayList<Emp>();
	
	public Branch() {
		super();
	}

	public Branch(int bcode, String bname, Address address) {
		super();
		this.bcode = bcode;
		this.bname = bname;
		this.address = address;
	}

	public int getBcode() {
		return bcode;
	}

	public void setBcode(int bcode) {
		this.bcode = bcode;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Branch [bcode=" + bcode + ", bname=" + bname + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bcode;
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
		Branch other = (Branch) obj;
		if (bcode != other.bcode)
			return false;
		return true;
	}
	
	
	
}
