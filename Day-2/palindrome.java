import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int originalNum = num;
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        if (originalNum == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
