import java.util.Scanner;
import java.util.Random;

public class Lab5Replit {
    public static void main(String[] args) {
        int i = 0; int j = 10;
        while (i < j) {
            System.out.println(i + " " + j);
            i++;
            j--;
        }
         Scanner s = new Scanner(System.in);
        // System.out.print("Please enter the age of child 1: ");
        // int child1=s.nextInt();
        // System.out.print("Please enter the age of child 2: ");
        // int child2 = s.nextInt();
        // if(child1>child2){
        //   System.out.print("The first child is older");
        // } else if(child1<child2) {
        //   System.out.println("The second child is older");
        // }else{
        //    System.out.println("They are the same age!");
        // }
        //  Scanner s = new Scanner(System.in);
        //  System.out.print("Please enter a max number: ");
        //  int input=s.nextInt();
        // for(int i=0; i*i<input;i++){
        //   int square = i*i;
        //   System.out.println(square);
        // }

        System.out.print("Please guess the secret number 1-20: ");
        int guess = s.nextInt();
        Random r= new Random();
        int max=20;
        int secret= Math.abs(r.nextInt() % max + 1);
        int count=0;
        System.out.println(secret);
        while(guess!=secret && count!= 5){
            if(guess>secret){
                System.out.println("Your number was too high");
            }else if(guess<secret){
                System.out.println("Your number was too low");
            }
            System.out.println("Please try again: ");
            guess=s.nextInt();
            count++;
        }
        System.out.print("The secret number was " + secret);

        }
}
