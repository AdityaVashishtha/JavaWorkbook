package com.springTest;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private int eno;
	private String name;
	private Set<String> email;
	private List<String> mobile;
	private Map<String, Relative> family;
	private Properties qualifications;
	public Employee() {
		super();
	}
	public Employee(int eno, String name, Set<String> email, List<String> mobile, Map<String, Relative> family,
			Properties qualifications) {
		super();
		this.eno = eno;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.family = family;
		this.qualifications = qualifications;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getEmail() {
		return email;
	}
	public void setEmail(Set<String> email) {
		this.email = email;
	}
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	public Map<String, Relative> getFamily() {
		return family;
	}
	public void setFamily(Map<String, Relative> family) {
		this.family = family;
	}
	public Properties getQualifications() {
		return qualifications;
	}
	public void setQualifications(Properties qualifications) {
		this.qualifications = qualifications;
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
		return "Employee [eno=" + eno + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", family="
				+ family + ", qualifications=" + qualifications + "]";
	}
	
}
