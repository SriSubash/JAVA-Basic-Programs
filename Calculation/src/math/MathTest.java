package math;
import java.util.Scanner;
import calculation.*;

public class MathTest {

    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Two Numbers:");
       int n1=sc.nextInt();
       int n2=sc.nextInt();
       Calculation obj=new Calculation();
       System.out.println("Addition : "+obj.add(n1,n2));
       System.out.println("Subraction : "+obj.sub(n1,n2));
       System.out.println("Multiplication : "+obj.mul(n1,n2));
       System.out.println("Division : "+obj.div(n1,n2));
    }
    
}