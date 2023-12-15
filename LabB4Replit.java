import java.util.Scanner;
import java.util.Random;

class LabB4Replit {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int max = 20;
        // int result = Math.abs(());
        // System.out.print("Select a number between 1 and 20: ");
        System.out.print("Guess the spread: ");
        int guess = s.nextInt();
        int secret = Math.abs(r.nextInt()) % max + 1;
        int point = Math.abs(r.nextInt()) % max + 1;

        int spread = Math.abs(point - secret);
        int spreadResult = Math.abs(guess - spread);

        if(point == secret){
            System.out.println("Need to generate a new secret number ");
            secret = Math.abs(r.nextInt()) % max + 1;
        }
        if(point == secret){
            System.out.println("I'm bad at generating random numbers, I give up ");
            return;
        }

        // System.out.print("Select a number between 1 and 20");
        //   if(guess == secret){
        //     System.out.println("Your guess was correct ");
        //   }
        //   if(1 > guess||guess > max) {
        //     System.out.println("Your guess was invalid ");
        //   }


        //   if(guess > secret) {
        //   System.out.println("Your guess was too high ");
        // } if(guess < secret) {
        //   System.out.println("Your guess was too low");
        if(guess <= spread) {
            System.out.println("You win points equal to " + guess);
        }
        if(guess > spread) {
            System.out.println("You lose " + spreadResult + " points");
        }
        System.out.println("The secret value was " + secret + "for a spread of " + spread);
        System.out.println("Point: " + point);
        System.out.println("Spread is: " + spread);
    }
}