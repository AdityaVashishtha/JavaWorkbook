package taxonproduct;

public class Products {
    private int pcode;
    private String pname;
    private int price;

    public Products(int pcode, String pname, int price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }

    public Products() {
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

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "pcode=" + pcode + ", pname=" + pname + ", price=" + price + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.pcode;
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
        final Products other = (Products) obj;
        if (this.pcode != other.pcode) {
            return false;
        }
        return true;
    }
    
    
}
