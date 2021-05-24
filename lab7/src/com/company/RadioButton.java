package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

public class RadioButton extends JFrame implements ActionListener {
    ButtonGroup group;

    RadioButton(String title) {
        super(title);
        setSize(300, 200);

        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Select");
        container.add(label);

        JRadioButton radioButton1 = new JRadioButton("Math");
        JRadioButton radioButton2 = new JRadioButton("Informatica");
        JRadioButton radioButton3 = new JRadioButton("English");
        JRadioButton radioButton4 = new JRadioButton("Other");

        container.add(radioButton1);
        container.add(radioButton2);
        container.add(radioButton3);
        container.add(radioButton4);

        JButton button = new JButton("What did I choose?");
        container.add(button);
        button.addActionListener(this);

        group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Enumeration enumeration1 = group.getElements();

        while (enumeration1.hasMoreElements()) {
            JRadioButton radioButton = (JRadioButton) enumeration1.nextElement();

            if (radioButton.isSelected()) {
                System.out.println(radioButton.getText());
            }
        }
    }
}

class RunRadioButton {
    public static void main(String[] args) {
        RadioButton window = new RadioButton("RadioButton");
    }
}