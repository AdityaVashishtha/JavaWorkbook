package com.ecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {
    Connection con;
    PreparedStatement ps;

    public UserService() {
        con = DBConnectionUtil.connectMysql();
    }
    
    
    
    public boolean addUser(User user) {
        boolean inserted=false;
        String sql = "insert into ecomm_user (username,name,city,gender,password) values (?,?,?,?,?)";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setString(3, user.getCity());
            ps.setString(4, user.getGender());
            ps.setString(5, user.getPassword());
            long n = ps.executeUpdate();
            if(n>0)
                inserted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inserted;                
    }
    
    public boolean updateUser(User user) {
        boolean updated=false;
        String sql = "update ecomm_user set username=?,name=?,city=?,gender=?,password=? where username=?";
        try {
            ps = con.prepareCall(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getName());
            ps.setString(3, user.getCity());
            ps.setString(4, user.getGender());
            ps.setString(5, user.getPassword());
            ps.setString(6,user.getUsername());
            long n = ps.executeUpdate();
            if(n>0)
                updated = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;                
    }
    
    public boolean verifyUser(String username,String password) {
        boolean validUser=false;
        String sql = "select username from ecomm_user where username=? and password=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                validUser = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return validUser;                
    }
    
    public User fetchUser(String username) {
        User user=null;
        String sql = "select * from ecomm_user where username=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setString(1, username);            
            ResultSet rs = ps.executeQuery();
            if(rs.next())
                user = new User(username, rs.getString("name"), rs.getString("city"), rs.getString("gender"), rs.getString("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;                
    }
}
