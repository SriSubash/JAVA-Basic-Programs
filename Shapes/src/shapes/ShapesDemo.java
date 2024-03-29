
package shapes;
import java.util.Scanner;
public class ShapesDemo {
    public static void main(String[] args) {
       int area;
       Square obj1=new Square();
       System.out.println("SQUARE");
       area=obj1.area();
       System.out.println("Area of Square : "+area);
       Rectangle obj2=new Rectangle();
       System.out.println("RECTANGLE");
       area=obj2.area();
       System.out.println("Area of Rectangle : "+area);
       Circle obj3=new Circle();
       System.out.println("CIRCLE");
       area=obj3.area();
       System.out.println("Area of Circle : "+area);
       Triangle obj4=new Triangle();
       System.out.println("TRIANGLE");
       area=obj4.area();
       System.out.println("Area of Triangle : "+area);
    }
    
}
abstract class Shapes{
    public int radius,length,breadth,height,side;
    abstract public int area();
}
class Square extends Shapes{

    @Override
    public int area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Side :");
        side=sc.nextInt();
        return side*side;
    }
    
}
class Rectangle extends Shapes{

    @Override
    public int area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length :");
        length=sc.nextInt();
        System.out.println("Enter the Breadth :");
        breadth=sc.nextInt();
        return length*breadth;
    }
    
}
class Circle extends Shapes{

    @Override
    public int area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius :");
        radius=sc.nextInt();
        return (int) Math.PI*radius*radius;
    }
    
}
class Triangle extends Shapes{

    @Override
    public int area() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length :");
        length=sc.nextInt();
        System.out.println("Enter the Height :");
        height=sc.nextInt();
        return length*height*1/2;
    }
    
}