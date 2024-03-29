/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import java.util.Scanner;

public class EvenOdd {
    
    public static void main(String[] args) {
        

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int count = input.nextInt();
        int[] arr=new int[count];
        System.out.print("Enter an integers: ");
        for (int i = 0; i < count; i++) {
            
            arr[i]=input.nextInt();
        }
        Thread t1 = new Thread(new EvenNumberPrinter(arr));
        Thread t2 = new Thread(new OddNumberPrinter(arr));
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception caught: " + e.getMessage());
        }
        System.out.println("Program finished.");
    }
}

class EvenNumberPrinter implements Runnable {
    private int[] arr=new int[100];
    
    public EvenNumberPrinter(int[] arr) {
        this.arr = arr;
    }
    
    @Override
    public void run() {
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print("Even :"+num + " \n");
            }
        }
        System.out.println();
    }
}

class OddNumberPrinter implements Runnable {
    
    private int[] arr=new int[100];
    
    public OddNumberPrinter(int[] arr) {
        this.arr = arr;
    }
    
    @Override
    public void run() {
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print("Odd :"+num + " \n");
            }
        }
        System.out.println();
    }
}

