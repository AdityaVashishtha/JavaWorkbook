package com.tagexample;

public class Product {
    private int pcode;
    private String pname;    
    private int price;
    private Category category;
    
    /*
    Sql Create table
    create table ecomm_product 
    (
    pcode int(4) primary key,
    pname varchar(20),
    price int,
    category int
    );
    */

    public Product() {
    }

    public Product(int pcode, String pname, int price, Category category) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
        this.category = category;
    }

    public int getPcode() {
        return pcode;
    }

    public String getPname() {
        return pname;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.pcode;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.pcode != other.pcode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "pcode=" + pcode + ", pname=" + pname + ", price=" + price + ", category=" + category + '}';
    }
    
}
