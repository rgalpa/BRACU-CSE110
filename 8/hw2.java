import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Find unique elements
        int uniqueCount = 0;
        int[] uniqueArray = new int[size];
        for (int i = 0; i < size; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i] == uniqueArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Print the array with unique elements
        System.out.println("Array with unique elements:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + " ");
        }

        scanner.close();
    }
}