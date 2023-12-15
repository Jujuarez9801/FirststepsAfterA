/*
 This is code for compound conjunction exercise
 Lecture 11 - Compound Condition
 Joshua B. Gross
 Jan 2023
 Offer discount if income is less than $25,000
 and person is a college student or under 25
 */
import java.util.Scanner;

public class CollegeDiscount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = scan.nextDouble();
        System.out.print("Please enter your age: ");
        int age = scan.nextInt();
        System.out.print("Are you a college student or not? 1 for yes, 0 for no: ");
        int college = scan.nextInt();
        if((income < 25000) && (college == 1 || age < 25)) {
            System.out.println("You get the discount!");
        } else {
            System.out.println("You don't get the discount.");
        }

    }
}


//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.print("please enter your income: $");
//        double income = s.nextDouble();
//        System.out.print("Please enter your age: ");
//        int age = s.nextInt();
//        System.out.print("Are you a college student or not? 1 for yes, 0 for no: ");
//        int col = s.nextInt();
//
//        if((income < 25000) && (age < 25 || col == 1)){
//            System.out.print("You are eligible!");
//        } else
//            System.out.println("You are not eligible");
//    }
//}