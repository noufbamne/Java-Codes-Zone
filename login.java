
// Create a LOGIN pAGE with userame and password    
import java.awt.Color;
import java.awt.Container;

import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class login extends JFrame {
    JLabel l1, l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;
    Container c;

    login() {
        l1 = new JLabel("Username :");
        l1.setBounds(100, 100, 100, 30);
        c.add(l1);
        t1 = new JTextField();
        t1.setBounds(200, 100, 100, 30);
        c.add(t1);
        l2 = new JLabel("Password :");
        l2.setBounds(100, 150, 100, 30);
        c.add(l2);
        t2 = new JPasswordField();
        t2.setBounds(200, 150, 100, 30);
        c.add(t2);
        b1 = new JButton("Login");
        b1.setBounds(150, 200, 100, 30);
        // b1.c.addActionListener(this);
        c.add(b1);
        b2 = new JButton("Cancel");
        b2.setBounds(270, 200, 100, 30);
        // b2.c.addActionListener(this);
        c.add(b2);
        setLayout(null);
        setVisible(true);
        setSize(500, 500);
        c.setBackground(Color.PINK);
    }

    public static void main(String[] args) {
        new login();
    }
}