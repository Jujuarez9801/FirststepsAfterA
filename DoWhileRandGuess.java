import java.util.Scanner;
import java.util.Random;

public class DoWhileRandGuess {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int max = 25;
        int offset = 30;
        int guess;
        int secret = Math.abs(r.nextInt()) % max + offset;
        System.out.println(secret);
        do {
            System.out.print("Enter a number between 25 and 55: ");
            guess = s.nextInt();
            if(guess == secret) {
                System.out.println("You guessed correctly!");
            } else if(guess > secret) {
                System.out.println("Your guess was too high");
            } else {
                System.out.println("Your guess was too low");
            }
        } while(guess != secret);
        System.out.println("Done");
    }
}
