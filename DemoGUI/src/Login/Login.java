/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author CICCC-CIRAC
 */
public class Login extends JFrame implements ActionListener {
    
    JLabel l1, l2;
    JTextField tf1;
    JPasswordField p1;
    JButton btn1;
    
    Login() {
        setSize(800,800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Enter ID:");
        l2 = new JLabel("Enter Password:");
        tf1 = new JTextField();
        p1 = new JPasswordField();
        btn1 = new JButton("Submit");
        
        l1.setBounds(100,30,400,30);
        l2.setBounds(80,70,200,30);
        tf1.setBounds(300,70,200,30);
        p1.setBounds(300,110,200,30);
        btn1.setBounds(150,160,100,30);
       
        
    }
    
    
    public static void main(String[] args) {
//        JFrame f = new JFrame("Password Field");
//        JPasswordField value = new JPasswordField();
//        JLabel l1 = new JLabel("Password:");
//        
//        l1.setBounds(20,100,80,30);
//        value.setBounds(100,100,100,30);
//        
//        f.add(value);
//        f.add(l1);
//        f.setSize(300,300);
//        f.setLayout(null);
//        f.setVisible(true);
    
}

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
