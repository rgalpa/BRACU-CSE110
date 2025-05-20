import java.util.Scanner;
public class hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = sc.nextDouble();
        }
        
        double max = array[0];
        int maxIndex = 0;
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Maximum element: " + max + "found at index :" + maxIndex);

        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.println("Minimum element: " + min + "found at index :" + minIndex);

        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        System.out.println("Summation: " + sum);

        double average = sum / length;
        System.out.println("Average: " + average);
        
        sc.close();
    }
}