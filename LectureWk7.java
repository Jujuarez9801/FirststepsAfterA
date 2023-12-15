import java.util.Scanner;

public class LectureWk7 {
    public static void main(String[] args) {
        /// Program that calculates and prints out factorial of number entered ///
        Scanner s = new Scanner(System.in);
        int input;
        int prod = 1;
        do {
            System.out.print("Enter a positive integer: ");
            input = s.nextInt();
        } while(input < 1);
        for(int i = 1; i <= input; i++) {
            prod *= i;
        }
        System.out.println(input + "! = " + prod);


        ///  Sides of a square; * and -
//        Scanner s = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter side length above 0: ");
            size = s.nextInt();
        } while(size < 1);
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(i % 2 == 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("- ");
                } //System.out.println();
//                if(j % 2 == 0) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("- ");
//                }
                //System.out.println();
            }
            System.out.println();
        }
//        System.out.println();


//        Scanner s = new Scanner(System.in);
//        int size;
//        do {
//            System.out.print("Enter side length above 0: ");
//            size = s.nextInt();
//        } while(size < 1);
//        for(int i = 0; i < size; i++) {
//            for(int j = 0; j < size; j++) {
//                if(j == (size - 1) - i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("- ");
//                }
////                System.out.println();
//            }
//            System.out.println();


        //  multiples of 7 and such only up to user input number //
//        Scanner s = new Scanner(System.in);
        int input2;
        do {
            System.out.print("Enter a max number to go up to: ");
            input2 = s.nextInt();
        } while(input2 < 1);
        for(int i = 0; i <= input2; i+=7) {
            System.out.println(i);
//            System.out.println(i % 2 == 0);

        }
    }
}


