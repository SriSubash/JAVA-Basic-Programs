/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperature extends JFrame implements ActionListener {
    JTextField inputField;
    JLabel outputLabel;
    JRadioButton celsiusRadioButton, fahrenheitRadioButton;

    public Temperature() {
        super("Temperature Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter temperature: "));
        inputField = new JTextField(10);
        inputPanel.add(inputField);
        mainPanel.add(inputPanel, BorderLayout.NORTH);

        JPanel outputPanel = new JPanel();
        outputLabel = new JLabel("");
        outputPanel.add(outputLabel);
        mainPanel.add(outputPanel, BorderLayout.CENTER);

        JPanel radioPanel = new JPanel(new GridLayout(1, 2));
        celsiusRadioButton = new JRadioButton("Celsius");
        celsiusRadioButton.addActionListener(this);
        fahrenheitRadioButton = new JRadioButton("Fahrenheit");
        fahrenheitRadioButton.addActionListener(this);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(celsiusRadioButton);
        buttonGroup.add(fahrenheitRadioButton);
        radioPanel.add(celsiusRadioButton);
        radioPanel.add(fahrenheitRadioButton);
        mainPanel.add(radioPanel, BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = inputField.getText().trim();
        if (!input.isEmpty()) {
            try {
                double temperature = Double.parseDouble(input);
                if (celsiusRadioButton.isSelected()) {
                    double converted = (temperature * 9.0 / 5.0) + 32.0;
                    outputLabel.setText(String.format("%.1f Celsius = %.1f Fahrenheit", temperature, converted));
                } else if (fahrenheitRadioButton.isSelected()) {
                    double converted = (temperature - 32.0) * 5.0 / 9.0;
                    outputLabel.setText(String.format("%.1f Fahrenheit = %.1f Celsius", temperature, converted));
                }
            } catch (NumberFormatException ex) {
                outputLabel.setText("Invalid input: " + input);
            }
        } else {
            outputLabel.setText("");
        }
    }

    public static void main(String[] args) {
        Temperature converter = new Temperature();
        converter.setVisible(true);
    }
}
