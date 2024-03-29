/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threads;

public class BankThread {
    
    private int balance = 0;
    
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ", balance is now " + balance);
    }
    
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ", balance is now " + balance);
        } else {
            System.out.println("Cannot withdraw " + amount + ", insufficient balance");
        }
    }
    
    public static void main(String[] args) {
        BankThread account = new BankThread();
        int w=200,d=500;
        Thread t1 = new Thread(() -> {
            account.deposit(d);
            account.withdraw(w);
        });
        Thread t2 = new Thread(() -> {
            account.deposit(d);
            account.withdraw(w);
        });
        t1.start();
        t2.start();
    }
}


