import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/SaveUser"})
public class SaveUser extends HttpServlet {
    Connection con;
    PreparedStatement ps;
    
    @Override
    public void init() throws ServletException {
        con = DBConnectionUtil.connectMysql();
        try {
            String sql = "insert into new_users (username,password,gender,name,city,degree,interests) values (?,?,?,?,?,?,?)";
            ps = con.prepareCall(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String name = request.getParameter("name");
            String city = request.getParameter("city");
            String degree = request.getParameter("degree");
            String interest[] = request.getParameterValues("interest");
            String interests = "";
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>SaveUser</title>");            
            out.println("</head>");
            out.println("<body>");                        
            if(interest != null) {
                for (String temp : interest) {
                    interests += "," + temp;
                }
            }            
            try {                
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, gender);
                ps.setString(4, name);
                ps.setString(5, city);
                ps.setString(6, degree);
                ps.setString(7, interests);
                int n = ps.executeUpdate();
                if(n>0) {
                    out.println("<h3>REGISTRATION DONE</h3>");
                    out.println("<a href='login.html'>Login Here</a>");
                } else {
                    out.println("<h3>REGISTRATION Failed</h3>");
                    out.println("<a href='register.html'>Register Here</a>");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            out.println("</body>");
            out.println("</html>");            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
