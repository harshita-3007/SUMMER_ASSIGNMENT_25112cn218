import java.util.*;

public class RemDup {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String r = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (r.indexOf(ch) == -1)
                r += ch;
        }

        System.out.println(r);
    }
}