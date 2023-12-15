import java.util.Scanner;

public class MathReminder {
    public static void main(String[] args) {

        /////     Sum and mean     /////
        Scanner s = new Scanner(System.in);

        int input = 1, count = 0;
        double sum = 0;
        while(input != 0) {
            System.out.print("Enter a number (0 to quit): ");
            input = s.nextInt();
            sum += input;
            count++;
            if(input == 0) {  // So 0 isn't included in count
                count--;
            }
        }
        System.out.println("You entered " + (count) + " numbers, not counting the 0");
        System.out.println("The sum was " + sum);
        System.out.println("The mean was " + (double)sum/count);
//        System.out.println(2/5 * 1.0);



        /////    Product and such     /////
//        Scanner s = new Scanner(System.in);
//        int prod = 1;
//        int num = 1;
//        int count = 0;
//        int sum = 0;
//        while(count < 5 && num != 0) {
//            prod *= num;
//            System.out.print("Please enter a #, 0 to stop: ");
//            num = s.nextInt();
//            sum += num; //has to be here, otherwise sum is off
//            count++;
//            if(num == 0) {
//                count--;
//            }
//        }
//        double mean = (double)sum/count;
//        System.out.println("You entered " + (count) + " times, for a total product of " + prod + " and a mean of " + mean);
//        System.out.println("also sum is " + sum);

















             /////     Both Product and Sum     /////


//        Scanner s = new Scanner(System.in);
//        int input = 1, count = 0, prod = 1;
//        double sum = 0;
//        while(input != 0) {
//            prod*=input;
//            System.out.print("Enter a number (0 to quit): ");
//            input = s.nextInt();
//            sum+=input;
//            count++;
//            if(input == 0) {
//                count--;
//            }
//        }
//        System.out.println("You entered " + count + " numbers");
//        System.out.println("The total sum was " + sum);
//        System.out.println("The total product was " + prod);
//        System.out.println("The mean was " + (double)sum/count);
    }
}