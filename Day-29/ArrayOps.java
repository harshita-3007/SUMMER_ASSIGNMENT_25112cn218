import java.util.*;

public class ArrayOps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice;

        do {
            System.out.println("\n1. Display");
            System.out.println("2. Sum");
            System.out.println("3. Largest");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Array: ");
                    for (int x : arr)
                        System.out.print(x + " ");
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int x : arr)
                        sum += x;
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    int max = arr[0];
                    for (int x : arr)
                        if (x > max)
                            max = x;
                    System.out.println("Largest = " + max);
                    break;

                case 4:
                    System.out.println("Exited.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);
    }
}