
package salary;
import java.util.Scanner;
public class Salary {

    public static void main(String[] args) {
        HourlyWorker hobj = new HourlyWorker();
        DailyWorker  dobj = new DailyWorker ();
        hobj.getdetails();
        dobj.getdetails();
        hobj.putdetails();
        System.out.println("Salary             : "+hobj.computeSalary());
        dobj.putdetails();
        System.out.println("Salary             : "+dobj.computeSalary());
    }
    
}
interface SalaryCompute
{
    double computeSalary();
}
class HourlyWorker implements SalaryCompute
{
    Scanner sc=new Scanner(System.in);
    int hempid,nhw;
    String hname;
    public HourlyWorker()
    {
        hempid=0;nhw=0;hname="";
    }
    public void getdetails()
    {
        System.out.println("HOURLY WORKER");
        System.out.println("Enter the Employee ID        : ");
        hempid=sc.nextInt();
        System.out.println("Enter the Employee Name      : ");
        hname=sc.next();
        System.out.println("Enter the No of Hours worked : ");
        nhw=sc.nextInt();
    }
    public void putdetails()
    {
        System.out.println("HOURLY WORKER");
        System.out.println("Employee ID        : "+hempid);
        System.out.println("Employee Name      : "+hname);
        System.out.println("No of Hours worked : "+nhw);
    }
    @Override
    public double computeSalary(){
        return nhw*60;
    }
}
class DailyWorker implements SalaryCompute
{
    Scanner sc=new Scanner(System.in);
    int dempid,ndw;
    String dname;
    public DailyWorker()
    {
        dempid=0;ndw=0;dname="";
    }
    public void getdetails()
    {
        System.out.println("DAILY WORKER");
        System.out.println("Enter the Employee ID       : ");
        dempid=sc.nextInt();
        System.out.println("Enter the Employee Name     : ");
        dname=sc.next();
        System.out.println("Enter the No of Days worked : ");
        ndw=sc.nextInt();
    }
    public void putdetails()
    {
        System.out.println("DAILY WORKER");
        System.out.println("Employee ID       : "+dempid);
        System.out.println("Employee Name     : "+dname);
        System.out.println("No of Days worked : "+ndw);
    }
    @Override
    public double computeSalary(){
        return ndw*150;
    }
}
