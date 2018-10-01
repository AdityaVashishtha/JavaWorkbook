/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconfigfromfile;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.sql.Connection;

/**
 *
 * @author hp
 */
public class DBConfigFromFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {                        
            Connection con = DBConnectionUtil.connect();
            System.out.println(con);
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
