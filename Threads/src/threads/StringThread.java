/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

public class StringThread implements Runnable {
    
    private String[] course;
    
    public StringThread(String[] course) {
        this.course = course;
    }
    
    @Override
    public void run() {
        for (String c : course) {
            System.out.println(Thread.currentThread().getName() + ": " + c);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception caught: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {

        String[] course = {"Java", "J2EE", "Spring", "Struts"};
        StringThread c1 = new StringThread(course);
        StringThread c2 = new StringThread(course);
        StringThread c3 = new StringThread(course);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        t1.start();
        t2.start();
        t3.start();
    }
}

