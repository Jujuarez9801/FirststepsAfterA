import java.util.Scanner;

// Decimal to Binary

public class TempFile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int decimal = s.nextInt();

        int binaryResult = 0, addValue = 1, remainder;
        while(decimal > 0) {
            remainder = decimal % 2;
            binaryResult += remainder * addValue;
            decimal /= 2;

            addValue *= 10;
        }
        System.out.println("Binary result is " + binaryResult);

    }
}
