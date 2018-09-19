package loginregistration;

import java.sql.Connection;

public class LoginRegistration {

    public static void main(String[] args) {
        try {
         Connection con = DBConnectionUtil.connenctMysql();   
         if(con != null) {
             
         } else {
             System.out.println("DBConnectionFailed");
         }
        } catch (Exception e) {
            e.printStackTrace();
        }               
    }
    
}
