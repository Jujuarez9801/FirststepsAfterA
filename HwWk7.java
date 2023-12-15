import java.util.Scanner;

public class HwWk7 {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int start, stop, count = 0;

        do {
            System.out.print("Enter a starting number (greater than 0): ");
            start = s.nextInt();
        } while(start <= 0);

        do {
            System.out.print("Enter a stopping number (greater than " + start + "): ");
            stop = s.nextInt();
        } while(stop <= start);

        for(int i = start; i <= stop; i++) {
//            count++;
            count = 0;
            System.out.print("Factors for " + i + ": ");
//            System.out.println(i + " has " + count + " factors");
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    System.out.print(j + " ");
                    count++;
                }
            }
//            System.out.println();
            System.out.println("\n" + i + " has " + count + " factors");
            System.out.println();
        } //for(int j = 1; j <= i;)
        System.out.println();


        // Part B //
      //  Scanner s = new Scanner(System.in);
        int max;
        do {
            System.out.print("What number should I count up to (1 or higher)? ");
            max = s.nextInt();
        } while(max < 1);
        int sum = 0, count1 = 0;

        for(int i = 0; i <= max; i++) {
            System.out.print("Should I add the number " + i + " to the sum? (y/n): ");
            String input = s.next();
            if(input.equals("y")) {
                sum += i;
                count1++;
            } else if(input.equals("n")) {

            } else {
                i--;
            }
        }
        System.out.println("You added " + count + " numbers for a sum of " + sum);
    }

}
