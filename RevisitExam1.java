import java.util.Scanner;

// Golden birthday matches day of the month you were born
// Next program: Enter numbers til 0 is entered
// Next last for this: count evens and odds
// Completed!

public class RevisitExam1 {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int max = 5;
//        int numInput = 0;
//        int countEven = 0, countOdd = 0;
//        for(int i = 0; i < max; i++) {
//            System.out.print("Enter a number: ");
//            numInput = s.nextInt();
//            if(numInput % 2 == 0) { // 0 is an even as well
//                countEven++;
//            } else {
//                countOdd++;
//            }
//        }
//        System.out.println("Count of evens: " + countEven);
//        System.out.println("Count of odds: " + countOdd);



//        int posCount = 0, posSum = 0, negCount = 0, negSum = 0, input;
//        Scanner s = new Scanner(System.in);
//        while(true) {
//            System.out.print("Enter a number: ");
//            input = s.nextInt();
//            if(input == 0) {
//                break;  // exits loop
//            }
//            if(input < 0) {
//                negSum += input;
//                negCount++;
//            } else if(input > 0) {
//                posSum += input;
//                posCount++;
//            }
//        }
//        System.out.println(posCount + " pos values sum " + posSum + ", avg = " + (double)posSum/posCount);
//        System.out.println(negCount + " neg values sum " + negSum + ", avg = " + (double)negSum/negCount);




        Scanner s = new Scanner(System.in);
        int age = 0;
        int day = 0;
        while(day < 1 || day > 31) {
            System.out.print("Day of the month you were born: ");
            day = s.nextInt();
            if(day < 1) {
                System.out.println("Day too low");
                continue;
            } else if(day > 31) {
                System.out.println("Day too high");
                continue;
            }
            System.out.print("Enter your current age: ");
            age = s.nextInt();
        }
        if(day == age) {
            System.out.println("Golden Birthday Year!");
        } else {
            System.out.println("Not Golden Birthday year");
        }

    }
}
