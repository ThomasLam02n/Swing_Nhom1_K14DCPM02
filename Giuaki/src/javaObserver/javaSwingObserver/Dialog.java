package javaSwingObserver;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dialog {
    private int clicks;
    public Dialog(Main mainWindow) {
        // Create Observable and add Observer		
        final MessageObservable observable = new MessageObservable();





















































        
        observable.addObserver(mainWindow);
        // Display Dialog
        JFrame dialog = new JFrame("Dialog");		
        JButton button = new JButton("Press me");
        button.setFont(new Font("Dialog", Font.PLAIN, 20));
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = "button clicked in dialog [" + ++clicks + "]";
                observable.changeData(data);
            }
        });		
        dialog.add(button);
        dialog.setSize(250, 150);
        dialog.setLocation(600, 200);
        dialog.setVisible(true);
    }
}
