/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;
import java.util.Scanner;
interface Queue{
    void enqueue(int value);
    void dequeue();
    void check();
}
class QueueChild implements Queue{
    public int capacity,front=-1,rear=0;
    public int[] a=new int[10];
    @Override
    public void enqueue(int value) {
        if(rear!=capacity)
        {
            a[rear]=value;
            rear++;
        }
        else
        {
            System.out.println("Queue Overflow!!!\n");
        }
    }

    @Override
    public void dequeue() {
        if(front!=capacity-1)
        {
            front++;
            System.out.println("The Dequeued Element is : "+a[front]+"\n");
        }
        else
        {   
            System.out.println("Queue Underflow!!!\n");
        }
    }
    @Override
    public void check()
    {
        if(front==-1||rear==0)
            System.out.println("Queue is Empty\n");
        else
            System.out.println("Queue is not Empty\n");
    }

}
public class QueueDemo
{
    public static void main(String[] args) 
    {
        QueueChild S=new QueueChild();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Queue : ");
        S.capacity=sc.nextInt();
        int ch,n;
        do
        {
                System.out.println("Press 1 to Enqueue.");
                System.out.println("Press 2 to Dequeue.");
                System.out.println("Press 3 to Increment.");
                System.out.println("Press 4 to Check.");
                System.out.println("Press 5 to Exit.");
                System.out.println("Enter your Choice:");
                ch=sc.nextInt();
                switch(ch)
                {
                        case 1 -> {
                            System.out.println("Enter the Element to be Pushed : ");
                            n=sc.nextInt();
                            S.enqueue(n);
                }
                        case 2 -> S.dequeue();
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

