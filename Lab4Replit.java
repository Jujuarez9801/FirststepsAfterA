//                                /// Lab part B ///
////import java.util.Scanner;
//////import java.util.Random;
//////
//public class Lab4Replit {
//////    public static void main(String[] args) {
//////
//////        // below, loop until the user enters a size of at least 5
//////        Scanner s = new Scanner(System.in);
//////        int count = 1;
//////        System.out.print("Enter the password size (between 5 and 10): ");
//////        int size = s.nextInt();
//////
//////
//////        while(size < 5 || size > 10){
//////            System.out.print("Enter the password size (between 5 and 10): ");
//////            size = s.nextInt();
//////        }
//////
//////        // leave this line alone
//////        String password = generatePassword(size);
//////
//////        // below, loop until the user enters the password correctly
//////        System.out.print("The password is \"" + password +
//////                "\"; enter it perfectly: ");
//////
//////        String guess = s.next();
//////
//////        while(!guess.equals(password)){
//////            count++;
//////            System.out.print("The password is \"" + password +
//////                    "\"; enter it perfectly: ");
//////
//////            guess = s.next();
//////
//////        }
//////
//////        if(count == 1) {
//////            System.out.println("It took you " + count + " try!");
//////        }else{
//////            System.out.println("It took you " + count + " tries!");
//////        }
//////    }
//////
//////    public static String generatePassword(int length) {
//////        Random r = new Random();
//////        StringBuffer sb = new StringBuffer();
//////        for(int i = 0; i < length; i++) {
//////            sb.append((char)(r.nextInt(75) + 48));
//////        }
//////        return sb.toString();
//////    }
//////}
//

//                                /// Lab part C ///
import java.util.Scanner;
import java.util.Random;
//
class Lab4Replit {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int guessCount = 0;
        int guessLimit = 5;
        int max = 20;
        int secret = Math.abs(r.nextInt()) % max + 1;
        int guess = 0;
        System.out.println(secret);
        while(guess != secret && guessCount < guessLimit) {
            System.out.println("You made " + guessCount + " guesses and have " + (guessLimit - guessCount) + " left");
            System.out.print("Guess a number between 1-20: ");
            guess = s.nextInt();
            guessCount++;
            if(guess < secret){
                System.out.println("Your guess was too low!");
            }else if(guess > secret){
                System.out.println("Your guess was too high!");
            }
        }
        System.out.println("Secret is " + secret);
//
//
//    }
//}

                                    /// Lab part A: Even numbers ///

//import java.util.Scanner;

//class Lab4Replit {
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int input = 1;
        int count = 0;
        while(input%2 != 0) { // keeps looping until an even number is inputted
            System.out.print("Please enter an even number: ");
            input = s.nextInt();
            count++;
        }
        System.out.println("Number is " + input);
        if(count == 1){
            System.out.println("It took you " + count + " try!");
        }else {
            System.out.println("It took you " + count + " tries!");
        }

    }
}