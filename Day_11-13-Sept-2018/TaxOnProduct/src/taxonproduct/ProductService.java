package taxonproduct;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.HashSet;

public class ProductService {
    Connection con;
    ResultSet rs;
    public ProductService() {
        con = DBConnectionUtil.connectOracle();
    }
    
    public HashSet<Products> loadAllProducts() {
        HashSet<Products> products = new HashSet<>();
        try {
            String sql = "select * from products";            
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();            
            while(rs.next()) {
                Products p = new Products();
                p.setPcode(rs.getInt(1));
                p.setPname(rs.getString(2));
                p.setPrice(rs.getInt(3));                
                System.out.println(p);
                products.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return products;
    }
    
    public TaxDetails getProductDetails(int pcode) {
        TaxDetails td=null;
        try {
            CallableStatement cb = con.prepareCall("{call calculateTax(?,?,?,?,?)}");
            cb.setInt(1, pcode);
            cb.registerOutParameter(2, Types.INTEGER);
            cb.registerOutParameter(3, Types.INTEGER);
            cb.registerOutParameter(4, Types.INTEGER);
            cb.registerOutParameter(5, Types.INTEGER);
            cb.execute();
            td = new TaxDetails(cb.getInt(2), cb.getInt(3), cb.getInt(4), cb.getInt(5));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return td;
    }
}
