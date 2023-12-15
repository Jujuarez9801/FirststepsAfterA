/*************************
 * This is code for an if/else-if/else exercise
 * Lecture 11 - Else If
 * Joshua B. Gross
 * Jan 2023
 * Based on age, tell a person what age group they belong to
 *************************/
import java.util.Scanner;

public class ChildToRelic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        String ageRange;

        if(age <= 4) {
            ageRange = "young child";
        } else if(age <= 9) {
            ageRange = "child";
        } else if(age <= 12) {
            ageRange = "tween";
        } else if(age <= 19) {
            ageRange = "teen";
        } else if(age <= 35) {
            ageRange = "young adult";
        } else
            ageRange = "relic of a bygone era";
        {
            System.out.println("You are a " + ageRange);

        }
    }
}

// Another example prograam
//
//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        System.out.print("Please enter an age: ");
//        Scanner scan = new Scanner(System.in);
//        int age = scan.nextInt();
//        String adol;
//
//        if(age <= 4) {
//            adol = "child";
//        } else if(age <=9) {
//            adol = "older child";
//        } else if(age > 12 && age <=17) {
//            adol = "teen";
//        } else if(age <= 28) {
//            adol = "young adult";
//        } else {
//            adol = "person beyond this range";
//        }
//        System.out.print("You are a " + adol);
//    }
//}