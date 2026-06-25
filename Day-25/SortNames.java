import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Aman", "Priya", "Neha"};

        Arrays.sort(names);

        for (String n : names)
            System.out.println(n);
    }
}