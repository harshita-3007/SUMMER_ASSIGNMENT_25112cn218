import java.util.*;

public class Inventory {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String item[] = new String[5];
        int qty[] = new int[5];
        int count = 0;

        int choice;

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Display Inventory");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (count < 5) {
                        System.out.print("Enter Item Name: ");
                        item[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        qty[count] = sc.nextInt();

                        count++;
                        System.out.println("Item Added.");
                    } else {
                        System.out.println("Inventory Full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Items Available.");
                    } else {
                        System.out.println("\nInventory List");
                        for (int i = 0; i < count; i++) {
                            System.out.println(item[i] + " - Quantity: " + qty[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Inventory Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 3);
    }
}