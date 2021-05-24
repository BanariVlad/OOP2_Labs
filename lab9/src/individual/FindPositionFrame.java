package individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FindPositionFrame extends JFrame implements ActionListener {
    JLabel label;
    JTextField textField;
    JTextField findField;

    FindPositionFrame(String title) {
        super(title);
        setSize(300, 120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label = new JLabel("Enter a fraze");
        textField = new JTextField(20);
        findField = new JTextField(5);
        JButton button = new JButton("Find");

        container.add(label);
        container.add(textField);
        container.add(findField);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int pos = textField.getText().indexOf(findField.getText());

        JOptionPane.showMessageDialog(this, "The substring is situated at " + pos + " position");
    }
}

class RunFindPositionFrame {
    public static void main(String[] args) {
        FindPositionFrame window = new FindPositionFrame("Find Position");
    }
}