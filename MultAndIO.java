import java.util.Scanner;

public class MultAndIO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter the length of a line (whole numbers): ");
        int side;
        side = s.nextInt();
        System.out.println("The length is " + side);
        System.out.println("With sides of " + side + "," + " a square would have the area of " + side*side);
        System.out.println("With sides of " + side + "," + " a cube would have the volume of " + side*side*side);


        //sum of two variables
        System.out.print("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int x = num1 + num2;
        System.out.println("Sum is " + x);


    }
}
