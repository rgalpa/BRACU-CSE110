import java.util.Scanner;
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of perfect numbers: ");
        int N = scanner.nextInt();
        scanner.close();

        int count = 0;
        int number = 2;

        System.out.println("First " + N + " perfect numbers:");

        while (count < N) {
            int sum = 1;
            int divisor = 2;
            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
                divisor++;
            }
            if (sum == number) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}