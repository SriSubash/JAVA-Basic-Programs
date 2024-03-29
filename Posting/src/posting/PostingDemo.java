package posting;
import java.util.Scanner;
public class PostingDemo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         Posting obj=new Posting();
         double cwm,intm,techm,aptm;
         int ch;
         do
         {
             System.out.println("1->PROGRAMMER\n2->TEAM LEADER\n3->PROJECT MANAGER\n4->EXIT");
             System.out.println("Enter your Choice : ");
             ch=sc.nextInt();
             switch(ch)
             {
                 case 1:System.out.println("Enter the Course Work Mark : ");
                        cwm=sc.nextDouble();
                        System.out.println("Enter the Aptitude Mark : ");
                        aptm=sc.nextDouble();
                        System.out.println("Enter the Technical Mark : ");
                        techm=sc.nextDouble();
                        System.out.println("Enter the Interview Mark : ");
                        intm=sc.nextDouble();
                        obj.employee(cwm,aptm,techm,intm);
                        obj.candidate('p');
                        break;
                 case 2:System.out.println("Enter the Technical Mark : ");
                        techm=sc.nextDouble();
                        System.out.println("Enter the Interview Mark : ");
                        intm=sc.nextDouble();
                        obj.employee(techm,intm);
                        obj.candidate('t');
                        break;
                 case 3:System.out.println("Enter the Interview Mark : ");
                        intm=sc.nextDouble();
                        obj.employee(intm);
                        obj.candidate('m');
                        break;
                 case 4:break;
             }
         }while(ch!=4);
    }
    
}
class Posting{
    double cwm,aptm,techm,intm;
    Posting()
    {
        cwm=0.0;aptm=0.0;techm=0.0;intm=0.0;
    }
    public void employee(double cwm,double aptm,double techm,double intm){
        this.cwm=cwm;
        this.aptm=aptm;
        this.techm=techm;
        this.intm=intm;
    }
    public void employee(double techm,double intm){
        this.techm=techm;
        this.intm=intm;
    }
    public void employee(double intm){
        this.intm=intm;
    }
    public void candidate(char emp){
        double mark;
        if(emp=='p')
            mark=(cwm+aptm+techm+intm)/4;
        else if(emp=='t')
            mark=(techm+intm)/2;
        else
            mark=intm;
        if(mark>=80)
            System.out.println("You are Selected");
        else
            System.out.println("Sorry, You are not Eligible");
    }
}
