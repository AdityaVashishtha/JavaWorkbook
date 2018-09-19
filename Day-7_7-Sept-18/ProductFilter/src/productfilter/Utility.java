package productfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Utility {
    public static ArrayList<Product> sortByBrandName(ArrayList<Product> products) {
        Collections.sort(
                products,
                new Comparator<Product> () {
                    @Override
                    public int compare(Product o1, Product o2) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        return o1.getBrand().compareTo(o2.getBrand());
                    }
                }
        );
        return products;
    }
    
    public static ArrayList<Product> sortByProductName(ArrayList<Product> products) {
        Collections.sort(
                products,
                new Comparator<Product> () {
                    @Override
                    public int compare(Product o1, Product o2) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        return o1.getProductName().compareTo(o2.getProductName());
                    }
                }
        );
        return products;
    }
    
    public static ArrayList<Product> sortByQuantity(ArrayList<Product> products) {
        Collections.sort(
                products,
                new Comparator<Product> () {
                    @Override
                    public int compare(Product o1, Product o2) {
                        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        if(o1.getQuantity() > o2.getQuantity()) {
                            return 1;
                        } else if (o1.getQuantity() < o2.getQuantity()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }
                }
        );
        return products;
    }
    
    public static ArrayList<Product> sortByPrice(ArrayList<Product> products) {
        Collections.sort(products, (Product o1, Product o2) -> {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            if(o1.getPrice()> o2.getPrice()) {
                return 1;
            } else if (o1.getPrice()< o2.getPrice()) {
                return -1;
            } else {
                return 0;
            }
        });
        return products;
    }
    
    public static void filterByBrand(ArrayList<Product> products,String brand) {
        for(Product product: products) {
            if(product.getBrand().equalsIgnoreCase(brand)) {
                System.out.print("Products:");
                System.out.print("\t"+product.getProductCode());
                System.out.print("\t"+product.getProductName());
                System.out.print("\t"+product.getBrand());
                System.out.print("\t"+product.getPrice());
                System.out.print("\t"+product.getQuantity());
                System.out.print("\n");
            }
        }        
    }
    
    public static void displayProducts(ArrayList<Product> products) {
        for(Product product : products) {
            System.out.print("Products:");
            System.out.print("\t"+product.getProductCode());
            System.out.print("\t"+product.getProductName());
            System.out.print("\t"+product.getBrand());
            System.out.print("\t"+product.getPrice());
            System.out.print("\t"+product.getQuantity());
            System.out.print("\n");
        }
    }
    
    public static void searchProduct(int pcode,ArrayList<Product> products) {
        for(Product product : products) {
            if(product.getProductCode() == pcode) {
                System.out.println("PRODUCT FOUND AND IS ::");
                System.out.println(product);
            }
        }
    }
    
    
}
