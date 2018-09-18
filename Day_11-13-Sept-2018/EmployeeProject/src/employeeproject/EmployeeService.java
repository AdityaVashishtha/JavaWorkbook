package employeeproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeService {
    Connection con;
    ResultSet rs;
    Project project;
    Client client;

    public EmployeeService() {
        con = DBConnectionUtil.connectOracle();
    }
    
    public Employee getEmployeeDetails(int ecode) {
        Employee emp = null;
        try {
            String sql = "select * from new_emp where empno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ecode);
            rs = ps.executeQuery();            
            if(rs.next()) {
                emp = new Employee( rs.getInt("ecode")
                        , rs.getString("empno")
                        , rs.getInt("sal")
                        , rs.getInt("pcode"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
    
    public Employee getCompleteEmployeeDetails(int ecode) {
        Employee emp = null;        
        try {
            String sql = "select * from new_emp natural join new_project natural join new_client";
            PreparedStatement ps = con.prepareStatement(sql);            
            rs = ps.executeQuery();            
            System.out.println("SOMETHING");
            if(rs.next()) {
                emp = new Employee( rs.getInt("ecode")
                        , rs.getString("ecode")
                        , rs.getInt("sal")
                        , rs.getInt("pcode"));
                Client client = new Client(
                        rs.getInt("ccode"),
                        rs.getString("cname"),
                        rs.getString("address"),
                        rs.getString("mobile")
                );                
                Project project = new Project(rs.getInt("pcode"), rs.getString("pname"), rs.getInt("ccode"));
                emp.project = project;
                emp.client = client;                        
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }
}
