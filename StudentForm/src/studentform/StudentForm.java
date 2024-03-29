package studentform;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentForm extends JFrame implements ActionListener {
    // Declare Swing components
    JLabel nameLabel, regnoLabel, addressLabel, mailLabel, cutoffLabel;
    JTextField nameField, regnoField, addressField, mailField, cutoffField;
    JButton submitButton, modifyButton, deleteButton, updateButton;
    
    // Declare database connection variables
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    public StudentForm() {
        // Initialize Swing components
        nameLabel = new JLabel("Name:");
        regnoLabel = new JLabel("Reg No:");
        addressLabel = new JLabel("Address:");
        mailLabel = new JLabel("Mail ID:");
        cutoffLabel = new JLabel("Cutoff Mark:");
        
        nameField = new JTextField(20);
        regnoField = new JTextField(20);
        addressField = new JTextField(20);
        mailField = new JTextField(20);
        cutoffField = new JTextField(20);
        
        submitButton = new JButton("Submit");
        deleteButton = new JButton("Delete");
        updateButton = new JButton("Update");
        
        // Add action listeners to buttons
        submitButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        
        // Set layout and add components to JFrame
        setLayout(new FlowLayout());
        add(nameLabel);
        add(nameField);
        add(regnoLabel);
        add(regnoField);
        add(addressLabel);
        add(addressField);
        add(mailLabel);
        add(mailField);
        add(cutoffLabel);
        add(cutoffField);
        add(submitButton);
        add(deleteButton);
        add(updateButton);
        
        // Set JFrame properties
        setTitle("Student Registration Form");
        setSize(800, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Initialize database connection
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "Subash@2004");
            stmt = con.createStatement();
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        // Handle button clicks
        if(ae.getSource() == submitButton) {
            try {
                // Insert new student record into database
                String sql = "INSERT INTO students (name, regno, address, mail_id, cutoff_mark) VALUES ('" + nameField.getText() + "', '" + regnoField.getText() + "', '" + addressField.getText() + "', '" + mailField.getText() + "', '" + cutoffField.getText() + "')";
                stmt.executeUpdate(sql);
                
                // Clear input fields
                nameField.setText("");
                regnoField.setText("");
                addressField.setText("");
                mailField.setText("");
                cutoffField.setText("");
                
                JOptionPane.showMessageDialog(this, "Student record added successfully!");
            } catch(SQLException e) {
                System.out.println(e);
            }
        }else if(ae.getSource() == deleteButton) {
            try {
                // Delete student record from database
                String sql = "DELETE FROM students WHERE regno='" + regnoField.getText() + "'";
                stmt.executeUpdate(sql);
                
                // Clear input fields
                nameField.setText("");
                regnoField.setText("");
                addressField.setText("");
                mailField.setText("");
                cutoffField.setText("");
                
                JOptionPane.showMessageDialog(this, "Student record deleted successfully!");
            } catch(SQLException e) {
                System.out.println(e);
            }
        } else if(ae.getSource() == updateButton) {
            try {
                // Update existing student record in database
                String sql = "UPDATE students SET name='" + nameField.getText() + "', address='" + addressField.getText() + "', mail_id='" + mailField.getText() + "', cutoff_mark='" + cutoffField.getText() + "' WHERE regno='" + regnoField.getText() + "'";
                stmt.executeUpdate(sql);
                
                // Clear input fields
                nameField.setText("");
                regnoField.setText("");
                addressField.setText("");
                mailField.setText("");
                cutoffField.setText("");
                
                JOptionPane.showMessageDialog(this, "Student record updated successfully!");
            } catch(SQLException e) {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        new StudentForm();
    }
}