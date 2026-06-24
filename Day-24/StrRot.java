import java.util.*;

public class StrRot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();

        if (a.length() == b.length() && (a + a).contains(b))
            System.out.println("String is rotation");
        else
            System.out.println("String is not rotation");
    }
}