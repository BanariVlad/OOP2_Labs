package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LengthFrame extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;

    LengthFrame(String title) {
        super(title);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel("Enter a fraze");
        textField = new JTextField(25);
        JButton button = new JButton("Resolve");

        container.add(label);
        container.add(textField);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        int textLength = textField.getText().length();

        JOptionPane.showMessageDialog(this, "The string length is: " + textLength);
    }
}

class RunLengthFrame {
    public static void main(String[] args) {
        LengthFrame window = new LengthFrame("Length Frame");
    }
}