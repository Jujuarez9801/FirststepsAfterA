import java.util.Scanner;
import java.util.Random;
public class Lab7 {
    public static void Main(String [] args) {
/*
CST231-Lab 7
Justin Juarez
Miguel Rios
Andrea Hernandez
10/13/23
*/
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int sum = 0;
        int count = 1;
        int rollCount = 1;
        int rollSum = 0;

        System.out.print("How many dice (1 to many): ");
        int numDice = s.nextInt();
        System.out.print("How many rolls (1 to many): ");
        int numRolls = s.nextInt();
        do {
            while(count <= numDice){
                int dieCount = Math.abs(r.nextInt() % 6) + 1;
                sum += dieCount;
                rollSum += dieCount;
                System.out.print("Die " + count + ": " + dieCount + " Roll " + rollSum + " ");
                rollCount++;
                count++;
            }
            System.out.println();
        } while(rollCount <= numRolls);

        System.out.println("Sum of " + count + " dice: " + sum);
        System.out.println("for an average of " + (double)sum/numDice +" per roll");
        System.out.println("and average of "+ (double)numDice/numRolls +" per die");
            }
        }

