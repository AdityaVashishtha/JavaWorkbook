package com.springTest;

public class Customer {
	private int cno;
	private String cname;
	private String mobile;
	private String city;
	
	public Customer() {
		super();
	}

	public Customer(int cno, String cname, String mobile, String city) {
		super();
		this.cno = cno;
		this.cname = cname;
		this.mobile = mobile;
		this.city = city;
	}

	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cno;
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
		Customer other = (Customer) obj;
		if (cno != other.cno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [cno=" + cno + ", cname=" + cname + ", mobile=" + mobile + ", city=" + city + "]";
	}
	
	
	
}
