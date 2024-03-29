/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

public class CheckThreads{
    
    private Thread thread1;
    private Thread thread2;
    
    public CheckThreads() {
        thread1 = new Thread(() -> {
            System.out.println("Thread 1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught: " + e.getMessage());
            }
            System.out.println("Thread 1 is finished");
        });
        thread1.start();
        thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught: " + e.getMessage());
            }
            System.out.println("Thread 2 is finished");
        });
        thread2.start();
        System.out.println("Thread 1 is running: " + thread1.isAlive());
        System.out.println("Thread 2 is running: " + thread2.isAlive());
    }
    
    public static void main(String[] args) {
        CheckThreads demo = new CheckThreads();
    }
}

