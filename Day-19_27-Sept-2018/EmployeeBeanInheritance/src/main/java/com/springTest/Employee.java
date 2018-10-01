package com.springTest;

public class Employee {
	private String qualification;
	private String city;
	private String state;
	private String name;
	private int eno;
	
	public Employee() {
		super();
	}
	
	public Employee(String qualification, String city, String state, String name, int eno) {
		super();
		this.qualification = qualification;
		this.city = city;
		this.state = state;
		this.name = name;
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eno;
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
		if (eno != other.eno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emploee [qualification=" + qualification + ", city=" + city + ", state=" + state + ", name=" + name
				+ ", eno=" + eno + "]";
	}
	
}
