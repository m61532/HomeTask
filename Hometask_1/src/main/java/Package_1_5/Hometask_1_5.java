package Package_1_5;

import java.util.Random;

public class Hometask_1_5 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(10);
        int [][] matrix = new int [n+10][n+10];
        for (int i = 0; i < n + 10; i++ ){
            for (int j = 0; j < n + 10; j++){
                matrix[i][j] = (i == j) || (i+j == n + 9 ) ? 1 : 0;
            }
        }
        for (int i = 0; i < n + 10; i++ ){
            for (int j = 0; j < n + 10; j++){
                System.out.print(matrix [i][j]);
            }
            System.out.println("\n");
        }
    }
}
