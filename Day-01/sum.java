import java.util.Scanner;
public class sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[35m" + "Enter a number : " + "\u001B[0m");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;

        }
        System.out.println("The sum of first " + n + " natural numbers is : " + sum);
    }
    
}

