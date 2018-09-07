package productfilter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ProductFilter {
    public static ArrayList<Product> loadProducts(int numbers) {
        String randomBrand[] = {"MI","LG","SAMSUNG"};
        String randomProducts[] = {"PHONE","TV","TAB","CAR","BAG","EARPHONE"};
        ArrayList<Product> products = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
         products.add(new Product(i, randomProducts[(int) (Math.random()*6)], randomBrand[(int) (Math.random()*3)], (int)(10000*Math.random()), (int)(10*Math.random())));   
        }
        return products;
    }
    public static void main(String[] args) {
        ArrayList<Product> products = loadProducts(50);
        Scanner scan = new Scanner(System.in);
        int choice;
        System.out.println("Enter Menu:");
        System.out.println("1.Sort By Product Name");
        System.out.println("2.Sort By Brand Name");
        System.out.println("3.Sort By Price");
        System.out.println("4.Sort By Quantity");        
        System.out.println("5.Filter By Brand");        
        choice = scan.nextInt();
        switch(choice) {
            case 1: 
                products = Utility.sortByProductName(products);
                Utility.displayProducts(products);
                break;
            case 2: 
                products = Utility.sortByBrandName(products);
                Utility.displayProducts(products);
                break;
            case 3: 
                products = Utility.sortByPrice(products);
                Utility.displayProducts(products);
                break;
            case 4: 
                products = Utility.sortByQuantity(products);
                Utility.displayProducts(products);
                break;
            case 5: 
                System.out.println("Enter Brand Name");
                String brand = scan.next();
                Utility.filterByBrand(products, brand);                
                break;
            default: break;
        }
    }    
}
