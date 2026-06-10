public class Q40 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++);
            }
            ch -= 2;
            for (int j = 0; j < i; j++) {
                System.out.print(ch--);
            }

            System.out.println();
        }
    }
}

