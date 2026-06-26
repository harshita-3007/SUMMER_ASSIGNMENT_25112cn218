import java.util.*;
public class ATMSim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bal = 1000;
        int ch;

        do {
            System.out.println("1.Deposit 2.Withdraw 3.Check 4.Exit");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Amount: ");
                bal += sc.nextInt();
            } else if (ch == 2) {
                System.out.print("Amount: ");
                int w = sc.nextInt();
                if (w <= bal) bal -= w;
                else System.out.println("Insufficient balance");
            } else if (ch == 3) {
                System.out.println("Balance: " + bal);
            }
        } while (ch != 4);
    }
}