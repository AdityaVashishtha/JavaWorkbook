package taxonproduct;

public class TaxDetails {
    private int price;
    private int serviceTax;
    private int excise;
    private int vat;

    public TaxDetails() {
    }

    public TaxDetails(int price, int serviceTax, int excise, int vat) {
        this.price = price;
        this.serviceTax = serviceTax;
        this.excise = excise;
        this.vat = vat;
    }

    public int getPrice() {
        return price;
    }

    public int getServiceTax() {
        return serviceTax;
    }

    public int getExcise() {
        return excise;
    }

    public int getVat() {
        return vat;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setServiceTax(int serviceTax) {
        this.serviceTax = serviceTax;
    }

    public void setExcise(int excise) {
        this.excise = excise;
    }

    public void setVat(int vat) {
        this.vat = vat;
    }
    
}
