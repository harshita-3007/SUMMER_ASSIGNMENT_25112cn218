// WAP TO PRINT ARMSTRONG NUMBERS IN A GIVEN RANGE
import java.util.Scanner;
public class armstrongrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        System.out.println("Armstrong numbers in the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            int originalNum = i;
            int sum = 0;
            int num = i;
            while (num != 0) {
                int digit = num % 10;
                sum += Math.pow(digit, 3);
                num /= 10;
            }
            if (sum == originalNum) {
                System.out.print(originalNum + " ");
            }
        }
    }
}
