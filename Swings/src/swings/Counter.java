/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swings;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Counter extends JFrame implements ActionListener {
    private JLabel countLabel;
    private JTextField countTextField;
    private JButton countUpButton;
    private JButton countDownButton;
    private JButton resetButton;

    private int count = 0;

    public Counter() {
        super("AWT Counter 3 Buttons");

        countLabel = new JLabel("Count:");
        countTextField = new JTextField(String.valueOf(count), 10);
        countTextField.setEditable(false);
        countTextField.setHorizontalAlignment(JTextField.CENTER);

        countUpButton = new JButton("Count Up");
        countUpButton.addActionListener(this);
        countDownButton = new JButton("Count Down");
        countDownButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);

        JPanel contentPane = new JPanel(new GridLayout(2, 2));
        contentPane.add(countLabel);
        contentPane.add(countTextField);
        contentPane.add(countUpButton);
        contentPane.add(countDownButton);
        contentPane.add(resetButton);

        setContentPane(contentPane);
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == countUpButton) {
            count++;
        } else if (source == countDownButton) {
            count--;
        } else if (source == resetButton) {
            count = 0;
        }

        countTextField.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
