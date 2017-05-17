/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple;

import javax.swing.*;
public class Simple {
    JFrame f;
    Simple() {
    f = new JFrame();
    
    JButton b = new JButton("click");
    b.setBounds(130,100,100,40);
    
    f.add(b);
    
    f.setSize(400,500);
    f.setLayout(null);
    f.setVisible(true);
    }
    
    public static void main(String[] args) {
        Simple simple = new Simple();
    }
}
