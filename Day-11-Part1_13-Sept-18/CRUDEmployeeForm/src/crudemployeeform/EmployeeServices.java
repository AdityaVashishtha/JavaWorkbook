package crudemployeeform;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class EmployeeServices {
    public ResultSet loadEmployees() {        
        ResultSet rs = null;
        try {
            Connection con = DBConnectionUtil.connenctMysql();
            String sql = "SELECT empno,ename,sal from emp";
            PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs= ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }                
        return rs;        
    }
    
    public ResultSet searchEmployee(int empno) {
        ResultSet rs=null;
        try {
            Connection con = DBConnectionUtil.connenctMysql();
            String sql = "SELECT empno,ename,sal from emp where empno=?";
            PreparedStatement ps = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1, empno);
            rs = ps.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
}
