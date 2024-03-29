
package palindrome;
import java.util.Scanner;
public class Palindrome
{
        public static void main(String[] args)
        {
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the Number:");
                int n1=sc.nextInt();
                Palin obj=new Palin();
                int s=obj.find(n1);
                if(s==n1)
                {
                        System.out.println("The given number is a Palindrome");
                }
                else
                {
                        System.out.println("The given number is not a Palindrome");
                }
        }
}
class Palin
{
        int find(int a)
        {
                int sum=0,n;
                while(a!=0)
                {
                        n=a%10;
                        sum=(sum*10)+n;
                        a=a/10;
                }
                return sum;
        }
}
