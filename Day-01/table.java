import java.util.Scanner;
public class table{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[35m" + "Enter a number : " + "\u001B[0m");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}