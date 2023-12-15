import java.util.Scanner;

public class HwWk6 {
    public static void main(String[] args) {
        ///// Two numbers calculator /////
//        Scanner s = new Scanner(System.in);
//        int num1, num2, input;
//        String answer = "";
//        do {
//            System.out.print("Enter first number: ");
//            num1 = s.nextInt();
//            System.out.print("Enter second number: ");
//            num2 = s.nextInt();
//            System.out.print("Enter 1 for add\n" + "Enter 2 for subtract\n" + "Enter 3 for multiply\n"
//                    + "Enter 4 for divide\n" + "Enter 5 for remainder\n");
//            input = s.nextInt();
//
////            System.out.print("Do you want to do another operation? (yes/no): ");
////            answer = s.next();
//
//
//            if(input == 1) {
//                System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
//                System.out.print("Do you want to do another operation? (yes/no): ");
//                answer = s.next();
//            } else if(input == 2) {
//                System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
//                System.out.print("Do you want to do another operation? (yes/no): ");
//                answer = s.next();
//            } else if(input == 3) {
//                System.out.println("The product of " + num1 + " and " + num2 + " is " + (num1 * num2));
//                System.out.print("Do you want to do another operation? (yes/no): ");
//                answer = s.next();
//            } else if(input == 4) {
//                System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
//                System.out.print("Do you want to do another operation? (yes/no): ");
//                answer = s.next();
//            } else if(input == 5) {
//                System.out.println("The remainder of " + num1 + " and " + num2 + " is " + (num1 % num2));
//                System.out.print("Do you want to do another operation? (yes/no): ");
//                answer = s.next();
//            }
//        } while (answer.equals("yes"));
//        System.out.println("Goodbye!");

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the number of students in the class: ");
//        int stud = s.nextInt();
//        int math, physics, chemistry, biology, english;
//        for(int i = 1; i <= stud; i++) {
//            System.out.print("\nStudent " + i + ":");
//            System.out.print("Enter grade for Math: ");
//            math = s.nextInt();
//
//            System.out.print("Enter grade for Physics: ");
//            physics = s.nextInt();
//
//            System.out.print("Enter grade for Chemistry: ");
//            chemistry = s.nextInt();
//
//            System.out.print("Enter grade for Biology: ");
//            biology = s.nextInt();
//
//            System.out.print("Enter grade for English: ");
//            english = s.nextInt();
//
//            System.out.println("Your percentage is: " + (double))


        Scanner in = new Scanner(System.in);
        System.out.print("How many students are in the class? ");
        int stud = in.nextInt();
        int classCount = 5;
        int studentCount, studentSum, classSum, math, physics, chemistry, biology, english = 0;
        double studentPercent, classPercent, totalPercentage = 0;
        for(int i = 1; i <= stud; i++) {
            System.out.print("Enter grades for student " + i);
            System.out.print("\nEnter grade for Math: ");
            math = in.nextInt();

            System.out.print("Enter grade for Physics: ");
            physics = in.nextInt();

            System.out.print("Enter grade for Chemistry: ");
            chemistry = in.nextInt();

            System.out.print("Enter grade for Biology: ");
            biology = in.nextInt();

            System.out.print("Enter grade for English: ");
            english = in.nextInt();
            classSum = (math+physics+chemistry+biology+english);
            classPercent = Math.round((double)classSum/classCount);

            System.out.println("Your percentage is: " + Math.round((double)classSum/classCount) + "%");

            if(classPercent >= 90) {
                System.out.println("Your grade is A.");
            } else if(classPercent >= 80) {
                System.out.println("Your grade is B.");
            } else if(classPercent >= 70) {
                System.out.println("Your grade is C.");
            } else if(classPercent >= 60) {
                System.out.println("Your grade is D.");
            } else {
                System.out.println("Your grade is F.");
            }
            totalPercentage += classPercent;
           studentPercent = (math+physics+chemistry+biology+english) * (stud);

        }
        int percentageAvg = (int)Math.round(totalPercentage / stud); // sum/count basically
        System.out.println("\nClass average percentage: " + percentageAvg);

        System.out.println("Grading complete!");
        in.close();
    }
}
