/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applets;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class BgColour extends Applet
{
        public static void main(String[] args)
       {
        Frame ForegroundBackgroundColor = new Frame("Change Background and Foreground Color of Applet");
        ForegroundBackgroundColor.setSize(420, 180);
        Applet ColorApplet = new BgColour();
        ForegroundBackgroundColor.add(ColorApplet);
                ForegroundBackgroundColor.setVisible(true);
ForegroundBackgroundColor.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {System.exit(0); }
                                                                                            });
     }

  public void paint(Graphics g)
{
    Color c = getForeground();
            setBackground(Color.blue);
setForeground(Color.yellow);
          g.drawString("Foreground color set to yellow", 100, 50);
   g.drawString("Change Background and Foreground Color of Applet", 50, 100);
  }
}

