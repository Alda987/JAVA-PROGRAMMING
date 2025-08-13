package lab;
import java.util.Scanner;

public class Twoarray {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers for a 4x3 matrix:");

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        
        int[][] transpose = new int[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        
    }
}
