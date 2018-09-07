
package productcollection;

import java.util.HashSet;


public class ProductCollection {
    
    public static HashSet<Product> loadProducts() {
        String randomBrand[] = {"MI","LG","SAMSUNG"};
        String randomProducts[] = {"PHONE","TV","TAB","CAR","BAG","EARPHONE"};
        HashSet<Product> products = new HashSet<>();
        for (int i = 0; i < 1000; i++) {
         products.add(new Product(i, randomProducts[(int) (Math.random()*6)], randomBrand[(int) (Math.random()*3)], (int)(10000*Math.random()), (int)(10*Math.random())));   
        }
        return products;
    }

    public static void search(HashSet<Product> products , Product query) {
        long startTime = System.nanoTime();
        if(products.contains(query)) {
            System.out.println("FOUND ITEM");
        } else {
            System.out.println("NOT FOUND");
        }
        long endTime = System.nanoTime();
        
        System.out.println(endTime-startTime);
    }
    
    public static void main(String[] args) {        
        
        HashSet<Product> products = loadProducts();                          
        Product searchQuery = new Product(315, "PHONE", "MI", 1000, 1);
        search(products, searchQuery);
                        
    }        
}




/*

None selected

Skip to content
Using Gmail with screen readers

Conversations
2.53 GB (16%) of 15 GB used
Manage
Terms · Privacy · Program Policies
Last account activity: 11 minutes ago
Details

1)  write   class product (pcode,pname,brand,price,qunt)
    a) store 25 product in set .Product are same 
       if the pcode is same 
    b)  overide the hashcode method which return
	for all object & now search product
	and observe  searching time
    c)  return a diff value for  all unequal object
	now search the same object 
	once again  and observe  the search time 

2) write a program  to store 50 products of diff.  types in view Product
   in a collection and give the 
   searching  , sorting  filter  by user end 
   like(price , quntity, brand) 


3) Create a menu based application for mainging
   Employees of an organization in collection.
   (temporary employees, permanent employees)
     Menu
	1. Add New Emp
	2. Remove Emp
	3. View Perm Emp
	4. View Temp Emp
	5. Promote Emp

4) Read the data from multiple file usings
   SequenceInputStream(more than 2).


5) you have the sales data of a company


	2016
		p1
			Domestic
			N	S	E	W
			10	20	30	40

			Export
			N	S	E	W
			15	25	35	45


		p2
			Domestic
			N	S	E	W
			10	20	30	40

			Export
			N	S	E	W
			15	25	35	45

	2017
		p1
			Domestic
			N	S	E	W
			10	20	30	40

			Export
			N	S	E	W
			15	25	35	45


		p2
			Domestic
			N	S	E	W
			10	20	30	40

			Export
			N	S	E	W
			15	25	35	45


1) store the data using appropriate array.
2) find out the total sales during 2 years.
3) find out the product wise sale for 2 years.
4) find out the product wise early sale.
5) find out the sale of region-wise.
6) find out the total domestic sale for 2 years
7) find out the export sale for 2 years.


day-8.txt
Displaying day-8.txt.
*/