/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;
import java.util.Scanner;
interface Stack{
    void push(int value);
    void pop();
    void check();
}
class StackChild implements Stack{
    public int capacity;
    public int top=0;
    public int[] a=new int[10];
    @Override
    public void push(int value) {
        if(top==capacity)
        {
            System.out.println("Stack Overflow!!!");
        }
        else
        {
            a[top]=value;
            top++;
        }
    }

    @Override
    public void pop() {
        if(top==0)
        {
            System.out.println("Stack Underflow!!!");
        }
        else
        {   top--;
            System.out.println("The Popped Element is : "+a[top]);
        }
    }
    @Override
    public void check()
    {
        if(top==0)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not Empty");
    }

}
public class StackDemo
{
    public static void main(String[] args) 
    {
        StackChild S=new StackChild();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Stack : ");
        S.capacity=sc.nextInt();
        int ch,n;
        do
        {
                System.out.println("Press 1 to Push.");
                System.out.println("Press 2 to Pop.");
                System.out.println("Press 3 to Increment.");
                System.out.println("Press 4 to Check.");
                System.out.println("Press 5 to Exit.");
                System.out.println("Enter your Choice:\n");
                ch=sc.nextInt();
                switch(ch)
                {
                        case 1 -> {
                            System.out.println("Enter the Element to be Pushed:");
                            n=sc.nextInt();
                            S.push(n);
                }
                        case 2 -> S.pop();
                        case 3 ->{ System.out.println("Enter the Size to Increment : ");
                                    n=sc.nextInt();
                                    S.capacity+=n;
                        }
                        case 4 -> S.check();
                        case 5->{}
                }
        }while(ch!=5);
    }    
}

