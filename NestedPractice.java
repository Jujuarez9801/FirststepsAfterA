import java.util.Random;
import java.util.Scanner;

public class NestedPractice {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int sides = 6;
        int dice, roll, rolls, printEvery = 1, sum = 0, rollSum = 0; // randDie == roll
        int count = 0;
        int randDie;
        do {
            System.out.print("How many dice? (1 to many): ");
            dice = s.nextInt();
        } while (dice < 1);

        do {
            System.out.print("How many rolls per die? (1 to many): ");
            rolls = s.nextInt();
        } while (rolls < 1);

        do {
            System.out.print("Print every X rolls (1 to many): ");
            printEvery = s.nextInt();
        } while(printEvery < 1);


        for (int k = 0; k < rolls; k++) { // k is rollCount
            rollSum = 0;
            for (int i = 0; i < dice; i++) { // i is dieCount
               //count++;
                randDie = Math.abs(r.nextInt()) % sides + 1;
                if((k + 1) % printEvery == 0) {
                    System.out.println("Die " + (i + 1) + ": " + randDie + " ");
                }
                //sum += randDie;
                rollSum += randDie;
            }
            sum += rollSum;
            if((k + 1) % printEvery == 0) {
                System.out.println("\tRoll " + (k + 1) + ": " + rollSum);
            }
           // System.out.println("Avg is " + (double) sum / count);
        }
        System.out.println("Sum of " + rolls + " rolls of " + dice + " dice is: " + sum);
        double rollAvg = (double)sum/rolls;
        double dieAvg = (double)sum/(rolls * dice);
                  // alternatively //
        // double rollAvg = 1.0*Sum/rolls;
        // double dieAvg = 1.0*Sum/(rolls * dice);
        System.out.println("For an average of " + rollAvg + " per roll\nand an average of " + dieAvg + " per die");
        s.close();


    }


}
