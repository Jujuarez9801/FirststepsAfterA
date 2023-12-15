import java.util.*;

public class PracticeLab10Dice {
    public static void main(String[] args) {
        int sides, dice, times, result;
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        sides = getPositiveNumberfromUser("How many sides should the dice have? ", s);
        dice = getPositiveNumberfromUser("How many dice should I roll each time? ", s);
        times = getPositiveNumberfromUser("How many times should I roll? ", s);

        for(int i = 1; i <= times; i++) {
            result = rollDice(dice, sides, r);
            System.out.println("For roll " + i + ", rolled " + result);
        }

    }

    public static int rollDie(int sides, Random r) {
        return Math.abs(r.nextInt()) % sides + 1;
    }

    public static int rollDice(int count, int sides, Random r) {
        int sum = 0, d;
        for(int i = 0; i < count; i++) {
            d = rollDie(sides, r);
            System.out.println("\tRolled a " + d);
            sum += d;
        }
        return sum;
    }

    public static int getPositiveNumberfromUser(String message, Scanner s) {
        int result;
        do {
            System.out.print(message + " ");
            result = s.nextInt();
        } while(result < 1);
        return result;
    }
}
