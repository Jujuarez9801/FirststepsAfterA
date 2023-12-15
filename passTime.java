import java.util.Scanner;

public class passTime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sumM = 0, countM = 0;
//        while(input >= 0) {
//            System.out.print("Enter a number (or negative to stop): ");
//            input = s.nextInt();
//            if(input <= 0) {
//                break;
//            }
//            sum += input;
//            count++;
//        }
        sumMean(sumM, countM, s);
    }


    public static void sumMean(int sum, int count, Scanner s) {
        int input = 0;
        while(input >= 0) {
            System.out.print("Enter a number (or negative to stop): ");
            input = s.nextInt();
            if(input <= 0) {
                break;
            }
            sum += input;
            count++;
        }
        System.out.print("The sum of numbers is " + sum + "\nThe avg of the numbers is " + (double)sum/count);
    }
}
