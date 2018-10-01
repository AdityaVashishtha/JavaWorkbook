package com.productMVC;

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
    
    public boolean addProductBean(ProductBean product) {
        boolean inserted=false;
        String sql = "insert into ecomm_product (pcode,pname,price,ccode) values (?,?,?,?)";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, product.getPcode());
            ps.setString(2, product.getPname());
            ps.setInt(3, product.getPrice());
            ps.setInt(4, product.getCcode());
            int n = ps.executeUpdate();            
            if(n>0)
                inserted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return inserted;                
    }
    
    public boolean updateProductBean(ProductBean product) {
        boolean updated=false;
        String sql = "update ecomm_product set pcode=?,pname=?,price=?,ccode=? where pcode=?";
        try {
            ps = con.prepareCall(sql);
            ps.setInt(1, product.getPcode());
            ps.setString(2, product.getPname());
            ps.setInt(3, product.getPrice());
            ps.setInt(4, product.getCcode());
            ps.setInt(5, product.getPcode());
            long n = ps.executeUpdate();
            if(n>0)
                updated = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return updated;                
    }
    
    public boolean removeProductBean(int pcode) {
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
    
    public ProductBean searchProductBean(int pcode) {
        ProductBean product= null;
        String sql = "select pcode,pname,price,ccode,cname from ecomm_product natural join ecomm_category where pcode=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setInt(1, pcode);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {                
                product = new ProductBean( rs.getString("pname"),rs.getInt("pcode"), rs.getInt("price"), rs.getInt("ccode"));               
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;                
    }
    
        public HashSet<ProductBean> getProductFromCategory(int ccode) {
        HashSet<ProductBean> products = new HashSet<>();
        String sql = "select pcode,pname,price,ccode,cname from ecomm_product natural join ecomm_category where ccode=?";
        try {
            ps = con.prepareCall(sql);            
            ps.setInt(1, ccode);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {              
                ProductBean prd = new ProductBean( rs.getString("pname"),rs.getInt("pcode"), rs.getInt("price"), rs.getInt("ccode"));               
                products.add(prd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;                
    }
        
}
