package com.tagexample;

public class Category {
    private int categoryCode;
    private String categoryName;
    
    /*
    Sql Create table
    create table ecomm_category
    (
    ccode int(4) primary key,
    cname varchar(20)
    );
    */
    
    public Category() {
    }

    public Category(int categoryCode, String categoryName) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.categoryCode;
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
        final Category other = (Category) obj;
        if (this.categoryCode != other.categoryCode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Category{" + "categoryCode=" + categoryCode + ", categoryName=" + categoryName + '}';
    }
    
}
