package javaSwingObserver;

import java.awt.Font;
import java.util.Observable;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main implements java.util.Observer {

    private JLabel label;
    @Override // Observer interface's implemented method
    public void update(Observable o, Object data) {	
        label.setText((String) data); // displays new text in JLabel
    }
    public Main() {	
        JFrame frame = new JFrame("Main Window");
        frame.getRootPane().setBorder(
            BorderFactory.createEmptyBorder(20, 20, 20, 20));		
        label = new JLabel("Click button in Dialog...");
        label.setFont(new Font("Dialog", Font.PLAIN, 20));	
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocation(200, 200);
        frame.setVisible(true);
    }
    
}
