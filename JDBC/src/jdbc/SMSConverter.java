/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class SMSConverter extends Frame implements ActionListener{
    Label l1,l2;
    TextField t1,t2;
    Button b1,b2,b3;
    public SMSConverter()
    {
        l1=new Label("Enter SMS Abbreviation :");
        l2=new Label("Enter English Text     :");
        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("SMS to English");
        b2=new Button("English to SMS");
        b3=new Button("Abbreviation to FullForm");
        setLayout(new GridLayout(3,2));
        add(l1);
        add(t1);
        add(b1);
        add(l2);
        add(t2);
        add(b2);
        add(new Label());
        add(new Label());
        add(b3);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        setSize(400,100);
        setVisible(true);
    }
    public static void main(String[] args){
        new SMSConverter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            String sms=t1.getText();
            String english;
            try {
                english = ConvertSMS(sms);
                t2.setText(english);
            } catch (SQLException ex) {
                Logger.getLogger(SMSConverter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(e.getSource()==b2)
        {
            String english=t2.getText();
            String sms;
            try {
                sms = ConvertEnglish(english);
                t1.setText(sms);
            } catch (SQLException ex) {
                Logger.getLogger(SMSConverter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        else if(e.getSource()==b3)
        {
            String abbre=t1.getText();
            String full;
            try {
                full = getFullForm(abbre);
                t1.setText(full);
            } catch (SQLException ex) {
                Logger.getLogger(SMSConverter.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private String ConvertSMS(String sms) throws SQLException{
        String english=null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SMSConverter","root","Subash@2004");
        String query="Select eng from SMS where sms=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1,sms);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            english=rs.getString("eng");
        }
        rs.close();
        stmt.close();
        con.close();
        return english;
    }

    private String ConvertEnglish(String english) throws SQLException {
        String sms=null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SMSConverter","root","Subash@2004");
        String query="Select sms from SMS where eng=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1,english);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            sms=rs.getString("sms");
        }
        rs.close();
        stmt.close();
        con.close();
        return sms;
    }

    private String getFullForm(String abbre) throws SQLException {
        String full=null;
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/SMSConverter","root","Subash@2004");
        String query="Select full from Abbre where abbre=?";
        PreparedStatement stmt=con.prepareStatement(query);
        stmt.setString(1,abbre);
        ResultSet rs=stmt.executeQuery();
        if(rs.next())
        {
            full=rs.getString("full");
        }
        rs.close();
        stmt.close();
        con.close();
        return full;
    }

}

