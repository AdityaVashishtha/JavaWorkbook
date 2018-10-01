package com.ecom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aditya
 */
@WebServlet(name = "VerifyUser", urlPatterns = {"/VerifyUser"})
public class VerifyUser extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String type =request.getParameter("usertype");
            boolean savePassword = (request.getParameter("savePassword") != null) ? true : false;
            boolean validUser = false;
            HttpSession session = request.getSession();
            if(type.equalsIgnoreCase("admin")) {
                if(username.equalsIgnoreCase("admin") && password.equals("root"))
                    validUser = true;                
            } else {
                validUser = new UserService().verifyUser(username, password);
            }            
            if(validUser) {
                session.setAttribute("user", username);             
                session.setAttribute("usertype",type);
                if(savePassword) {
                    Cookie cookieUsername = new Cookie("username",username);
                    Cookie cookiePassword = new Cookie("password",password);
                    cookiePassword.setMaxAge(7*24*60*60);
                    cookieUsername.setMaxAge(7*24*60*60);
                    response.addCookie(cookieUsername);
                    response.addCookie(cookiePassword);
                } else {
                    Cookie cookieUsername = new Cookie("username","");
                    Cookie cookiePassword = new Cookie("password","");
                    cookiePassword.setMaxAge(0);
                    cookieUsername.setMaxAge(0);
                    response.addCookie(cookieUsername);
                    response.addCookie(cookiePassword);
                }
                response.sendRedirect("dashboard.jsp");
            } else {
                out.println("<h3>Invalid Username or password or type</h3>");
                out.println("<a href='login.jsp'>Login again!!</a>");
                response.sendRedirect("login.jsp");
            }
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
