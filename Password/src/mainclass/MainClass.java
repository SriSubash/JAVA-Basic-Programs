package mainclass;
import java.util.Scanner;
import password.*;
public class MainClass {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Password obj=new Password();
        System.out.println("Enter the Password :");
        String pass=sc.next();
        int flag=obj.check(pass);
        if(flag==0)
            System.out.println("Your Password is Valid");
        else
            System.out.println("Your Password is Not Valid");
    }
    
}