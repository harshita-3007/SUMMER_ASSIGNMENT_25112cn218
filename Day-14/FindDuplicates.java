import java.util.Scanner;
import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int x : arr) {
            if (!seen.add(x)) duplicates.add(x);
        }
        System.out.println(duplicates);
        sc.close();
    }
}
