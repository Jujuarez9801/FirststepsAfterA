// import java.util.Scanner;
// import java.util.Random;

import java.util.*;

class SecretNumber {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in); //new class
        Random r = new Random(); //new random class

        int rangeSize = 30;
        int offset = 21;
        int secret = Math.abs(r.nextInt()) % rangeSize + offset;

        System.out.print("Enter your secret: ");
        int guess = in.nextInt();
        System.out.println(Math.sqrt(guess)); // finding the sqrt of a number; irrelevant to rest of program

        if(guess > 50){
            System.out.println("Larger than expected!");
        }
        if(guess == 100){
            System.out.println("Why such a large number?");
        }
        if(guess < 21){
            System.out.println("Smaller than expected!");
        }
        //else{
        if(guess == secret){
            System.out.println("Your guess is correct!");
            } else{
                System.out.println("Wrong!");
            }
        //}
        System.out.println("Secret is " + secret);

        //}


        // System.out.print("Enter an int: ");
        // int start = in.nextInt();
        // double x = 1.0 * start / 3;
        // double y = x * 3;
        // System.out.println("Your int is " + start);
        // System.out.println(x);
        // System.out.println(y);

        // if(y == start){
        //   System.out.println("Same");
        // } else{
        //   System.out.println("Different");

        //   }
    }
}