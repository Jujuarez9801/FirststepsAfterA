//import java.util.Scanner;
import java.util.*;

public class ExamPractice {

//    public static int rollDie(int sides, Random r) {
//        return Math.abs(r.nextInt()) % sides + 1;
//    }
//
//    public static int rollDice(int count, int sides, Random r) {
//        int sum = 0, d;
//        for(int i = 0; i < count; i++) {
//            d = rollDie(sides, r);
//            System.out.println("\tRolled a " + d);
//            sum += d;
//        }
//        return sum;
//    }
//
//    public static int getPositiveNumberFromUser(String message, Scanner s) {
//        int result;
//        do {
//            System.out.print(message + " ");
//            result = s.nextInt();
//        } while(result < 1);
//        return result;
//    }


    public static String quux(double x, double y) {
        String message = "secret message";
        System.out.println("\tEntering quux");
        System.out.println("\tFirst double parameter is " + x);
        System.out.println("\tSecond double parameter is " + y);
        double u = bar(6);
        System.out.println("\tRecieved " + u + " as a return value");
        System.out.println("\tReturning the string " + message);
        System.out.println("\tExiting quux");
        return message;
    }

    public static double bar(int num) {
        double o = 4.5;
        System.out.println("\t\tEntering bar");
        System.out.println("\t\tint parameter value is " + num);
        int k = foo("I like otters");
        System.out.println("\t\tReceived " + k + " as a return value");
        System.out.println("\t\tReturning double " + o);
        System.out.println("\t\tExiting bar");
        return o;
    }

    public static int foo(String message) {
        System.out.println("\t\t\tEntering foo");
        System.out.println("\t\t\tString parameter value is \"" + message + "\"");
        Random r = new Random();
        int ra = Math.abs(r.nextInt()) % 10;
        System.out.println("\t\t\tReturning random int of " + ra);
        System.out.println("\t\t\tExiting foo");
        return ra;
    }

    public static void main(String[] args) {
        System.out.println("Entering main");
        String s = quux(0.5,2.22);
        System.out.println("The String quux returned is \"" + s + "\"");
        System.out.println("Exiting main");


//        Scanner s = new Scanner(System.in);
//        int sides, diceCount, times, result;
//        sides = getPositiveNumberFromUser("How many sides should the dice have?: ", s);
//        diceCount = getPositiveNumberFromUser("How many dice should I roll each time?: ", s);
//        times = getPositiveNumberFromUser("How many times should I roll?: ", s);
//        Random r = new Random();
//        for(int i = 0; i < times; i++) {
//            result = rollDice(diceCount, sides, r);
//            System.out.println("Roll " + (i+1) + " was " + result);
//        }

    }
}
