import java.util.*;
public class NumGuess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int num = r.nextInt(100) + 1;
        int guess = 0;

        while (guess != num) {
            System.out.print("Enter guess: ");
            guess = sc.nextInt();

            if (guess < num) System.out.println("Too low");
            else if (guess > num) System.out.println("Too high");
            else System.out.println("Correct!");
        }
    }
}