import java.util.Scanner;

public class HwWk5 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int input = 0;
//        int count = 0;
//        int max = Integer.MIN_VALUE;
//        while (count < 5) {
//            System.out.print("Enter a whole number: ");
//            input = s.nextInt();
//            count++;
//
//            if(input > max) {
//                max = input;
//            }
//        }
//        System.out.println("The largest number entered was " + max);
//        System.out.println("Done");


        // Write a program to read in a number from the user. Your program should find the sum of all even
        //numbers and odd numbers between 0 and the user entered number.
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int input = s.nextInt();
//        int sum = 0;
//        for(int i = 2; i <= input; i += 2) {
//            sum += i;
//        }
//        System.out.println("The sum of even numbers between 1 and " + input + " is " + sum);

//        int i = 1;
//        int sumEven = 0;
//        int sumOdd = 0;
//
//        System.out.print("Enter a number: ");
//        int input = s.nextInt();
//
//        while (i <= input) {  //while i is less than input, keep going until i
//            if (i % 2 == 0) {
//                sumEven += i;
//            } else {
//                sumOdd += i;
//            }
////            i += 1;
//            i++;
//        }
//
//        System.out.println("The sum of even numbers between 1 and " + input + " is " + sumEven);
//        System.out.println("The sum of odd numbers between 1 and " + input + " is " + sumOdd);
//    }
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter the X coordinate: ");
            int x = scan.nextInt();
            System.out.print("Enter the Y coordinate: ");
            int y = scan.nextInt();
            if(x == 0 && y == 0) {
                System.out.println("Done");
                break;
            }
            else if(x > 0 && y > 0) {
                System.out.println("The point (" + x + "," + y + ") is in Quadrant 1" );
            } else if(x < 0 && y > 0) {
                System.out.println("The point (" + x + "," + y + ") is in Quadrant 2" );
            } else if(x < 0 && y < 0) {
                System.out.println("The point (" + x + "," + y + ") is in Quadrant 3" );
            } else if(x > 0 && y < 0) {
                System.out.println("The point (" + x + "," + y + ") is in Quadrant 4" );
            } else {
                System.out.println("The point (" + x + "," + y + ") is not in a Quadrant");
                System.out.println("Booyah");
            }
        }
    }
}

