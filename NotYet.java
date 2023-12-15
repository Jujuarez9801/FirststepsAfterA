import java.util.*;

public class NotYet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start, stop;

        System.out.print("Enter starting number: ");
        start = s.nextInt();

        do {
            System.out.print("Enter stopping number above " + start + ": ");
            stop = s.nextInt();
        } while(stop <= start);

        System.out.println("The sum of numbers between " + start + " and " + stop + " is " + sumRange(start, stop));

    }

    public static int sumRange(int start, int stop) {
        int sum = 0;
        for(int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

