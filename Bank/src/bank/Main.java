package bank;
import java.util.Scanner;
class Customer{
    Scanner sc=new Scanner(System.in);
    String name,address;
    int age;
    
    public void getdetails()
    {
        System.out.println("Enter the Name    : ");
        name=sc.next();
        System.out.println("Enter the Address : ");
        address=sc.next();
        System.out.println("Enter the Age     : ");
        age=sc.nextInt();
    }
    public void putdetails()
    {
        System.out.println("Customer  Name   : "+name);
        System.out.println("Customer Address : "+address);
        System.out.println("Customer Age     : "+age);
    }
}
class Account{
    Scanner sc=new Scanner(System.in);
    String accno,actype,branch;
    public void getdetails(String branch)
    {
        System.out.println("Enter the Account Number: ");
        accno=sc.next();
        System.out.println("Enter the Account Type  : ");
        actype=sc.next();
        this.branch=branch;
    }
    public void putdetails()
    {
        System.out.println("Account Number   : "+accno);
        System.out.println("Account Type     : "+actype);
        System.out.println("Account Branch   : "+branch);
    }
}
class RBI{
    int balance,withdraw;
    double interest;
        Customer c=new Customer();
    Account a=new Account();
    public RBI()
    {
        balance=1000;
        withdraw=1000000;
        interest=4.0;
    }
    public void set_interest(double interest){
        if(interest>=this.interest)
            this.interest=interest;
        else
            System.out.println("Minimum Interest Should be : "+this.interest+" as per RBI guidelines");
    }
    public void set_balance(int balance){
        if(balance>=this.balance)
            this.balance=balance;
        else
            System.out.println("Minimum Balance Should be : "+this.balance+" as per RBI guidelines");
    }
    public void set_withdraw(int withdraw){
        if(withdraw>=this.withdraw)
            this.withdraw=withdraw;
        else
            System.out.println("Minimum Withdraw Should be : "+this.withdraw+" as per RBI guidelines");
    }
    public void printdetails()
    {
        System.out.println("Updated Minimum Balance  : "+balance);
        System.out.println("Updated Minimum Interest : "+interest);
        System.out.println("Updated Minimum Withdraw : "+withdraw);
    }
}
class SBI extends RBI{
    public SBI()
    {}
    public SBI(int balance,int withdraw,double interest){
        set_interest(interest);
        set_balance(balance);
        set_withdraw(withdraw);
    }
    @Override
    public void printdetails(){
        System.out.println("Final Minimum Balance  : "+balance);
        System.out.println("Final Minimum Interest : "+interest);
        System.out.println("Final Minimum Withdraw : "+withdraw);
    }
}
class ICICI extends RBI{
    public ICICI(){}
    public ICICI(int balance,int withdraw,double interest){
        set_interest(interest);
        set_balance(balance);
        set_withdraw(withdraw);
    }
    @Override
    public void printdetails(){
        System.out.println("Final Minimum Balance : "+balance);
        System.out.println("Final Minimum Interest : "+interest);
        System.out.println("Final Minimum Withdraw : "+withdraw);
    }
}
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x;
        do
        {
            System.out.println("Enter your choice to update the details");
            System.out.println("1.SBI\n2.ICICI\n3.EXIT");
            x=sc.nextInt();
            if(x==3)
                break;
            System.out.println("For any Invalid input Default RBI Guidelines will be considered.");
            System.out.println("Enter minimum balance, maximum withdraw limit and minimum Interest rate");
            int a,b;
            double c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextDouble();
            RBI bank;
            switch(x){
                case 1:bank=new SBI(a,b,c);
                        bank.printdetails();
                        break;
                case 2:bank=new ICICI(a,b,c);
                        bank.printdetails();
                        break;
            }
        }while(x!=3);
        int ch;
        int c1=0,c2=0;
        SBI[] sbi=new SBI[10];
        ICICI[] ici=new ICICI[10];
        do
        {
            System.out.println("1->Enter SBI Customer Details\n2->Enter ICICI Customer Details\n3->Display Customer Details\n->Exit\nEnter ypur Choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:sbi[c1]=new SBI();
                       sbi[c1].c.getdetails();
                       sbi[c1].a.getdetails("SBI");
                       c1++;
                       break;
                case 2:ici[c2]=new ICICI();
                        ici[c2].c.getdetails();
                       ici[c2].a.getdetails("ICICI");
                       c2++;
                       break;
                case 3:System.out.println("SBI CUSTOMER LIST ");
                        for(int j=0;j<c1;j++)
                        {
                            sbi[j].c.putdetails();
                            sbi[j].a.putdetails();
                        }
                        System.out.println("ICICI CUSTOMER LIST ");
                        for(int j=0;j<c2;j++)
                        {
                            ici[j].c.putdetails();
                            ici[j].a.putdetails();
                        }
                        break;
            }
        }while(ch!=4);
    }
}