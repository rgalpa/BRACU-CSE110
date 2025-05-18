import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the rectangle: ");
        int width = scanner.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int height = scanner.nextInt();
        
        for (int i = 1; i <= width; i++) {
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= height - 2; i++) {
          int a = 1; 
          System.out.print(a);
          a++;
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            if (width > 1) {
                System.out.print(width);
            }
            System.out.println();
        }
        if (height > 1) {
            for (int i = 1; i <= width; i++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}