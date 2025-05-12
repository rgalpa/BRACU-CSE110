import java.util.Scanner;
public class RightTriangle2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the right triangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i >= 1; i-=2) {
            for (int j = i; j < height *2; j+=2) {
                System.out.print(" ");
            }
            //int num = 1;
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
                //num++;
            }
            System.out.println();
        }
    }
}