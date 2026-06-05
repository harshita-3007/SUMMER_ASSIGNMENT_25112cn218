import java.util.Scanner;
public class largestprimefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int largestFactor = -1;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                largestFactor = i;
                num /= i;
            }
        }
        if (largestFactor != -1) {
            System.out.println("The largest prime factor is: " + largestFactor);
        } else {
            System.out.println("No prime factors found.");
        }
    }
}
