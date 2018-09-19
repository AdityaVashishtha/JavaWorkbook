package taxonproduct;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
    public static Connection connectOracle() {
        Connection con = null;        
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String user = "scott";
        String password = "tiger";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public static Connection connectMysql() {
        Connection con = null;        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/wpdata";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
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
