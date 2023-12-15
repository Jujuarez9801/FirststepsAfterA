import java.util.Scanner;
// Date: 09/15/23

public class NumberOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int num1 = scan.nextInt();
        System.out.print("Please enter the second number: ");
        int num2 = scan.nextInt();
        System.out.print("Please enter the third number: ");
        int num3 = scan.nextInt();
        if((num1 == num2) && (num1 == num3) && (num2 == num3)) {
            System.out.println("The numbers are the same");
        } else if((num1 < num2) && (num2 < num3)) {
            System.out.println("The numbers are in ascending order");
        } else if((num1 > num2) && (num2 > num3)) {
            System.out.println("The numbers are in descending order");
        } else {
            System.out.println("I don't see a pattern here");
        }

        // System.out.print(num1 + " " + num2 + " " + num3);
    }
}
