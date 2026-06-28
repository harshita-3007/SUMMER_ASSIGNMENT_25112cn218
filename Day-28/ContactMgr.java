import java.util.*;

public class ContactMgr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Aman", "Riya", "Karan"};

        System.out.println("Contacts:");
        for(String n : names){
            System.out.println(n);
        }

        System.out.print("Search contact: ");
        String search = sc.nextLine();

        boolean found = false;

        for(String n : names){
            if(n.equalsIgnoreCase(search)){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Contact found!");
        } else {
            System.out.println("Not found!");
        }
    }
}