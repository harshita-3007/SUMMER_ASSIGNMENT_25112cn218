import java.util.*;

public class TicketBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tickets = 5;

        System.out.println("Tickets available: " + tickets);
        System.out.print("How many tickets to book? ");
        int book = sc.nextInt();

        if(book <= tickets){
            tickets -= book;
            System.out.println("Booked successfully!");
        } else {
            System.out.println("Not enough tickets");
        }

        System.out.println("Remaining tickets: " + tickets);
    }
}