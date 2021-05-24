package individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CompareFrame extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;

    CompareFrame(String title) {
        super(title);
        setSize(300, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Enter the first fraze");
        label2 = new JLabel("Enter the second fraze");
        textField1 = new JTextField(25);
        textField2 = new JTextField(25);
        JButton button = new JButton("Find");

        container.add(label1);
        container.add(textField1);
        container.add(label2);
        container.add(textField2);
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String compare = textField1.getText().compareTo(textField2.getText()) == 0 ? "equals" : "not equals";
        String compareWithIgnore = textField1.getText().compareToIgnoreCase(textField2.getText()) == 0 ? "equals" : "not equals";


        JOptionPane.showMessageDialog(this, "Compared strings is " + compare +
                "\nCompared strings with ignore case is " + compareWithIgnore);
    }
}

class RunCompareFrame {
    public static void main(String[] args) {
        CompareFrame window = new CompareFrame("Compare Frame");
    }
}