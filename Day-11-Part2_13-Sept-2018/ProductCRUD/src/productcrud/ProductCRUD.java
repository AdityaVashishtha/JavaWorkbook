package productcrud;

import java.util.HashSet;

public class ProductCRUD {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Product p = ps.getProduct(1);
        System.out.println(p.getPtitle());
        ps.deleteProduct(5);
        p.setBrand("XIAOMI");
        p.setPrice(8000);
        p.setPtitle("MOBILE");
        p.setPcode(5);
        
        ps.addProduct(p);
        HashSet<Product> products = ps.getAllProducts();
        for (Product product : products) {
            System.out.println("ITERATING :: "+product.getPtitle()+" RS. "+product.getPrice());
        }
        p.setPcode(2);
        ps.updateProduct(p);      
        products = ps.getProductsFromBrands("XIAOMI");
        for (Product product : products) {
            System.out.println("ITERATING :: "+product.getPtitle()+" RS. "+product.getPrice());
        }
    }
    
}
