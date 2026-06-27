import java.util.*;

public class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks in English: ");
        int eng = sc.nextInt();

        System.out.print("Enter Marks in Maths: ");
        int math = sc.nextInt();

        System.out.print("Enter Marks in Science: ");
        int sci = sc.nextInt();

        System.out.print("Enter Marks in Computer: ");
        int comp = sc.nextInt();

        System.out.print("Enter Marks in Social Science: ");
        int sst = sc.nextInt();

        int total = eng + math + sci + comp + sst;
        double percentage = total / 5.0;

        String grade;
        if (percentage >= 90)
            grade = "A+";
        else if (percentage >= 75)
            grade = "A";
        else if (percentage >= 60)
            grade = "B";
        else if (percentage >= 40)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("\n----- MARKSHEET -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + roll);
        System.out.println("English    : " + eng);
        System.out.println("Maths      : " + math);
        System.out.println("Science    : " + sci);
        System.out.println("Computer   : " + comp);
        System.out.println("Social Sci : " + sst);
        System.out.println("Total      : " + total);
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);
    }
}