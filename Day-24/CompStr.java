import java.util.*;

public class CompStr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringBuilder r = new StringBuilder();
        int c = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1))
                c++;
            else {
                r.append(str.charAt(i - 1)).append(c);
                c = 1;
            }
        }

        System.out.println(r);
    }
}