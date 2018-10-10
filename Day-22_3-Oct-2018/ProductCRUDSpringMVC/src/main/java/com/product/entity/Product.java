package com.product.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Entity
public class Product {
	@Id
	@Size(max=5,min=2)
	private String pcode;
	@Size(max=25,min=2)
	private String pname;
	@Size(max=25,min=2)
	private String brand;
	@Size(max=25,min=2)
	private String category;
	@Min(100)
	private int price;
	
	public Product() {
		super();
	}


	public Product(String pcode, String pname, String brand, String category, int price) {
		super();
		this.pcode = pcode;
		this.pname = pname;
		this.brand = brand;
		this.category = category;
		this.price = price;
	}


	public Product(String pcode) {
		super();
		this.pcode = pcode;
	}


	public String getPcode() {
		return pcode;
	}


	public void setPcode(String pcode) {
		this.pcode = pcode;
	}


	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pname=" + pname + ", brand=" + brand + ", category=" + category
				+ ", price=" + price + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pcode == null) ? 0 : pcode.hashCode());
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
		Product other = (Product) obj;
		if (pcode == null) {
			if (other.pcode != null)
				return false;
		} else if (!pcode.equals(other.pcode))
			return false;
		return true;
	}
	
	
	
	
	
}
