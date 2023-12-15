/*
 * This is code for a boolean conjunction exercise
 * Lecture 11 - Composite Condition
 * Joshua B. Gross
 * Jan 2023
 * Determine if a person can be
 * an astronaut. Must either be a military officer or have a stem postgrad degree.
 * Also must have good eyesight and be physically fit
 */
import java.util.Scanner;

public class Astronaut {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Are you a military officer or not? (1 for yes, 0 for no): ");
        int officer = s.nextInt();
        System.out.print("Do you have a graduate degree in STEM (science, technology, engineering, mathematics)? (1 for yes, 0 for no): ");
        int stemgrad = s.nextInt();
        System.out.print("Is you eyesight 20/20, or correctable to 2020? (1 for yes, 0 for no): ");
        int goodeyes = s.nextInt();
        System.out.print("Are you physically fit? (1 for yes, 0 for no): ");
        int fit = s.nextInt();
        if((officer == 1 || stemgrad == 1) && (goodeyes == 1 && fit == 1)) {
            System.out.print("You are eligible to become an astronaut at NASA!");
        } else {
            System.out.println("You do not have the requirements to be an astronaut.");
        }

    }
}

//import java.util.Scanner;
//
//class Main {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.print("Are you a military officer or not? Enter 1 for yes and 0 for no: ");
//        int officer = s.nextInt();
//
//        System.out.print("Do you have a STEM degree? 1 for yes, 0 for no: ");
//        int stemgrad = s.nextInt();
//
//        System.out.print("eyesight 2020? 1 for yes, 0 for no: ");
//        int eye = s.nextInt();
//
//        System.out.print("Physically fit? 1 for yes, 0 for no: ");
//        int fit = s.nextInt();
//
//        if((officer == 1 || stemgrad == 1) && (eye == 1 && fit == 1)) {
//            System.out.println("You are able to join!");
//        } else {
//            System.out.print("You are not able yet");
//        }
//
//    }
//
//}