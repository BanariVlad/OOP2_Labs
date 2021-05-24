package individual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartsWithFrame extends JFrame implements ActionListener {
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;

    StartsWithFrame(String title) {
        super(title);
        setSize(300, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        label1 = new JLabel("Enter the fraze");
        label2 = new JLabel("Enter substring");
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
        boolean compare = textField1.getText().startsWith(textField2.getText());
        boolean compareWithIgnore = textField1.getText().endsWith(textField2.getText());


        JOptionPane.showMessageDialog(this, "StartWith = " + compare +
                "\nEndWith = " + compareWithIgnore);
    }
}

class RunStartsWithFrame {
    public static void main(String[] args) {
        StartsWithFrame window = new StartsWithFrame("StartsWithFrame");
    }
}