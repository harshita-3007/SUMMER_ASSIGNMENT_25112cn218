import java.util.Scanner;
public class nthtermoffibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the term number: ");
        int n = sc.nextInt();
        int a = 0, b = 1, term = 0;
        if (n == 1) {
            term = a;
        } else if (n == 2) {
            term = b;
        } else {
            for (int i = 3; i <= n; i++) {
                term = a + b;
                a = b;
                b = term;
            }
        }
        System.out.println("The " + n + " term of the Fibonacci series is: " + term);
    }
    
}
