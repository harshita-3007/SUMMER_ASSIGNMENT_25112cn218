import java.util.*;

public class LongWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] a = str.split(" ");
        String m = "";

        for (String x : a) {
            if (x.length() > m.length())
                m = x;
        }

        System.out.println(m);
    }
}