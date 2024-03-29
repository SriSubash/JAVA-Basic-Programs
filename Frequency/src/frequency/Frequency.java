
package frequency;
import java.util.Scanner;
public class Frequency
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the String : ");
                String str = sc.next();
                System.out.println("Enter the Character to Find Frequency : ");
                char a = sc.next().charAt(0);
                Findfreq obj = new Findfreq();
                System.out.println("The Frequency of the Letter in the given String is "+obj.find(str,a));

        }
}
class Findfreq
{
        int find(String str,char a)
        {
                int len=str.length(),count=0,i=0;
                while(i<len)
                {
                        if(str.charAt(i)==a)
                        {
                                count++;
                        }
                        i++;
                }
                return count;
        }
}