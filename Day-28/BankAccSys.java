import java.util.*;

public class BankAccSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 1000;

        System.out.println("1. Deposit  2. Withdraw");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.print("Enter amount: ");
            int amt = sc.nextInt();
            balance += amt;
            System.out.println("Balance = " + balance);
        } else {
            System.out.print("Enter amount: ");
            int amt = sc.nextInt();
            if(amt <= balance){
                balance -= amt;
                System.out.println("Balance = " + balance);
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
}