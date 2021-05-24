package com.company;

import javax.swing.*;

public class SimpleWindow extends JFrame {
    SimpleWindow(String title) {
        super(title);
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

class RunSimpleWindow {
    public static void main(String[] args) {
        SimpleWindow window = new SimpleWindow("Simple window");
    }
}