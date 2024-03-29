/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringrev;
import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringChild obj=new StringChild();
        System.out.println("Enter the String : ");
        String str = sc.next();
        obj.reversal(str);
        System.out.println("Reverse of the String : ");
        System.out.println(obj.temp);
    }
    
}
interface Stringrev{
    void reversal(String str);
}
class StringChild implements Stringrev{
    public char[] temp = new char[50];
    @Override
    public void reversal(String str)
    {
        int len=str.length();
        int j=0;
        for(int i=len-1;i>=0;i--)
        {
            temp[j]=str.charAt(i);
            j++;
        }
    }
}
