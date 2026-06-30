import java.util.*;

public class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[5];
        double salary[] = new double[5];

        for(int i=0;i<5;i++) {
            System.out.println("\nEmployee " + (i+1));

            System.out.print("Enter Name: ");
            name[i] = sc.next();

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details");

        for(int i=0;i<5;i++) {
            System.out.println(name[i] + " - Rs." + salary[i]);
        }
    }
}