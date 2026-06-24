import java.util.Scanner;

public class PowerCalculator {

    // Optimized O(log n) method using Binary Exponentiation
    public static double calculatePower(double x, int n) {
        // Base case: Any number to the power of 0 is 1
        if (n == 0) {
            return 1.0;
        }

        // Use a long variable to prevent integer overflow when n = Integer.MIN_VALUE
        long exponent = n;

        // Handle negative exponents: x^(-n) = 1 / (x^n)
        if (exponent < 0) {
            x = 1 / x;
            exponent = -exponent;
        }

        double result = 1.0;
        while (exponent > 0) {
            // If the exponent is odd, multiply the result by x
            if ((exponent & 1) == 1) {
                result *= x;
            }
            // Square the base
            x *= x;
            // Divide the exponent by 2 (bitshift right)
            exponent >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base (x): ");
        double x = scanner.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = scanner.nextInt();

        double finalAnswer = calculatePower(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + finalAnswer);

        scanner.close();
    }
}
