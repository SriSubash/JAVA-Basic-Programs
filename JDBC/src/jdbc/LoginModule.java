/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginModule extends JFrame implements ActionListener{
    JTextField t1;
    JPasswordField p1;
    JButton b1,b2;
    public LoginModule()
    {
        JPanel top=new JPanel();
        top.setLayout(new GridLayout(2,2));
        JLabel user=new JLabel("USERNAME :");
        t1=new JTextField(20);
        JLabel passwd=new JLabel("PASSWORD :");
        p1=new JPasswordField(20);
        top.add(user);
        top.add(t1);
        top.add(passwd);
        top.add(p1);
        JPanel bottom=new JPanel();
        b1=new JButton("SIGN-IN");
        b1.addActionListener(this);
        b2=new JButton("SIGN-UP");
        b2.addActionListener(this);
        bottom.add(b1);
        bottom.add(b2);
        add(top,BorderLayout.CENTER);
        add(bottom,BorderLayout.SOUTH);
        setTitle("LOGIN MODULE");
        setSize(300,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        LoginModule loginModule = new LoginModule();
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String user=t1.getText();
            String passwd=new String(p1.getPassword());
            try {
                if(isValidUser(user,passwd))
                    JOptionPane.showMessageDialog(this,"Welcome"+user+"!");
                else
                    JOptionPane.showMessageDialog(this,user+" not found !!!");
            } catch (SQLException ex) {
                Logger.getLogger(LoginModule.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(LoginModule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(e.getSource()==b2)
        {
            String user=t1.getText();
            String passwd=new String(p1.getPassword());
            try {
                newUser(user,passwd);
            } catch (SQLException ex) {
                Logger.getLogger(LoginModule.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private boolean isValidUser(String user, String passwd) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginModule","root","Subash@2004");
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("Select * from users where passwd='"+passwd+"' and user='"+user+"'");
        return rs.next();
    }

    private void newUser(String user, String passwd) throws SQLException{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginModule","root","Subash@2004");
        Statement stmt=con.createStatement();
        String query="insert into users values('"+user+"','"+passwd+"')";
        stmt.execute(query);
        JOptionPane.showMessageDialog(this,"Welcome"+user+"!");
    }
}

