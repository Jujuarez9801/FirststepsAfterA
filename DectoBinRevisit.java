import java.util.Scanner;

public class DectoBinRevisit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int decimal = 0;
        do {
            System.out.print("Enter decimal number to convert to binary: ");
            decimal = s.nextInt();
        } while(decimal <= 0);

        int decimalHold = decimal;

        int binaryResult = 0, addValue = 1, remainder;
        while(decimal > 0) {
            remainder = decimal % 2;
            binaryResult += remainder * addValue;
            decimal /= 2;
            addValue *= 10;
        }
        System.out.println("Decimal number of " + decimalHold + " is in binary " + binaryResult);
    }
}
