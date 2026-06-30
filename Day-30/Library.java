import java.util.*;

public class Library {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String books[] = {"Java", "Python", "C++", "HTML"};
        boolean issued[] = new boolean[books.length];

        int choice;

        do {
            System.out.println("\n1. Show Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    for(int i=0;i<books.length;i++) {
                        System.out.println((i+1)+". "+books[i]+" - "+
                                (issued[i] ? "Issued" : "Available"));
                    }
                    break;

                case 2:
                    System.out.print("Enter book number: ");
                    int b = sc.nextInt()-1;
                    if(!issued[b]) {
                        issued[b] = true;
                        System.out.println("Book Issued.");
                    } else {
                        System.out.println("Already Issued.");
                    }
                    break;

                case 3:
                    System.out.print("Enter book number: ");
                    b = sc.nextInt()-1;
                    issued[b] = false;
                    System.out.println("Book Returned.");
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice!=4);
    }
}