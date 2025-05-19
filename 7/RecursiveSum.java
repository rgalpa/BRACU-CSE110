import java.util.Scanner;

public class RecursiveSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        calculateSum(1,n);
        //System.out.println(sum);
    }

    public static int calculateSum(int a, int n) {
        if (n == 0) {
            return a;
        } else {
          System.out.print(n);
            return calculateSum(a+1,n - 1);
        }
    }
}