import java.util.Scanner;
import java.util.Random;
// some method practice for now

public class CallingMethodsPracticeExpend {

    public static void printHello() {
        System.out.println("First method: \nHello,");
        System.out.println("How's it going?");
        System.out.println(1 + 3 + 4 + "\n");
    }

    public static void printMessage(String message) {
        System.out.println("Second method: ");
        System.out.println(message);
    }

    public static int printMessage2(String message) {
        System.out.println(message);
        int value = 4;
        return value * value;
    }

    public static int sumRange(int start, int stop) {
        int sum = 0;
        for(int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        printHello();
        printMessage("Welcome back");
//        printMessage2("3rd method: ");
        System.out.println(printMessage2("\n3rd method: "));

        int start, stop;
        System.out.println("\n4th method: ");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        start = s.nextInt();
        do {
            System.out.print("Enter a number greater than " + start + " to stop at: ");
            stop = s.nextInt();
        } while(stop <= start);
        int range = sumRange(start, stop); // gets sum value from 'return sum'
        System.out.println("The sum of numbers between " + start + " and " + stop + " is " + range);
    }
}
