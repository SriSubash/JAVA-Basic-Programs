
package Test;
import java.util.Scanner;
import myPack.Test;
import myPack2.Sport;
public class StudentTest{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the No of Students :");
      int n=sc.nextInt();
      Test[] obj=new Test[n];
      Sport[] sobj=new Sport[n];
      for(int i=0 ; i<n ;i++)
      { 
        obj[i]=new Test();
        sobj[i]=new Sport();  
        obj[i].getNumber();
        obj[i].getMarks();
        sobj[i].getSportwt();
      }
      for(int i=0 ; i<n ;i++)
      {
        obj[i].putNumber();
        obj[i].putMarks();
        sobj[i].display();
      }
    }
    
}
