/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tagexample;

import java.util.HashSet;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author aditya
 */
public class ShowProductListTag extends SimpleTagSupport {

    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();
        
        try {
            HashSet<Product> hashSet = new HashSet<>();
            hashSet = new ProductService().getAllProducts();
            for (Product product : hashSet) {
                out.println("<li><h4> "+product.getPname()+" | "+product.getPrice()+" </h4></li>");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
