// While loop counting down from 10 by 2 at a time
import java.util.Scanner;
import java.util.Random;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 10; // [1] loop variable
        while (counter >= 1) // [2] our condition
        {
            System.out.println(counter); // [3] loop body
            counter -= 1; //            vvvvvvvvvvvvvvvvvvvvvvvv
//            counter = counter - 2; // [4] update loop variable, same as above

        }




        Scanner s = new Scanner(System.in);
        Random r = new Random();
//        System.out.print("What is the temperature? ");
//        double temperature = s.nextDouble();
//        while(temperature > 72) {
//            System.out.println("It's too hot.");
//            System.out.print("What is the temperature? ");
//            temperature = s.nextDouble();
//        }
//        System.out.println("Finally, it's nice out.");


//        System.out.print("Enter the base: ");
//         int base = s.nextInt();
//         System.out.print("Enter the power (greater than 0): ");
//         int power = s.nextInt();
//         int powercount = power, result = 1;
//         while (powercount > 0) {
//             result *= base;
//             powercount--;
//            }
//        System.out.println(base + " to the power of "
//         + power + " is " + result);


        /////// Flowcharts/while loops and stuff ///////

//        String answer = "N";
//        do {
//            System.out.print("Are you having fun? (Y/N): ");
//            answer = s.next();
//        } while (! answer.equalsIgnoreCase("Y"));
//        System.out.println("Finally!");


//        int secret = r.nextInt() % 20 + 1;
//        System.out.println(secret);
//        System.out.print("Guess the secret number: ");
//        int guess = s.nextInt();
//        while(guess != secret) {
//            System.out.println("Wrong number!");
//            guess = s.nextInt();
//        } while(guess > secret) {
//            System.out.println("Guess too high");
//            guess = s.nextInt();
//        }
//        System.out.println("You guessed correct!");

        int secret = Math.abs(r.nextInt()) % 20 + 1;
        System.out.println(secret);
        System.out.print("Guess the secret number: ");
        int guess = s.nextInt();
        int count = 0;
        while(guess != secret) {
            System.out.println("Guess is incorrect");
//            count++;
            if (guess < secret) {
                System.out.print("Guess is too low, try again: ");
                guess = s.nextInt();
                count++;
            }
            else if (guess > secret) {
                System.out.print("Guess is too high, try again: ");
                guess = s.nextInt();
                count++;
            }
//            else if(guess != secret) {
//                count++;
//                guess = s.nextInt();
//            }
        }

        System.out.println("You guessed correct!");
        System.out.println("You took " + count + " tries");


    }
    }

