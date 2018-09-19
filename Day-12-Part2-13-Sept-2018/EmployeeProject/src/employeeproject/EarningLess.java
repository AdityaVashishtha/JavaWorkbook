package employeeproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EarningLess {
    Connection con;

    public EarningLess() {
        con = DBConnectionUtil.connectOracle();
    }
    
    public void printLessEarnerWithoutAggregation() {
        try {
            String sql = "select * from emp";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int avgSal = 0;
            int count =0;
            while(rs.next()) {
                avgSal += rs.getInt("sal");
                count++;                        
            }
            avgSal /= count;    
            sql = "select * from emp where sal < ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, avgSal);
            rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("EMPLOYE NAME: "+rs.getString("ename"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void printLessEarnerWithAggregation() {
        try {
            String sql = "select * from emp where sal < (select avg(sal) from emp)";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();                        
            while(rs.next()) {
                System.out.println("EMPLOYE NAME: "+rs.getString("ename"));
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) {
        EarningLess eLess = new EarningLess();
        eLess.printLessEarnerWithoutAggregation();
        
        System.out.println("WITH AGGREGATION FUNCTION");
        eLess.printLessEarnerWithAggregation();
    }
}
