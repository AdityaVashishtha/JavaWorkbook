package com.springTest;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String ccode;
	private String cname;
	private String address;
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String ccode, String cname, String address) {
		super();
		this.ccode = ccode;
		this.cname = cname;
		this.address = address;
	}
	public Customer() {
		super();
	}
	public Customer(String ccode) {
		super();
		this.ccode = ccode;
	}
	@Override
	public String toString() {
		return "Customer [ccode=" + ccode + ", cname=" + cname + ", address=" + address + "]";
	}
	
	
	
}
