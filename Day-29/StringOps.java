import java.util.*;

public class StringOps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;

        do {
            System.out.println("\n1. Length");
            System.out.println("2. Uppercase");
            System.out.println("3. Lowercase");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println(str.toUpperCase());
                    break;

                case 3:
                    System.out.println(str.toLowerCase());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--)
                        rev += str.charAt(i);
                    System.out.println("Reverse = " + rev);
                    break;

                case 5:
                    System.out.println("Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
}
