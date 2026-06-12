import java.util.Scanner;

public class FibonacciGenerator {

    public static void printFibonacci(int count) {
        int n1 = 0, n2 = 1;

        for (int i = 1; i <= count; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        printFibonacci(terms);

        scanner.close();
    }
}
