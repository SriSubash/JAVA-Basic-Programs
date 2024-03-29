
package shapesmo;
import java.util.Scanner;

public class ShapesMO{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the side of the square: ");
                    double side = sc.nextDouble();
                    System.out.println("The area of the square is " + area(side));
                    break;
                case 2:
                    System.out.print("Enter the length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter the breadth of the rectangle: ");
                    double breadth = sc.nextDouble();
                    System.out.println("The area of the rectangle is " + area(length, breadth));
                    break;
                case 3:
                    System.out.print("Enter the base of the triangle: ");
                    int base = sc.nextInt();
                    System.out.print("Enter the height of the triangle: ");
                    int height = sc.nextInt();
                    System.out.println("The area of the triangle is " + area(base, height));
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }

    public static double area(double side) {
        return side * side;
    }

    public static double area(double length, double breadth) {
        return length * breadth;
    }

    public static double area(int base, int height) {
        return 0.5 * base * height;
    }
}
