import java.util.Scanner;
/*
Create and invoke methods
*/

public class CallingMethodsSumRange {

    public static int sumRange(int start, int stop) {
        int sum = 0;
        for(int i = start; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int start, stop;
        System.out.print("Enter the starting number: ");
        start = s.nextInt();
        do {
            System.out.print("Enter a stopping number above " + start + ": ");
            stop = s.nextInt();
        } while(stop <= start);
        int range = sumRange(start, stop);
        System.out.println("The sum of numbers between " + start + " and " + stop + " is " + range);
    }
}
