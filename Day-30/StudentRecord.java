import java.util.*;

public class StudentRecord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        String name[] = new String[n];
        int roll[] = new int[n];

        for(int i=0;i<n;i++) {
            System.out.println("\nStudent " + (i+1));
            System.out.print("Enter Name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter Roll No: ");
            roll[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\nStudent Records");
        for(int i=0;i<n;i++) {
            System.out.println("Roll: " + roll[i] + "  Name: " + name[i]);
        }
    }
}