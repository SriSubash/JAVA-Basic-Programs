package special;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Special extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1;
    int x=0;
    public Special()
    {
        l1=new JLabel("GAAJENDRA");
        //l1.setFont(new Font("Times New Roman",Font.ITALIC,14));
        add(l1);
        b1=new JButton("START");
        add(b1,BorderLayout.SOUTH);
        b1.addActionListener(this);
        setSize(600,600);
        setVisible(true);
        setLayout(new BorderLayout());
    }
    public static void main(String[] args)
    {
            new Special();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1)
        {
            for(int i=0;i<50;i++)
            {    
                x++;
                l1.setFont(new Font("Times New Roman",Font.ITALIC,x));
                try
                {
                    Thread.sleep(50);
                }catch(InterruptedException E)
                {}
            }
        }
    }
}
