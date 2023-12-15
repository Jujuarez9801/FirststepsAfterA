import java.util.*;
public class HwWk9 {
    public static void main(String[] args) {

        //// Binary number to Decimal number ////
        int input, sums = 0, addValue = 1, exponent = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a binary number to translate into decimal: ");
        input = s.nextInt();

        while(input > 0) {
            exponent = input % 10; // to go right to left // ex: 1010101 % 10 = 1
            sums += exponent * addValue; // ex: 0 + 1 * 1 = 2
            addValue *= 2; // = 1 * 2 = 2 --> 2 * 2 = 4
            input /= 10; // 1010101 / 10 = 101010
        }
        System.out.println("The decimal value is: " + sums);

        //// Add two binary numbers together ////

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first binary number: ");
        long firstBinary = in.nextLong();
        System.out.print("Enter second binary number: ");
        long secondBinary = in.nextLong();

        String sum = "";
        int carry = 0;
        int digit1 = 0;
        int digit2 = 0;
        int sumDigits = 0;

        if(firstBinary == 0 && secondBinary == 0) {
            sum = "0";
        }

        while(firstBinary > 0 || secondBinary > 0) {
            digit1 = (int)(firstBinary % 10);
            digit2 = (int)(secondBinary % 10);
            sumDigits = digit1 + digit2 + carry;

            if(sumDigits == 2) {
                sum = "0" + sum;
                carry = 1;
            } else if(sumDigits == 3) {
                sum = "1" + sum;
                carry = 1;
            } else {
                sum = sumDigits + sum;
                carry = 0;
            }
            firstBinary /= 10;
            secondBinary /= 10;
        } if(carry > 0) { // without this, (example) 101 + 110 = 011 instead of the actual answer, 1011
            sum = "1" + sum;
        }
        System.out.println("The sum of the two binary numbers is " + sum);

    }
}
