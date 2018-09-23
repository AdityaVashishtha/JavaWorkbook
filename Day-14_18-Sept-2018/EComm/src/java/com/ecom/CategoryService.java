package com.ecom;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;

public class CategoryService {
    Connection con;
    PreparedStatement ps;

    public CategoryService() {
        con = DBConnectionUtil.connectMysql();
    }
    
    public HashSet<Category> getCategories() {
        HashSet<Category> categories = new HashSet<>();
        try {
            String sql = "select ccode, cname from ecomm_category";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                categories.add(new Category(rs.getInt("ccode"), rs.getString("cname")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return categories;
    }
}
