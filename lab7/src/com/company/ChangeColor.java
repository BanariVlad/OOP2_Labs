package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeColor extends JFrame implements ActionListener {
    JPanel panel;

    ChangeColor(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        panel = new JPanel();

        JButton buttonRed = new JButton("Red");
        JButton buttonYellow = new JButton("Yellow");
        JButton buttonBlue = new JButton("Blue");

        panel.add(buttonRed);
        panel.add(buttonYellow);
        panel.add(buttonBlue);

        buttonRed.addActionListener(this);
        buttonYellow.addActionListener(this);
        buttonBlue.addActionListener(this);

        container.add(panel);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String color = e.getActionCommand();

        if (color.compareTo("Red") == 0) {
            panel.setBackground(Color.red);
        }else if (color.compareTo("Yellow") == 0) {
            panel.setBackground(Color.yellow);
        } else {
            panel.setBackground(Color.blue);
        }
    }
}

class RunChangeColor {
    public static void main(String[] args) {
        ChangeColor changeColor = new ChangeColor("Change color");
    }
}