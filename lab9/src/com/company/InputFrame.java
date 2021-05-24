package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InputFrame extends JFrame implements ActionListener {
    String answer;
    JLabel label;

    InputFrame(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton button = new JButton("New Data");
        container.add(button);
        button.addActionListener(this);

        label = new JLabel();
        container.add(label);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        answer = JOptionPane.showInputDialog("What is your name?");
        label.setText("Hello, " + answer);
    }
}

class RunInputFrame {
    public static void main(String[] args) {
        InputFrame window = new InputFrame("Input Frame");
    }
}