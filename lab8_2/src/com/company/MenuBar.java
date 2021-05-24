package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar extends JFrame implements ActionListener {
    MenuBar(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Operations 1");
        JMenu menu2 = new JMenu("Operations 2");
        menuBar.add(menu1);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        JMenuItem menuItem11 = new JMenuItem("Operation 11");
        JMenuItem menuItem12 = new JMenuItem("Operation 12");
        menu1.add(menuItem11);
        menu1.add(menuItem12);
        menuItem11.addActionListener(this);
        menuItem12.addActionListener(this);

        JMenuItem menuItem21 = new JMenuItem("Operation 21");
        JMenuItem menuItem22 = new JMenuItem("Operation 22");
        menu2.add(menuItem21);
        menu2.add(menuItem22);
        menuItem21.addActionListener(this);
        menuItem22.addActionListener(this);

        JMenu others = new JMenu("Others");
        menu1.add(others);
        JMenuItem menuItem131 = new JMenuItem("Operation 131");
        JMenuItem menuItem132 = new JMenuItem("Operation 132");
        others.add(menuItem131);
        others.add(menuItem132);
        menuItem131.addActionListener(this);
        menuItem132.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.compareTo("Operation 11") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 11");
        }

        if (button.compareTo("Operation 12") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 12");
        }

        if (button.compareTo("Operation 21") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 21");
        }

        if (button.compareTo("Operation 22") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 22");
        }

        if (button.compareTo("Operation 131") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 131");
        }

        if (button.compareTo("Operation 132") == 0) {
            JOptionPane.showMessageDialog(this, "Operation 132");
        }
    }
}

class RunMenuBar {
    public static void main(String[] args) {
        MenuBar window = new MenuBar("Menu Bar");
    }
}