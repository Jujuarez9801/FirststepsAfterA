import java.util.Scanner;
class Lab2aReplit {
  /* Name of file: CST231-Lab2A
  Name and email: Gabriel Gutierrez Cardenas:ggutierrezcardenas@csumb.edu
  Name and email: jujuarez@csumb.edu
   Date started: 09-01-2023
  Description: This code calculates the absolute of a number, the square, the ceiling, the floor, the rounding of the number, and the square root. In addition this code also checks if the square of the square root is the same as the original number. It also checks if the ceiling is the same as the floor.
  */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        double number = s.nextDouble(); // user inputs number
        System.out.println("The absolute value of " + number + " is "
                + Math.abs(number));
        System.out.println("The square number of " + number + " is "
                + number*number);
        System.out.println("The ceiling of " + number + " is "
                + Math.ceil(number));
        System.out.println("The floor of " + number + " is "
                + Math.floor(number));
        System.out.println("The rounding of " + number + " is "
                + Math.round(number));
        double root = Math.sqrt(number);
        double square = (root*root);
        System.out.println(root);
        System.out.println(square);
        boolean same = (number == square);
        System.out.println(number + " is the same as " + square + "? " + same);
        double up = Math.ceil(number);
        double down = Math.floor(number);
        boolean diff = (up != down);
        System.out.println("The floor of " + number + " is " + down + " and the ceil is "  + up + ". Are they different? " + diff);
        //If the ceiling and the floor are the same then the number is a whole number.
    }
}