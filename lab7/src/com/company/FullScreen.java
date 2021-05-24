package com.company;

import javax.swing.*;
import java.awt.*;

public class FullScreen extends JFrame {
    FullScreen(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit ec = Toolkit.getDefaultToolkit();
        Dimension dimension = ec.getScreenSize();
        int height = dimension.height;
        int width = dimension.width;
        setSize(dimension.width, dimension.height);
        setVisible(true);
    }
}

class Run {
    public static void main(String[] args) {
        FullScreen fullScreen = new FullScreen("FullScreen");
    }
}