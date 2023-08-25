import java.util.Random;
import java.util.Scanner;

public class MatrixTransportation {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        //Random random = new Random();
        System.out.println("Введіть значення M: ");
        int m = scanner.nextInt();
        System.out.println("Введіть значення N:");
        int n = scanner.nextInt();
        int[][] matrix1 = new int [m][n];
        int[][] matrix2 = new int [n][m];
        System.out.println("Введіть елемент першої матриці:");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
       System.out.println("Перша матриця: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix1[i][j] + " ");
            }
          System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               matrix2[j][i] = matrix1[i][j];
            }
        }System.out.println("Друга матриця(транспортована):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
          System.out.println();
        }
    }


}
