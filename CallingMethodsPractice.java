import java.util.Scanner;
import java.util.Random;
// some practice of lecture Wk10 (currently)

public class CallingMethodsPractice {

    public static void printHello() {
        System.out.println("Method test 1:");
        System.out.println("Hello");
    }

    public static void printMessage(String messagee) {
        System.out.println("\nMethod test 2:");
        System.out.println(messagee);
    }

    public static int printMessage2(String message) {
        System.out.print(message);
        int value = 9;
        return value * value;
    }

    public static  int sumRange(int start, int stop) {
        int sum = 0;
        for(int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }

//    public static int sumRangeEach (int num1, int num2) {
//        int sum = 0;
//        for(int i = num1; i <= num2; i++) {
//            sum += i;
//        }
//        return sum;
//    }

    public static double randNum (int rand1, int rand2) {
        Random r = new Random();
         return Math.abs(r.nextInt()) % 20 + 1; // I'll come back to this

    }

    public static void main(String[] args) {
        printHello();
        printMessage("Hello there");
        System.out.println(printMessage2("Need this to print out: ") + 2); // if 2 + 83 = 283 from string


        System.out.println("Sum of numbers between -5 and 10 is: " + sumRange(-5,10));
        System.out.println("Sum of numbers between 10 and 20 is: " + sumRange(10,20));
        System.out.println("Random nums: " + randNum(1,5));

        int start, stop;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter starting number: ");
        start = s.nextInt();
        do {
            System.out.print("Enter stopping number above " + start + ": ");
            stop = s.nextInt();
        } while(stop <= start);
        int range = sumRange(start, stop);
        System.out.println("The sum of numbers between " + start + " and " + stop + " is " + range);
    }
}
