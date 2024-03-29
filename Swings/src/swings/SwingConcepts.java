/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingConcepts extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JCheckBox checkBox1, checkBox2, checkBox3;
    JTextField nameField, passwordField;
    int x=0;

    public SwingConcepts() {
        super("Swing Components Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel labelsPanel = new JPanel(new GridLayout(3, 1));
        label1 = new JLabel("Label One");
        label2 = new JLabel("Label Two");
        label3 = new JLabel("Label Three");
        labelsPanel.add(label1);
        labelsPanel.add(label2);
        labelsPanel.add(label3);
        mainPanel.add(labelsPanel, BorderLayout.NORTH);

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 3));
        JButton yesButton = new JButton("Yes");
        yesButton.addActionListener(this);
        JButton noButton = new JButton("No");
        noButton.addActionListener(this);
        JButton undecidedButton = new JButton("Undecided");
        undecidedButton.addActionListener(this);
        buttonsPanel.add(yesButton);
        buttonsPanel.add(noButton);
        buttonsPanel.add(undecidedButton);
        mainPanel.add(buttonsPanel, BorderLayout.CENTER);

        JPanel checkboxesPanel = new JPanel(new GridLayout(1, 3));
        checkBox1 = new JCheckBox("Checkbox One");
        checkBox1.addActionListener(this);
        checkBox2 = new JCheckBox("Checkbox Two");
        checkBox2.addActionListener(this);
        checkBox3 = new JCheckBox("Checkbox Three");
        checkBox3.addActionListener(this);
        checkboxesPanel.add(checkBox1);
        checkboxesPanel.add(checkBox2);
        checkboxesPanel.add(checkBox3);
        mainPanel.add(checkboxesPanel, BorderLayout.SOUTH);

        JPanel fieldsPanel = new JPanel(new GridLayout(2, 2));
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        fieldsPanel.add(nameLabel);
        fieldsPanel.add(nameField);
        fieldsPanel.add(passwordLabel);
        fieldsPanel.add(passwordField);
        mainPanel.add(fieldsPanel, BorderLayout.EAST);

        setContentPane(mainPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            JOptionPane.showMessageDialog(this, "You clicked the " + button.getText() + " button");
        } else if (source instanceof JCheckBox) {
            JCheckBox checkBox = (JCheckBox) source;
            JOptionPane.showMessageDialog(this, "You " + (checkBox.isSelected() ? "checked" : "unchecked") + " the " + checkBox.getText() + " checkbox");
        }
    }

    public static void main(String[] args) {
        SwingConcepts example = new SwingConcepts();
        example.setVisible(true);
    }
}

