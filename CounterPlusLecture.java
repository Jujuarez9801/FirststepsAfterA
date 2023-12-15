import java.util.Scanner;

public class CounterPlusLecture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int maxEntries = 5; // amount of numbers about to be entered
//        int maxValue = 100; // point in which the program will stop/conclude reaching this sum amount
//        int count = 0; // number of times inputted
//        int input = 0; // user entered
//        int sum = 0;
//        while(count < maxEntries && sum < maxValue) { // either stops when five #'s are entered or sum >= 100
//            System.out.print("Enter a number: ");
//            input = s.nextInt();
//            sum += input; // also sum = sum + input
//            count++;
//        }
//        System.out.println("Sum: " + sum);
//        double mean = (double)sum/count;
//        System.out.println("The mean of the " + count + " numbers is " + mean);
//
//        System.out.print("Enter a number, 0 to stop!: ");
//        //int num = s.nextInt();
//        int num = 1; // for multiplication, "num = s.nextInt();" will be in loop to ask user
//        int prod = 1; // has to be 1 to multiply correctly, same with num
//        while(num != 0) {
//            prod *= num;
//            System.out.print("Enter some numbers; 0 to stop: ");
//            num = s.nextInt();
//        }
//        System.out.println("Product: " + prod);


//        Scanner s = new Scanner(System.in);
        int num = 1;
        int prod = 1;
        int count = 0;
        while(num != 0){
            prod *= num;
            System.out.print("Enter a number; 0 to stop: ");
            num = s.nextInt();
            count++;
        }
        System.out.print("You entered " + (count-1) + " numbers, " + "with a product of " + prod);
    }
}









//
//         System.out.print("Enter a number, 0 to stop!: ");
////         int num = s.nextInt();
//         int num = 1;
//         int prod = 1;
//         while(num != 0){
//           prod *= num;
//           System.out.print("Enter a number, 0 to stop!: ");
//           num = s.nextInt();
//            if(num != 0){
//              prod *= num;
//            }
//         }
//         System.out.println("prod: " + prod);
//    }
//}
