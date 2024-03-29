package generics;

import java.util.ArrayList;

public class GenericsStudent {
    private String name;
    private ArrayList<? extends Number> marks;

    public GenericsStudent(String name, ArrayList<? extends Number> marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getTotalMarks() {
        double totalMarks = 0;
        for (Number mark : marks) {
            totalMarks += mark.doubleValue();
        }
        return totalMarks;
    }

    public char getGrade() {
        double totalMarks = getTotalMarks();
        if (totalMarks >= 90) {
            return 'A';
        } else if (totalMarks >= 70) {
            return 'B';
        } else if (totalMarks >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> marks1 = new ArrayList<>();
        marks1.add(80);
        marks1.add(85);
        marks1.add(90);
        GenericsStudent student1 = new GenericsStudent("Alice", marks1);
        System.out.println("Name: " + student1.name);
        System.out.println("Total Marks: " + student1.getTotalMarks());
        System.out.println("Grade: " + student1.getGrade());

        ArrayList<Float> marks2 = new ArrayList<>();
        marks2.add(65.5f);
        marks2.add(72.0f);
        marks2.add(80.5f);
        GenericsStudent student2 = new GenericsStudent("Bob", marks2);
        System.out.println("\nName: " + student2.name);
        System.out.println("Total Marks: " + student2.getTotalMarks());
        System.out.println("Grade: " + student2.getGrade());
    }
}
