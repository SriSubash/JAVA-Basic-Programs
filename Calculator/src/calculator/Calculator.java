
package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    private TextField num1Field, num2Field, resultField;
    private Label num1Label, num2Label, resultLabel;
    private Button addButton, subtractButton, multiplyButton, divideButton, modButton, clearButton;

    public Calculator() {
        // set window properties
        setTitle("Calculator");
        setSize(300, 200);
        setLocationRelativeTo(null);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // create components
        num1Field = new TextField();
        num2Field = new TextField();
        resultField = new TextField();
        num1Label = new Label("Number 1:");
        num2Label = new Label("Number 2:");
        resultLabel = new Label("Result:");
        addButton = new Button("+");
        subtractButton = new Button("-");
        multiplyButton = new Button("*");
        divideButton = new Button("/");
        modButton = new Button("%");
        clearButton = new Button("Clear");

        // add components to panel
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(num1Label);
        panel.add(num1Field);
        panel.add(num2Label);
        panel.add(num2Field);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(modButton);
        panel.add(clearButton);

        // add action listeners to buttons
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        modButton.addActionListener(this);
        clearButton.addActionListener(this);

        // add panel to frame
        add(panel);

        // show window
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get numbers from text fields
        double num1 = Double.parseDouble(num1Field.getText());
        double num2 = Double.parseDouble(num2Field.getText());
        double result = 0;

        // perform operation based on button clicked
        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            result = num1 / num2;
        } else if (e.getSource() == modButton) {
            result = num1 % num2;
        } else if (e.getSource() == clearButton) {
            num1Field.setText("");
            num2Field.setText("");
            resultField.setText("");
            return;
        }

        // set result field text
        resultField.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

