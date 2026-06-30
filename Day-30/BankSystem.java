import java.util.*;

public class BankSystem {

    static Scanner sc = new Scanner(System.in);

    static int accNo[] = new int[10];
    static String name[] = new String[10];
    static double balance[] = new double[10];
    static int count = 0;

    // Create Account
    static void createAccount() {
        if (count == 10) {
            System.out.println("Bank Database Full!");
            return;
        }

        System.out.print("Enter Account Number: ");
        accNo[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        name[count] = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance[count] = sc.nextDouble();

        count++;

        System.out.println("Account Created Successfully!");
    }

    // Deposit Money
    static void deposit() {
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (accNo[i] == acc) {
                System.out.print("Enter Deposit Amount: ");
                double amt = sc.nextDouble();

                balance[i] += amt;

                System.out.println("Deposit Successful!");
                System.out.println("New Balance = Rs." + balance[i]);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Withdraw Money
    static void withdraw() {
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (accNo[i] == acc) {

                System.out.print("Enter Withdrawal Amount: ");
                double amt = sc.nextDouble();

                if (amt <= balance[i]) {
                    balance[i] -= amt;
                    System.out.println("Withdrawal Successful!");
                    System.out.println("Remaining Balance = Rs." + balance[i]);
                } else {
                    System.out.println("Insufficient Balance!");
                }
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Check Balance
    static void checkBalance() {
        System.out.print("Enter Account Number: ");
        int acc = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (accNo[i] == acc) {
                System.out.println("Customer Name : " + name[i]);
                System.out.println("Balance : Rs." + balance[i]);
                return;
            }
        }

        System.out.println("Account Not Found!");
    }

    // Display All Accounts
    static void displayAccounts() {

        if (count == 0) {
            System.out.println("No Accounts Available.");
            return;
        }

        System.out.println("\n------ BANK ACCOUNTS ------");

        for (int i = 0; i < count; i++) {
            System.out.println("Account No : " + accNo[i]);
            System.out.println("Name       : " + name[i]);
            System.out.println("Balance    : Rs." + balance[i]);
            System.out.println("---------------------------");
        }
    }

    public static void main(String args[]) {

        int choice;

        do {

            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Display All Accounts");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    checkBalance();
                    break;

                case 5:
                    displayAccounts();
                    break;

                case 6:
                    System.out.println("Thank You for Using Bank Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);
    }
}