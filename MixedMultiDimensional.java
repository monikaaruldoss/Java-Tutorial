import java.util.Scanner;
public class MixedMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the matrix:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns in the matrix:");
        int cols = sc.nextInt();
        System.out.println("Enter any one Symbol/Alphabet:");
        char symbol = sc.next().charAt(0);
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Modified Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j % 2 != 0) {
                    System.out.print(symbol + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}