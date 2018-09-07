package productfilter;

import java.util.Objects;
import java.util.logging.Logger;

public class Product implements Comparable<Product>{
    private int productCode;
    private String productName;
    private String brand;
    private int price;
    private int quantity;

    public Product(int productCode, String productName, String brand, int price, int quantity) {
        this.productCode = productCode;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

 
    public int hashCode() {
        return this.productCode;
    }

    @Override
    public String toString() {
        return "Product{" + "productCode=" + productCode + ", productName=" + productName + ", brand=" + brand + ", price=" + price + ", quantity=" + quantity + '}';
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
        if (this.productCode != other.productCode) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Product o) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(o.productCode > productCode)
            return 1;
        else if(o.productCode < productCode)
            return -1;
        else
            return 0;
    }

}
