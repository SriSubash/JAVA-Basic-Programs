
package addition;

import java.util.Scanner;
public class Addition
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the First Number:");
                int n1=sc.nextInt();
                System.out.println("Enter the Second Number:");
                int n2=sc.nextInt();
                Add obj=new Add();
                System.out.println("The Sum of the Two Numbers is "+obj.addnum(n1,n2));
        }
}
class Add
{
        int addnum(int a,int b)
        {
                return a+b;
        }
}
