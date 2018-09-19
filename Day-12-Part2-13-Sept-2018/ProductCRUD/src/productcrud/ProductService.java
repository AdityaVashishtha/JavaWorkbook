package productcrud;

import com.oracle.jrockit.jfr.Producer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;

public class ProductService {
    private Connection con;

    public ProductService() {
        con = DBConnectionUtil.connectOracle();
    }
    
    public void addProduct(Product p) {
        try {
            String sql = "INSERT INTO products values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getPcode());
            ps.setString(2, p.getPtitle());
            ps.setInt(3, p.getPrice());
            ps.setString(4, p.getBrand());
            boolean isExecuted = ps.execute();            
            System.out.println("DONE INSERT");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void updateProduct(Product p) {
        try {
            String sql = "UPDATE products set pcode=?,pname=?,price=?,brand=? where pcode=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getPcode());
            ps.setString(2, p.getPtitle());
            ps.setInt(3, p.getPrice());
            ps.setString(4, p.getBrand());
            ps.setInt(5, p.getPcode());
            boolean isExecuted = ps.execute(); 
            System.out.println("DONE UPDATION");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(int pcode) {
        try {
            String sql = "DELETE products where pcode=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pcode);            
            boolean isExecuted = ps.execute(); 
            System.out.println("DONE DELETION");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Product getProduct(int pcode) {
        Product p = null;                
        try {
            String sql = "select * from products where pcode=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pcode);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                p = new Product(rs.getInt("pcode"),rs.getString("pname"),rs.getInt("price"), rs.getString("brand"));
            }            
            System.out.println("DONE SEARCHING");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
    public HashSet<Product> getAllProducts() {
        HashSet<Product> products = new HashSet<>();                
        try {
            String sql = "select * from products";
            PreparedStatement ps = con.prepareStatement(sql);            
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                products.add(new Product(rs.getInt("pcode"),rs.getString("pname"),rs.getInt("price"), rs.getString("brand")));
            }            
            System.out.println("DONE SEARCHING");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public HashSet<Product> getProductsFromBrands(String...brands) {
        HashSet<Product> products = new HashSet<>();                
        try {
            for (String brand : brands) {
                String sql = "select * from products where brand = ?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, brand);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    products.add(new Product(rs.getInt("pcode"),rs.getString("pname"),rs.getInt("price"), rs.getString("brand")));
                }            
            }            
            System.out.println("DONE SEARCHING");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
}
