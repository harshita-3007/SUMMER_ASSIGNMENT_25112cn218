import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[35m" + "Enter a number : " + "\u001B[0m");
        int n = sc.nextInt();
        long factorial = 1;
        for(int i=1; i<=n; i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of " + n + " is : " + factorial);
    }
}
