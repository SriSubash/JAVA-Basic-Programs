/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package applets;

 import java.applet.*;
 import java.awt.*;
 import java.awt.event.KeyEvent;
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.Color;
 import java.awt.Dimension;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.event.ActionEvent;
 import java.awt.event.KeyEvent;
 /* <applet code = "game" width = 400 height = 200> </applet> */
public class BallMovement extends Applet implements ActionListener, KeyListener{
private static final long serialVersionUID = 1L;
double x = 0, y = 0;
static int MoveX = 210;
static int MoveY = 800;
 public void up(){
        MoveY = -2;
        MoveX = 0;
    }
    public void down(){
        MoveY = 2;
        MoveX = 0;
    }
    public void left(){
       MoveX = -2;
        MoveY = 0;
    }
    public void right(){
        MoveX = 2;
        MoveY = 0;
    }
public void paint(Graphics g){
    g.setColor(Color.BLUE);
        g.setColor(Color.RED);
    int size =90;
    g.fillOval(MoveX, MoveY, size, size);
}
public void keyPressed(KeyEvent e) {
      int code = e.getKeyCode();
        if (code == KeyEvent.VK_UP){
            up();
        }
        if (code == KeyEvent.VK_DOWN){
            down();
        }
        if (code == KeyEvent.VK_LEFT){
            left();
        }
        if (code == KeyEvent.VK_RIGHT){
            right();
        }
}
public void keyReleased(KeyEvent e) {

    int code = e.getKeyCode();
    if (code == KeyEvent.VK_UP){
        MoveY = 0;
    }
    if (code == KeyEvent.VK_DOWN){
        MoveY = 0;
    }
    if (code == KeyEvent.VK_LEFT){
        MoveX = 0;
    }
    if (code == KeyEvent.VK_RIGHT){
        MoveX = 0;
    }
}
public void keyTyped(KeyEvent e) {

}
public void actionPerformed(ActionEvent e) {

     repaint();
        x += MoveX;
        y += MoveY;
        if(x<0){
            MoveX = 0;
            x = 0;
        }
        if(x>750){
            MoveX = 0;
            x = 750;
        }
        if(y<0);{
            MoveY = 0;
            y = 0;
        }
        if(y>550){
            MoveY = 0;
            y = 550;
        }
   }
}