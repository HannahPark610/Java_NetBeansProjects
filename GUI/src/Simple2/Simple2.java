/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Simple2;

import java.awt.FlowLayout;
import javax.swing.*;

public class Simple2 extends JFrame {
    JFrame f;
    Simple2() {
        JButton b = new JButton("click");
        b.setBounds(500,100,100,500);
        
        add(b);
        setSize(400,500);
        JButton b1 = new JButton("click her!!!!!!!");
        b1.setBounds(130,100,100,40);
        
        add(b1);
        setLayout(new FlowLayout());
        setVisible(true);
    }
    
    public static void main (String[] args) {
        new Simple2();
    }
    
}
