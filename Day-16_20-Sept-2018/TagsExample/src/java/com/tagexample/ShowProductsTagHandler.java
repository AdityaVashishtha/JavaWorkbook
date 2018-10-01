/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tagexample;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author aditya
 */
public class ShowProductsTagHandler extends SimpleTagSupport {
    private int pcode;
    /**
     * Called by the container to invoke this tag. The implementation of this
     * method is provided by the tag library developer, and handles all tag
     * processing, body iteration, etc.
     */
    public ShowProductsTagHandler() {
    }

    public ShowProductsTagHandler(int pcode) {
        this.pcode = pcode;
    }

    public int getPcode() {
        return pcode;
    }

    public void setPcode(int pcode) {
        this.pcode = pcode;
    }

    
    
    @Override
    public void doTag() throws JspException {
        JspWriter out = getJspContext().getOut();        
        try {
            int pc = getPcode();
            Product p = new ProductService().searchProduct(pc);
            if(p != null) {
                out.println("<h2>Name:: "+p.getPname()+"</h2>");
                out.println("<h2>Code:: "+p.getPcode()+"</h2>");
                out.println("<h2>Price:: "+p.getPrice()+"</h2>");
                out.println("<h2>Category:: "+p.getCategory().getCategoryName()+"</h2>");
            }                
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
