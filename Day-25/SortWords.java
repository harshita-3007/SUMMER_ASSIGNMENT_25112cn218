import java.util.*;

public class SortWords {
    public static void main(String[] args) {
        String[] words = {"apple", "hi", "banana", "cat"};

        Arrays.sort(words, (a, b) -> a.length() - b.length());

        for (String w : words)
            System.out.println(w);
    }
}