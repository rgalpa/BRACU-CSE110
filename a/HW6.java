import java.util.Scanner;
public class HW6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the right triangle: ");
        int height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height - i; j++) {
                System.out.print(" ");
            }
            int num = 1;
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
        
        for (int i = height+1; i >= 1; i-=2) {
            for (int j = i; j <= height+1; j+=2) {
                System.out.print(" ");
            }
            //int num = 1;
            for (int k = 1; k <= i; k++) {
              
                System.out.print(k);
              
                //num++;
            }
            System.out.println();
        }
    }
}