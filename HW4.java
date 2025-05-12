import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the right triangle: ");
        int height = scanner.nextInt();

        // Loop through each row
        for (int i = 0; i < height; i++) {
            // Print the numbers in the row
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i || i == height - 1) {
                    System.out.print(j + 1);
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}