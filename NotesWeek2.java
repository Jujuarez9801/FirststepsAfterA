import java.util.Scanner;
import java.util.Random;

public class NotesWeek2 {
    public static void main(String[] args) {

//        System.out.println("Hello World!");
//        double x =  Math.pow(2,3);
//        int y = Math.min(3,9);
//        int z = Math.max(3,9);
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);

      //  rand.nextInt();
//        Random r1 = new Random(10);
//        Random r2 = new Random(10);
//        int a1 = r1.nextInt(); // a1 and a2 will be the same
//        int a2 = r2.nextInt();
//        int b1 = r1.nextInt();
//        int b2 = r2.nextInt();
//        System.out.println( a1 + " " + a2 + " " + b1 + " " + b2);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the population amount: ");
        int pop;
        pop = scanner.nextInt();
        System.out.println("The total population is " + pop);


        // 1 - 52
//        Random anything = new Random();
//        int card1 = Math.abs(anything.nextInt()) % 52 + 1;
//        int card2 = Math.abs(anything.nextInt()) % 52 + 1;
//        int card3 = Math.abs(anything.nextInt()) % 52 + 1;
//        System.out.println(card1);
//        System.out.println(card2);
//        System.out.println(card3);


        //int dieRoll = Math.abs(rand.nextInt()) % 6 + 1; // between 1-6
        Scanner scan = new Scanner(System.in);
        String password = "secret";
        System.out.print("Enter the password: ");
        String userInput = scan.next();
        boolean allowAccess = true;

        if(userInput == password) {
            System.out.print("You're in.");
            allowAccess = true;
         } else {
            System.out.print("Wrong password.");
            allowAccess = false;
        }

    }
}
