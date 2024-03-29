/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Panels extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    JTextArea j1;
    JScrollPane scrollPane;
    public Panels()
    {
        j1=new JTextArea(100,100);
        j1.setFont(new Font("Arial", Font.PLAIN, 16));
        scrollPane = new JScrollPane(j1);
        add(scrollPane);
        add(j1);
        JMenuBar m1=new JMenuBar();
        add(m1);
        JMenu i1=new JMenu("File");
        m1.add(i1);
        JMenuItem m=new JMenuItem("Open");
        i1.add(m);
        i1.addActionListener(this);
        //JPanel p1=new JPanel();
        //JPanel p2=new JPanel();
        //p1.setBounds(0, 0, 200, 400);
        //p2.setBounds(200,0,200,400);
        setLayout(null);
        setSize(500,500);
        setVisible(true);
        setJMenuBar(m1);
        //add(p1);
        //add(p2);
        //p1.setBackground(Color.red);
        //p2.setBackground(Color.BLUE);
        //b1=new JButton("Click ME");
        //p1.add(b1);
        //b1.addActionListener(this);
        //l1=new JLabel();
        //p2.add(l1);
    }
    public static void main(String[] args) {
        Panels panels = new Panels();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if(e.getSource()==b1)
        //    l1.setText("Button Clicked");
    }
    
}
