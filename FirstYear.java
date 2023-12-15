//import java.util.Scanner;
//
//public class FirstYear {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter your credits: ");
//        String year;
//        int credits = scan.nextInt();
//
//        if(credits < 32) {
//            year = "First";
//        } else if(credits < 64) {
//            year = "Second";
//        } else {
//            year = "Unknown";
//        }
//
//         System.out.println("You are a " + year + "-year student.");
//
//    }
//}
//        System.out.println("You are a " + year + " student.");


import java.util.Scanner;
// 1. else block doesn't need a condition
// 2. You can use just if, but if you want to stop the //program when it meets a result

class FirstYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please Enter your Grade from (0-100): ");
        int grade = s.nextInt();
        String gradeResult;
        if (grade > 100 || grade < 0) {
            gradeResult = "Invalid";
            System.out.print("Error, please reenter grade: ");
            grade = s.nextInt();
        }
        if (grade > 100 || grade < 0)  {
            System.out.print("Error, exiting program");
            return;
        }
        if (grade >= 90) {
            gradeResult = "A";
        } else if (grade >= 80) {
            gradeResult = "B";
        } else if (grade >= 70) {
            gradeResult = "C";
        } else if (grade >= 60) {
            gradeResult = "D";
        } else {
            gradeResult = "F";
        }
        System.out.println("Your grade is a " + gradeResult);
        // Scanner s = new Scanner(System.in);
        // System.out.print("Please enter an integer: ");
        // int num = s.nextInt(); // user inputting integer
        // if (num % 2 == 0) { // If remainder = 0, we will say num is even
        //   System.out.println("The number is even");
        // } else {
        //   System.out.println("The number is odd");
        // }
        // if (num > 0) {
        //   System.out.println(num + " is positive"); // positive
        // } else if(num == 0) {
        //   System.out.println(num + " is neither positive or negative"); // Making sure that zero is accounted for because its neither
        // } else {
        //   System.out.println(num + " is negative");
        // }
    }
}