import java.util.Scanner;
public class countsetbits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int setBitsCount = countSetBits(number);
        System.out.println("Number of set bits in " + number + " is: " + setBitsCount);
        sc.close();
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}
