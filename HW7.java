import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the vertical diagonal length of the hollow rhombus: ");
        int diagonalLength = scanner.nextInt();

        // Printing the upper triangle
        for (int i = 1; i < diagonalLength; i++) {
            for (int j = 0; j < diagonalLength - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print(i+2);
                
            }
            System.out.println();
        }

        // Printing the lower triangle
        for (int i = diagonalLength - 2; i >= 0; i--) {
            for (int j = 0; j < diagonalLength - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("1");
            if (i > 0) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("1");
            }
            System.out.println();
        }

        scanner.close();
    }
}
