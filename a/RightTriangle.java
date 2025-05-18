import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the right triangle: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                System.out.print(" ");
            }
            int num = n - i;
            for (int k = 0; k <= i; k++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}