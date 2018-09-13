package crudemployeeform;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
    
   
    public static Connection connenctMysql() {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/wpdata";
        String username = "root";
        String password = "root";    
        Connection con = null;
        try {
            Class driverClass = Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);                       
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return con;
    }
    
    
     public static Connection connectOracle() {
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String username = "scott";
        String password = "tiger";    
        Connection con = null;
         try {
            Class driverClass = Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
     
    public static void main(String[] args) {
        Connection con = DBConnectionUtil.connectOracle();
        System.out.println(con);
    }
    
}
