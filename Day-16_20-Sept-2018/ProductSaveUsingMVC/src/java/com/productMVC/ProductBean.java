package com.productMVC;

public class ProductBean {
    private String pname;
    private int pcode;
    private int price;
    private int ccode;

    public ProductBean() {
    }

    public ProductBean(String pname, int pcode, int price, int ccode) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
        this.ccode = ccode;
    }

    public String getPname() {
        return pname;
    }

    public int getPcode() {
        return pcode;
    }

    public int getPrice() {
        return price;
    }

    public int getCcode() {
        return ccode;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.pcode;
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
        final ProductBean other = (ProductBean) obj;
        if (this.pcode != other.pcode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", ccode=" + ccode + '}';
    }
    
    
    
}
