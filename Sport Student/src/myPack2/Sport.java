/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPack2;
import java.util.Scanner;
public class Sport {
    Scanner sc=new Scanner(System.in);
    int total;
    public void getSportwt()
    {
        System.out.println("Enter the Sports Weightage :");
        total=sc.nextInt();

    }
    public void display()
    {
        System.out.println("Sport Weightage : "+total);
    }
}
