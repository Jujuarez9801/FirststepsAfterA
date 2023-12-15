import java.util.Scanner;
// Binary to Decimal conversion

public class BinaryToDecimal {
    public static void main(String[] args) {
        int exponent = 0, sum = 0, addValue = 1, input;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter binary number to convert into decimal: ");
        input = s.nextInt();

        int binary = input; // int temp

        while(input > 0) {
            exponent = input % 10;
            sum += exponent * addValue;
            addValue *= 2;
            input /= 10;
        }
        System.out.println("The decimal value of binary number " + binary + " is " + sum);
    }
}
