package eventhandleseparate;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CopyActionListener implements ActionListener {
    TextField tf1;
    TextField tf2;

    public CopyActionListener(TextField tf1,TextField tf2) {
        this.tf1 = tf1;
        this.tf2 = tf2;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //EventHandleSeparate.textField1.setText(EventHandleSeparate.textField.getText());
        tf2.setText(tf1.getText());
    }
    
}
