package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame implements ActionListener {
    JComboBox<String> list;

    ComboBox(String title) {
        super(title);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JLabel selector = new JLabel("Select");
        container.add(selector);
        list = new JComboBox<String>();
        list.addItem("Math");
        list.addItem("Informatica");
        list.addItem("English");
        list.addItem("Other");
        list.setSelectedItem(2);
        container.add(list);

        JButton button = new JButton("What did I choose?");
        container.add(button);

        button.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, list.getSelectedItem());
    }
}

class RunComboBox {
    public static void main(String[] args) {
        ComboBox comboBox = new ComboBox("ComboBox");
    }
}