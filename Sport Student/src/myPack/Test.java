
package myPack;

import java.util.Scanner;
class Student {
    String rollno;
    Scanner sc=new Scanner(System.in);
    public void getNumber()
    {
        System.out.println("Enter the Roll Number :");
        rollno=sc.next();
    }
    public void putNumber()
    {
        System.out.println("Roll Number : "+rollno);
    }
}
public class Test extends Student
{
    public int[] mark = new int[5];
    Scanner sc1=new Scanner(System.in);
    int j;
    public void getMarks()
    {
        System.out.println("Enter the Marks :");
        for(int i=0; i<5 ;i++)
            mark[i]=sc1.nextInt();
    }
    public void putMarks()
    {
        for(int i=0; i<5 ;i++)
        {
            j=i+1;
            System.out.println("Mark "+j+": "+mark[i]);
        }
    }
}