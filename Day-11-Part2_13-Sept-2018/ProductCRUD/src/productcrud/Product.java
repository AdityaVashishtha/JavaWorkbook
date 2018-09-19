package productcrud;

public class Product {
    private int pcode;
    private String ptitle;
    private int price;
    private String brand;

    public Product() {
    }

    public Product(int pcode, String ptitle, int price, String brand) {
        this.pcode = pcode;
        this.ptitle = ptitle;
        this.price = price;
        this.brand = brand;
    }

    public int getPcode() {
        return pcode;
    }

    public String getPtitle() {
        return ptitle;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.pcode;
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
        return "Product{" + "pcode=" + pcode + ", ptitle=" + ptitle + ", price=" + price + ", brand=" + brand + '}';
    }
    
    
    
}
