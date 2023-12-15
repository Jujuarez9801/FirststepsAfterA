import java.util.Scanner;

// Decimal to Binary conversion

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Decimal number to convert into Binary: ");
        int decimal = s.nextInt();
        int decimalPrint = decimal;

        if(decimal == 0) {
            return;
        }

        int binaryResult = 0;
        int addValue = 1;
        int remainder;

        while(decimal > 0) {
            remainder = decimal % 2;
            binaryResult += remainder * addValue;
            decimal /= 2;

            addValue *= 10;
        }

        System.out.println("Decimal being converted: " + decimalPrint);
        System.out.println("Decimal being converted into Binary is " + binaryResult);

    }
}
