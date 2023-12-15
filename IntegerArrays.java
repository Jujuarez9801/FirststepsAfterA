import java.util.Scanner;

public class IntegerArrays {
    public static void main(String[] args) {
        // create array of five integers
        int[] intArray = new int[5];

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);
        // user enters five integers
        System.out.println("Please kindly enter five integers, one at a time: ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            intArray[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("The array contains the following integers:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Integer #" + (i + 1) + ": " + intArray[i]); }
        }
    }
