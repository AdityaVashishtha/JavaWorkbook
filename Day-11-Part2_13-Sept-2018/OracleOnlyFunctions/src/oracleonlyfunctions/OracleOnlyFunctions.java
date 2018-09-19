package oracleonlyfunctions;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OracleOnlyFunctions {

    public static void main(String[] args) {
        try {
            Connection con = DBConnectionUtil.connectOracle();
            DatabaseMetaData dbmd = con.getMetaData();
            String dbName = dbmd.getDatabaseProductName();
            String sql=null;
            PreparedStatement ps= null;
            ResultSet rs=null;
            switch(dbName.toLowerCase()) {
                case "mysql": 
                    sql = "select * from emp limit 2";
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        System.out.println(rs.getString(2));
                    }
                    break;
                case "oracle":
                    sql = "select empname,nvl(comm,0) from emp where rownum<=2";
                    ps = con.prepareStatement(sql);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        System.out.println(rs.getString(2));
                    }
                    //System.out.println("ORACLE CALEED");
                    break;
                default : break;
            }
        } catch (Exception e) {
        }
    }
    
}
