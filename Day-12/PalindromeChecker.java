import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num = num / 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        
        scanner.close();
    }
}
