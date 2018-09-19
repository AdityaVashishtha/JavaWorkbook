/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array4d;

/**
 *
 * @author aditya
 */
public class Array4D {
    
    public static int salesData[][][][] = new int[2][2][2][4];
    
    public static void initializeArray() {
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        salesData[i][j][k][l] =(int) (Math.random()*100);
                    }
                }
            }
        }
    }
    
    public static void displayArray() {
        for (int[][][] iseses : salesData) {
            for (int[][] ese : iseses) {
                for (int[] is : ese) {
                    for (int i : is) {
                        System.out.print(i+"\t");
                    }
                    System.out.println("");
                }
            }
        }
    }
    
    public static int calculateTotalSales() {
        int sum = 0;
        for (int[][][] iseses : salesData) {
            for (int[][] ese : iseses) {
                for (int[] is : ese) {
                    for (int i : is) {
                       sum += i;
                    }                   
                }
            }
        }
        return sum;
    }
    
    public static void productWiseSales() {
        int productOneSum = 0;
        int productTwoSum = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        if(j == 0)
                            productOneSum += salesData[i][j][k][l];
                        else if( j == 1 )
                            productTwoSum += salesData[i][j][k][l];
                    }
                }
            }
        }        
        System.out.println("Product One Sales:: "+productOneSum);
        System.out.println("Product Two Sales:: "+productTwoSum);
    }
    
    public static void productWiseYearlySales() {
        int productOneSum16 = 0;
        int productTwoSum16 = 0;
        int productOneSum17 = 0;
        int productTwoSum17 = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        if(j == 0 && i == 0)
                            productOneSum16 += salesData[i][j][k][l];
                        else if( j == 1 && i==0 )
                            productTwoSum16 += salesData[i][j][k][l];
                        if(j == 0 && i == 1)
                            productOneSum17 += salesData[i][j][k][l];
                        else if( j == 1 && i==1 )
                            productTwoSum17 += salesData[i][j][k][l];
                    }
                }
            }
        }        
        System.out.println("Product One Sales 2016:: "+productOneSum16);
        System.out.println("Product One Sales 2017:: "+productOneSum17);
        System.out.println("Product Two Sales 2016:: "+productTwoSum16);
        System.out.println("Product Two Sales 201:: "+productTwoSum17);        
    }
    
    public static void regionWiseSales() {
        int northSales = 0;
        int southSales = 0;
        int eastSales = 0;
        int westSales = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        if( l == 0)
                            northSales += salesData[i][j][k][l];
                        else if( l == 1 )
                            southSales += salesData[i][j][k][l];
                        else if( l == 2 )
                            eastSales += salesData[i][j][k][l];
                        else if( l == 3 )
                            westSales += salesData[i][j][k][l];
                    }
                }
            }
        }        
        System.out.println("Product North:: "+northSales);
        System.out.println("Product South:: "+southSales);
        System.out.println("Product East:: "+eastSales);
        System.out.println("Product West:: "+westSales);
    }
    
    
    public static void totalDomestic() {
        int domesticSales = 0;        
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        if(k == 0)
                            domesticSales += salesData[i][j][k][l];                        
                    }
                }
            }
        }        
        System.out.println("Total Domestic Sales:: "+domesticSales);        
    }
    
    public static void totalExportSales() {
        int exportSales = 0;        
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                for (int k = 0; k < salesData[i][j].length; k++) {
                    for (int l = 0; l < salesData[i][j][k].length; l++) {                        
                        if(k == 1)
                            exportSales += salesData[i][j][k][l];                        
                    }
                }
            }
        }        
        System.out.println("Total Export Sales:: "+exportSales);        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        initializeArray();
        displayArray();
        System.out.println("Total Sales is :: " );
        System.out.println(calculateTotalSales());
        productWiseSales();
        regionWiseSales();
        productWiseYearlySales();
        totalDomestic();
        totalExportSales();
    }
    
    
}
