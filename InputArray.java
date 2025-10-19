import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];

        // Input section
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {  // <-- use a[i].length here
                System.out.print("Enter element for position [" + i + "][" + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        // Output section
        System.out.println("\nThe entered matrix is:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Always close scanner
    }
}
