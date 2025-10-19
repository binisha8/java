import java.util.Scanner;

public class FunctionForSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("\nEnter elements for Matrix A:");
        matrixRead(a);

        System.out.println("\nEnter elements for Matrix B:");
        matrixRead(b);

        int[][] c = new int[rows][cols];

        // Matrix addition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nSum of Matrices (Matrix C = A + B):");
        printMatrix(c);
    }

    // Function to read matrix elements
    static void matrixRead(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
    }

    // Function to print matrix neatly
    static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
