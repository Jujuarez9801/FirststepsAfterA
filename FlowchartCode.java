import java.util.Scanner;
import java.util.Random;

public class FlowchartCode {
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                Random r = new Random();
                int max = 20;
                int secret = Math.abs(r.nextInt()) % max + 1;
                System.out.println("secret " + secret);
                int guess = 0; // 0 to hold value for user input
                System.out.print("Enter your guess: ");
                guess = in.nextInt();

                while (guess != secret) {
                    if (guess > secret) {
                        System.out.println("Your guess is too high");
                    } else {
                        System.out.println("Your guess is too low");
                    }
                    System.out.print("Enter your guess: ");
                    guess = in.nextInt();
                }

                System.out.println("You won!");


                // double temperature;
                // System.out.print("Enter the current temperature");
                // temperature = in.nextDouble();
                // if(temperature < 40){
                //   System.out.println("It's too cold");
                // } else{
                //   System.out.println("It's not that cold");
                // }
                // System.out.println("I'm done");


                // String name;
                // System.out.println("Enter Name");
                // name = in.nextLine();
                // System.out.println("hello " + name);
            }
        }

