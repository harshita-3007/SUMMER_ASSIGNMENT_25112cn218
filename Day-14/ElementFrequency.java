import java.util.Scanner;

public class ElementFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt(), count = 0;
        
        for (int x : arr) {
            if (x == target) count++;
        }
        System.out.println(count);
        sc.close();
    }
}
