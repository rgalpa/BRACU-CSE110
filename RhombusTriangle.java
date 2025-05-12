import java.util.Scanner;

public class RhombusTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the vertical diagonal length of the hollow rhombus: ");
        int diagonalLength = scanner.nextInt();
        int width = 2 * diagonalLength - 1;

        // Printing the upper triangle
        for (int i = 0; i < diagonalLength; i++) {
            // Print leading spaces
            for (int j = 0; j < diagonalLength - i - 1; j++) {
                System.out.print(" ");
            }

            // Print left numbers
            System.out.print("1");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("1");
            }
            
            // Print right numbers
            if (i < diagonalLength - 1) {
                System.out.print((2 * i + 1));
            }

            System.out.println();
        }

        // Printing the lower triangle
        for (int i = diagonalLength - 2; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j < diagonalLength - i - 1; j++) {
                System.out.print(" ");
            }

            // Print left numbers
            System.out.print("1");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("1");
            }

            // Print right numbers
            if (i < diagonalLength - 1) {
                System.out.print((2 * i + 1));
            }

            System.out.println();
        }

        scanner.close();
    }
}
