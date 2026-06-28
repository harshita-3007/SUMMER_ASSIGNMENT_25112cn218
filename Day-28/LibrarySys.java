import java.util.*;

public class LibrarySys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java Basics", "DSA", "DBMS"};
        
        System.out.println("Library Books:");
        for(String b : books){
            System.out.println("- " + b);
        }

        System.out.print("Enter book to issue: ");
        String issue = sc.nextLine();

        System.out.println(issue + " issued successfully!");
    }
}