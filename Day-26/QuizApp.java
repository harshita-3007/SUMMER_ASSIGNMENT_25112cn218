import java.util.*;
public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("1. Capital of India?");
        System.out.println("a) Delhi b) Mumbai c) Kolkata");
        if (sc.next().equals("a")) score++;

        System.out.println("2. 2 + 2 = ?");
        System.out.println("a) 3 b) 4 c) 5");
        if (sc.next().equals("b")) score++;

        System.out.println("3. Java is?");
        System.out.println("a) OS b) Language c) Browser");
        if (sc.next().equals("b")) score++;

        System.out.println("Score: " + score);
    }
}