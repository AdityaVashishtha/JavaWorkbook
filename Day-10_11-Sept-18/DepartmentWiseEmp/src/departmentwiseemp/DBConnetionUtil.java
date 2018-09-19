/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package departmentwiseemp;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class DBConnetionUtil {
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
        Connection con = DBConnetionUtil.connectOracle();
         System.out.println(con);
    }
}
