import java.util.Scanner;

public class helloAgain {
    public static void main(String[] args) {
        // Create an array of five integers
        int[] intArray = new int[5];

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter five integers
        System.out.println("Please enter five integers, one at a time:");

        // Store those integers in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Print the array
        System.out.println("The array contains the following integers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Integer #" + (i + 1) + ": " + intArray[i]);
        }
    }
}
