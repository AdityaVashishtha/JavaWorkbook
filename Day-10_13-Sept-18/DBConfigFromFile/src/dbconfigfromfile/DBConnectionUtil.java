package dbconfigfromfile;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
     public static Connection connect() {        
        String driver="";
        String url="";
        String username="";
        String password="";    
        Connection con = null;
        try {
            File file = new File("C:\\Users\\hp\\Documents\\Aditya_WP\\CoreJava\\Day-10_13-Sept-18\\DBConfigFromFile\\src\\dbconfigfromfile\\config.txt");
            if(file.exists()) {
                FileInputStream fis= new FileInputStream(file);
                byte b[] = new byte[fis.available()];
                fis.read(b);
                String configData = new String(b);
                String config[] = configData.split("\n");
                if(config.length == 4) {
                    driver = config[0].trim();
                    url = config[1].trim();
                    username = config[2].trim();
                    password = config[3].trim();   
                    try {
                        Class driverClass = Class.forName(driver);
                        con = DriverManager.getConnection(url, username, password);                       
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Some error in config file format");
                }                
            }   else {
                System.out.println("SOME THING");
            }         
        } catch (Exception e) {
            e.printStackTrace();
        }                                        
        return con;
    }
     
     public static void main(String[] args) {
        Connection con = DBConnectionUtil.connect();
         System.out.println(con);
    }
}
