import java.util.*;

public class SymmetricMatrix {
    public static void main(String[] args) {

        int[][] a = {
            {1, 2, 3},
            {2, 4, 5},
            {3, 5, 6}
        };

        boolean isSymmetric = true;

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a.length; j++) {
                if(a[i][j] != a[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if(isSymmetric) {
            System.out.println("Symmetric Matrix");
        } else {
            System.out.println("Not Symmetric Matrix");
        }
    }
}