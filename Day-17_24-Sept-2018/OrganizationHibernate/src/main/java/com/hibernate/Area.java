package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Area {
	@Id
	private int arcode;
	private String city;
	private String state;
	@ManyToOne
	private Emp employee;
	public Area(int arcode, String city, String state) {
		super();
		this.arcode = arcode;
		this.city = city;
		this.state = state;
	}

	public Area() {
		super();
	}

	public int getArcode() {
		return arcode;
	}

	public void setArcode(int arcode) {
		this.arcode = arcode;
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
		result = prime * result + arcode;
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
		Area other = (Area) obj;
		if (arcode != other.arcode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Area [arcode=" + arcode + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
}
