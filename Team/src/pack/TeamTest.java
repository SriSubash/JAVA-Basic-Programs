
package pack;
import java.util.Scanner;
import india.Team;

public class TeamTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the No of Players :");
        int n=sc.nextInt();
        Team[] obj=new Team[n];
        for(int i=0 ; i<n ;i++)
        {    
            System.out.println("Enter the First Name :");
            String pname=sc.next();
            System.out.println("Enter the Nick Name :");
            String nname=sc.next();
            System.out.println("Enter the Position :");
            int pos=sc.nextInt();
            obj[i]=new Team(pname,nname,pos);
        }
        for(int i=0 ; i<n ;i++)
            obj[i].display();
    }
}