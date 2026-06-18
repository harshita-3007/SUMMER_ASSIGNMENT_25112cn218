import java.util.Scanner;

class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n1; i++) {
            boolean found = false;

            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.print(a[i] + " ");
            }
        }
    }
}