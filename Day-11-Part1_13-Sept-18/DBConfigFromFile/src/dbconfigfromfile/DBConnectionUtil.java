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
            File file = new File("./src/dbconfigfromfile/config.txt");            
            if(file.exists()) {
                FileInputStream fis= new FileInputStream(file);
                byte b[] = new byte[fis.available()];
                fis.read(b);
                String configData = new String(b);
                String config[] = configData.split(",");
                if(config.length == 4) {
                    driver = config[0].split("=")[1].trim();
                    url = config[1].split("=")[1].trim();
                    username = config[2].split("=")[1].trim();
                    password = config[3].split("=").length > 1 ? config[3].split("=")[1].trim() : "" ;   
                    System.out.println(driver);
                    System.out.println(url);
                    System.out.println(username);
                    System.out.println(password);
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
