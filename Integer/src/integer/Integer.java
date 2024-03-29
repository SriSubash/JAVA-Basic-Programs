
package integer;

public class Integer{
    
    public static void main(String[] args) {
        IntegerChild obj=new IntegerChild();
        obj.i=10;
        obj.j=20;
        obj.printNum();
    }    
}
class Integer1{
    public int i;
    public void printNum()
    {
        System.out.println("Base Class Integer : "+i);
    }
} 
class IntegerChild extends Integer1{
    public int j;
    @Override
    public void printNum()
    {
        super.printNum();
        System.out.println("Child Class Integer : "+j);
    }
}
