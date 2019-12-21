import java.util.Arrays;
import java.util.Random;

public class Combination {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 5;
        int quantity = 70;
        int[][] comb = new int[quantity][a];
        for (int i = 0; i < comb.length; i++) {
            for (int j = 0; j < comb[i].length; j++) {
                if (j == 0) comb[i][j] = random.nextInt(8);
                else comb[i][j] = random.nextInt(12);
            }
        }
        for (int i = 0; i < comb.length; i++) {
            for (int j = 0; j < comb[i].length; j++) {
                System.out.print(comb[i][j] + "\t");
            }
            System.out.println();
        }
//        System.out.println(Arrays.toString(comb));
    }
}
