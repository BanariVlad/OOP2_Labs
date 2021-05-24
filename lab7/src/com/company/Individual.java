package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Individual extends JFrame implements ActionListener {
    JTextField textField;

    Individual(String title) {
        super(title);
        setSize(300, 200);
        Container container = getContentPane();
        container.setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter an expression:");
        container.add(label);

        textField = new JTextField(5);
        container.add(textField);
        textField.addActionListener(this);

        JButton button = new JButton("Calculate");
        container.add(button);
        button.addActionListener(this);

        setVisible(true);
    }

    public String findOperator(String expression) {
        return expression.contains("/") ? "\\/" : expression.contains("+") ? "\\+" :
                expression.contains("-") ? "\\-" : expression.contains("*") ? "\\*" : "false";
    }

    public double calculate(String expression) {
        String operator = findOperator(expression);
        String[] array = expression.replaceAll(" ", "").split(operator);
        double result;

        switch (operator) {
            case "\\+" -> result = Double.parseDouble(array[0]) + Double.parseDouble(array[1]);
            case "\\/" -> result = Double.parseDouble(array[0]) / Double.parseDouble(array[1]);
            case "\\-" -> result = Double.parseDouble(array[0]) - Double.parseDouble(array[1]);
            case "\\*" -> result = Double.parseDouble(array[0]) * Double.parseDouble(array[1]);
            default -> throw new IllegalStateException("Unexpected value");
        }

        return result;
    }

    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.isEmpty()) {
            return;
        }

        textField.setText(Double.toString(calculate(textField.getText())));
    }
}

class RunIndividual {
    public static void main(String[] args) {
        Individual window = new Individual("Individual");
    }
}