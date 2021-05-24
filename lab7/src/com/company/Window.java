package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    Window(String name, int width, int height, int right, int left) {
        super(name);
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(right, left);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        container.add(button1);
        container.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().compareTo("Button1") == 0) {
            JOptionPane.showMessageDialog(this, "Button 1 is clicked");
        } else {
            JOptionPane.showMessageDialog(this, "Button 2 is clicked");
        }
    }
}