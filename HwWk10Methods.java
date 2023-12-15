import java.util.Scanner;

public class HwWk10Methods {

    public static int getPositiveNumber(String output, Scanner in) {
        int result = 0;
        do {
            System.out.print(output);
            result = in.nextInt();
        } while(result <= 0);
        return result;
    }

    public static int getNumberAbove(int minimum, Scanner in) {
        int number = minimum;
        do {
            System.out.print("Enter a number above " + minimum + ": ");
            number = in.nextInt();
        } while(number <= minimum);
        return number;
    }

    public static int getNumberInRange(int minimum, int maximum, Scanner in) {
        int nextNumber = minimum;
        do {
            System.out.print("Enter a number between " + minimum + " and " + maximum + ": " );
            nextNumber = in.nextInt();
        } while(nextNumber < minimum || nextNumber > maximum);
//        System.out.print("Enter a number between " + minimum + " and " + maximum + ": " );
//        int nextNumber = in.nextInt();
//        while(nextNumber <= minimum || nextNumber >= maximum) {
//            System.out.print("Enter a number between " + minimum + " and " + maximum + ": " );
//            nextNumber = in.nextInt();
//        }
        return nextNumber;
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int count = getPositiveNumber("Enter the count of numbers to check: ", s); // (output, in)

        System.out.print("Enter a minimum number for the range: ");
        int minimum = s.nextInt();

        int maximum = getNumberAbove(minimum, s);
        int nextNumber;

        do {
            nextNumber = getNumberInRange(minimum, maximum, s);
            System.out.print("Is " + nextNumber + " even? " + isEven(nextNumber));
            count--;
        } while(count > 0);
    }
}
