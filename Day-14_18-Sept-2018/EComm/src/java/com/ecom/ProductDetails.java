/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@WebServlet(name = "ProductDetails", urlPatterns = {"/ProductDetails"})
public class ProductDetails extends HttpServlet {

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
            int pcode = Integer.parseInt(request.getParameter("pcode"));
            Product product = new ProductService().searchProduct(pcode);            
            Cookie cookies [] = request.getCookies();
            Cookie pcodeCookie = null;
            int visitsCount = 0;
            for (Cookie cooky : cookies) {
                if(cooky.getName().equals("p-"+pcode)) {
                    pcodeCookie = cooky;
                }
            }
            if(pcodeCookie != null) {
                visitsCount += Integer.parseInt(pcodeCookie.getValue());
                visitsCount++;
                pcodeCookie = new Cookie("p-"+pcode, ""+visitsCount);
            } else {
                visitsCount = 1;
                pcodeCookie = new Cookie("p-"+pcode, ""+ visitsCount);
            }                        
            if(visitsCount > 5 && visitsCount <= 10) {
                product.setPrice((int)(product.getPrice()*1.05));
            } else if(visitsCount > 10) {
                product.setPrice((int)(product.getPrice()*1.10));
            }
            pcodeCookie.setMaxAge(7*24*60*60);
            response.addCookie(pcodeCookie);
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductDetails</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3>Product Details</h3>");
            out.print("<h4>"+product.getPname()+" </h4>");
            out.print("<h4>"+product.getPcode()+" </h4>");
            out.print("<h4>"+product.getPrice()+" </h4>");
            out.print("<h4>"+product.getCategory().getCategoryName()+" </h4>");
            out.println("<hr>");
            HttpSession session = request.getSession();
            String username= (String) session.getAttribute("usertype");
            if(username.equals("admin")) {
                out.println("<a href='updateProduct.jsp?pcode="+product.getPcode()+"'>Update Product</a> | ");
                out.println("<a href='DeleteProduct?pcode="+product.getPcode()+"'>Delete Product</a> | ");
            }
            out.println("<a href='dashboard.jsp'>Home</a> | ");
            out.println("<a href='ExploreStore'>Store</a> | ");
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
