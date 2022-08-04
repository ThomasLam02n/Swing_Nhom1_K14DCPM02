package Swing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MinMax2 extends JFrame implements ActionListener{
    private JButton btn;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    private double min, max;
    private JFrame frame;
    private JPanel panel1, panel2 , panel3;

    public MinMax2(String s) {
        frame = new JFrame("Tìm số lớn số nhỏ");

        JLabel num1 = new JLabel("Số thứ nhất: ");
        tf1 = new JTextField();
        JLabel num2 = new JLabel("Số thứ hai: ");
        tf2 = new JTextField();
        JLabel num3 = new JLabel("Số thứ ba: ");
        tf3 = new JTextField();

        panel1 = new JPanel(); 
        panel1.setLayout(new GridLayout(3,2));  //Tạo một grid layout với số hàng và cột đã cho, và không có khoảng cách giữa các thành phần.
        panel1.add(num1); 
        panel1.add(tf1); 
        panel1.add(num2); 
        panel1.add(tf2);
        panel1.add(num3);
        panel1.add(tf3);

        btn = new JButton("Kết quả");
        JLabel min = new JLabel("Min: ");
        tf4 = new JTextField();
        tf4.setEditable(false); // setEnabled()tính của lớp này, nó không hiển thị bất kỳ ảnh hưởng nào trên trường văn bản và nó vẫn được kích hoạt

        JLabel max = new JLabel("Max: ");
        tf5 = new JTextField();   
        tf5.setEditable(false);

        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3,2));

        panel2 = new JPanel();
        panel2.add(btn, BorderLayout.CENTER);// BorderLayout trong Java Swing sắp xếp các thành phần để phù hợp với 5 miền: EAST, WEST, SOUTH, NORTH và CENTER.
        
        
        panel3.add(min);
        panel3.add(tf4);
        panel3.add(max);
        panel3.add(tf5);
        

        frame.add(panel1, BorderLayout.NORTH); 
        
        frame.add(panel2, BorderLayout.CENTER);
        frame.add(panel3, BorderLayout.SOUTH); 

        frame.setLocation(360, 180);
 
        btn.addActionListener(this);

       frame.setSize(350, 200);
        frame.setVisible(true); //  thiết lập khả năng hiển thị của thành phần. Nó theo mặc định là false (ẩn)
        
    }


    private void min()
    {
        if (Double.parseDouble(tf1.getText()) <= Double.parseDouble(tf2.getText()) // phương thức nhập
        && Double.parseDouble(tf1.getText()) <= Double.parseDouble(tf3.getText())){
            min = Double.parseDouble(tf1.getText());
        }else if (Double.parseDouble(tf2.getText()) <= Double.parseDouble(tf1.getText()) 
        && Double.parseDouble(tf2.getText()) <= Double.parseDouble(tf3.getText())){
            min = Double.parseDouble(tf2.getText());
        }else if(Double.parseDouble(tf3.getText()) <= Double.parseDouble(tf1.getText()) 
        && Double.parseDouble(tf3.getText()) <= Double.parseDouble(tf2.getText())){
            min = Double.parseDouble(tf3.getText());
        }else{
            min = 0;
        }
        tf4.setText(String.valueOf(min));
    }

    private void max()
    {
        if (Double.parseDouble(tf1.getText()) >= Double.parseDouble(tf2.getText()) 
        && Double.parseDouble(tf1.getText()) >= Double.parseDouble(tf3.getText())){
            max = Double.parseDouble(tf1.getText());
        }else if (Double.parseDouble(tf2.getText()) >= Double.parseDouble(tf1.getText()) 
        && Double.parseDouble(tf2.getText()) >= Double.parseDouble(tf3.getText())){
            max = Double.parseDouble(tf2.getText());
        }else if(Double.parseDouble(tf3.getText()) >= Double.parseDouble(tf1.getText()) 
        && Double.parseDouble(tf3.getText()) >= Double.parseDouble(tf2.getText())){
            max = Double.parseDouble(tf3.getText());
        }else{
            max = 0;
        }
        tf5.setText(String.valueOf(max));
    }

    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getActionCommand()=="Kết quả") {
            if(tf1.getText().equals("") || tf2.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Bạn chưa nhập đủ"); // JOptionPane cho phép chúng ta nhanh chóng tạo ra các hộp thoại với các văn bản, icon, tiêu đề khác nhau.
            }else {
                // minMax();
                min();
                max();
            }
        }
                        
    }
    
}