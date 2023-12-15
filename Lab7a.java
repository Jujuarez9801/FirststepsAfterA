import java.util.Scanner;
import java.util.Random;
public class Lab7a  {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int sum = 0;
        int count = 1;
        int rollCount = 0;
        int rollSum = 0;
// make is so this program takes however many dice user enters and rolls, for each dice, how ever many the numRolls is entered
        System.out.print("How many dice (1 to many): ");
        int numDice = s.nextInt();
        System.out.print("How many rolls (1 to many): ");
        int numRolls = s.nextInt();
        int dieCount = 0;
        do {
//            while(count < numDice){
                dieCount = Math.abs(r.nextInt() % 6) + 1;
                sum += dieCount;
                rollSum += dieCount;
                System.out.print("Die " + count + ": " + dieCount + " ");
                rollCount++;
                count++;
//                if(rollCount < numRolls) {
//                    continue;
//                }
//                if(rollCount)

//            count++;
            System.out.print(" Roll " + rollCount + ": " + rollSum);
            System.out.println();
        } while(count < numDice);
        count--;

        System.out.println("Sum of " + count + " dice: " + sum);
        System.out.println("for an average of " + (double)sum/numDice +" per roll");
        System.out.println("and average of "+ (double)numDice/numRolls +" per die");
/*
CST231-Lab 7
Justin Juarez
Miguel Rios
Andrea Hernandez
10/13/23
*/

    }
}

