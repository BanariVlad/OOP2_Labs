package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OptionDialog extends JFrame implements ActionListener {
    OptionDialog(String title) {
        super(title);
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton button = new JButton("Click");
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object[] buttons = {"Button 1", "Button 2", "Button 3"};
        int optionDialog = JOptionPane.showOptionDialog(this, "Click to button",
                "Trying Option Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, buttons, buttons[2]);

        if (optionDialog == 0) {
            JOptionPane.showMessageDialog(this, "Button 1");
        } else if (optionDialog == 1) {
            JOptionPane.showMessageDialog(this, "Button 2");
        } else {
            JOptionPane.showMessageDialog(this, "Button 3");
        }
    }
}

class RunOptionDialog {
    public static void main(String[] args) {
        OptionDialog window = new OptionDialog("Option Dialog");
    }
}