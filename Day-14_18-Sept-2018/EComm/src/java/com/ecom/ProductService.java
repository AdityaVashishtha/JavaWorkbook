package com.ecom;

import com.sun.scenario.effect.impl.prism.PrCropPeer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;

public class ProductService {
    Connection con;
    PreparedStatement ps;

    public ProductService() {
        con = DBConnectionUtil.connectMysql();
    }
    
    public boolean addProduct(Product product) {
        boolean inserted=false;
        String sql = "insert into ecomm_product (pcode,pname,price,ccode) values (?,?,?,?)";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, product.getPcode());
            ps.setString(2, product.getPname());
            ps.setInt(3, product.getPrice());
            ps.setInt(4, product.getCategory().getCategoryCode());
            int n = ps.executeUpdate();            
            if(n>0)
                inserted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inserted;                
    }
    
    public boolean updateProduct(Product product) {
        boolean updated=false;
        String sql = "update ecomm_product set pcode=?,pname=?,price=?,ccode=? where pcode=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, product.getPcode());
            ps.setString(2, product.getPname());
            ps.setInt(3, product.getPrice());
            ps.setInt(4, product.getCategory().getCategoryCode());
            ps.setInt(5, product.getPcode());
            long n = ps.executeUpdate();
            if(n>0)
                updated = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;                
    }
    
    public boolean removeProduct(int pcode) {
        boolean removed=false;
        String sql = "delete from ecomm_product where pcode=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setInt(1, pcode);
            long n = ps.executeUpdate();
            if(n>0)
                removed = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return removed;                
    }
    
    public Product searchProduct(int pcode) {
        Product product= null;
        String sql = "select pcode,pname,price,ccode,cname from ecomm_product natural join ecomm_category where pcode=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setInt(1, pcode);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Category c = new Category(rs.getInt("ccode"), rs.getString("cname"));
                product = new Product(rs.getInt("pcode"), rs.getString("pname"), rs.getInt("price"), c);               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;                
    }
    
        public HashSet<Product> getProductFromCategory(int ccode) {
        HashSet<Product> products = new HashSet<>();
        String sql = "select pcode,pname,price,ccode,cname from ecomm_product natural join ecomm_category where ccode=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setInt(1, ccode);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                Category c = new Category(rs.getInt("ccode"), rs.getString("cname"));
                Product prd = new Product(rs.getInt("pcode"), rs.getString("pname"), rs.getInt("price"), c);
                products.add(prd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;                
    }
        
}
