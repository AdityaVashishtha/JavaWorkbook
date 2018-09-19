/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventhandleseparate;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;

/**
 *
 * @author hp
 */
public class EventHandleSeparate extends Frame{
    private Button exit;
    private Button copy;    
    private TextField textField;
    private TextField textField1;        
    
    public void initComponent() {        
        setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
        setVisible(true);
        setSize(500,200);
        textField = new TextField("Text Here");                
        textField.setText("");
        textField1 = new TextField("Text Here");                
        textField1.setText("");
        exit = new Button("Exit");       
        copy = new Button("Copy");               
        exit.setSize(100,50);
        exit.addActionListener(new EventHandler());
        copy.addActionListener(new CopyActionListener(textField,textField1));
        add(textField);
        add(textField1);
        add(copy);        
        add(exit);           
    }
    
    public EventHandleSeparate() {
        initComponent();
    }
    
    public static void main(String[] args) {
        EventHandleSeparate obj = new EventHandleSeparate();
    }
    
}
