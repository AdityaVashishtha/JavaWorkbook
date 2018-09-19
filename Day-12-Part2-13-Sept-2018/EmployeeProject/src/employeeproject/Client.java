package employeeproject;

public class Client {
    private int ccode;
    private String name;
    private String address;
    private String mobile;

    public Client(int ccode, String name, String address, String mobile) {
        this.ccode = ccode;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public Client() {
    }

    public int getCcode() {
        return ccode;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setCcode(int ccode) {
        this.ccode = ccode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.ccode;
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
        final Client other = (Client) obj;
        if (this.ccode != other.ccode) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Client{" + "ccode=" + ccode + ", name=" + name + ", address=" + address + ", mobile=" + mobile + '}';
    }
    
    
    
}
