package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox extends JFrame implements ActionListener {
    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    CheckBox(String title) {
        super(title);
        setSize(300, 200);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Select");
        container.add(label);
        checkBox1 = new JCheckBox("Math");
        checkBox2 = new JCheckBox("Informatica");
        checkBox3 = new JCheckBox("English");
        checkBox4 = new JCheckBox("Other");

        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);
        container.add(checkBox4);

        JButton button = new JButton("What did I choose?");
        container.add(button);
        button.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (checkBox1.isSelected()) {
            System.out.println(checkBox1.getText());
        }

        if (checkBox2.isSelected()) {
            System.out.println(checkBox2.getText());
        }

        if (checkBox3.isSelected()) {
            System.out.println(checkBox3.getText());
        }

        if (checkBox4.isSelected()) {
            System.out.println(checkBox4.getText());
        }
    }
}

class RunCheckBox {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox("CheckBox");
    }
}