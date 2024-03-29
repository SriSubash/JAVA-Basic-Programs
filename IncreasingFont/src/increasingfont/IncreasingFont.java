package increasingfont;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class IncreasingFont {
 public static void main(String[] args) {
 JFrame frame = new JFrame("Increasing Font");
 frame.setSize(500, 500);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 JLabel label = new JLabel("MepcoSchlenk Engineering College");
 frame.add(label);
 frame.setVisible(true);
 int size = 10,flag=0;
 while (flag!=10) {
 Font font = new Font("Arial", Font.PLAIN, size);
 label.setFont(font);
 size += 10;
 flag++;
 }
 }
}