package india;

public class Team {
      String pname;
      String nname;
      int pos;
      public Team(){
         pname="";
         nname="";
         pos=0;
      }       
      public Team(String a,String b,int n)
      {
          pname=a;
          nname=b;
          pos=n;
      }
      public void display()
      {
          System.out.println("First Name : "+pname);
          System.out.println("Nick Name :"+nname);
          System.out.println("Position :"+pos);
          
      }
}
