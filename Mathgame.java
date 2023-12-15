import java.util.Scanner;
// Date: 09/15/23

public class Mathgame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter number a: ");
        int a = scan.nextInt();
        System.out.print("Please enter number b: ");
        int b = scan.nextInt();
        System.out.print("Please enter number c: ");
        int c = scan.nextInt();

        int a1 = a - b;
        int b1 = b - a;

        if(a == 0 || b == 0) {
            System.out.println("cannot use zero");
            return;
        } if((a + b) == c) {
            System.out.println(a + " + " + b + " equals " + c);
        } if((a + b) != c) {
            System.out.println(a + " + " + b + " does not equal " + c + ", it equals " + (a+b));
        } if(a1 == c) {
            System.out.println(a + " - " + b + " equals " + c);
        } if(b1 == c) {
            System.out.println(b + " - " + a + " equals " + c);
        } if(a1 != c) {
            System.out.println(a + " - " + b + " does not equal " + c + ", it equals " + (a - b));
        } if(b1 != c) {
            System.out.println(b + " - " + a + " does not equal " + c + ", it equals " + (b - a));
        } if((a * b) == c) {
            System.out.println(a + " * " + b + " equals " + c);
        } if((a * b) != c) {
            System.out.println(a + " * " + b + " does not equal " + c + ", it equals " + (a * b));
        } if((a / b) == c) {
            System.out.println(a + " / " + b + " equals " + c);
        } if((a / b) != c) {
            System.out.println(a + " / " + b + " does not equal " + c + ", it equals " + (a / b) + " with a remainder of " + (a % b));
        } if((b / a) != c) {
            System.out.println(b + " / " + a + " does not equal " + c + ", it equals " + (b / a) + " with a remainder of " + (b % a));
        }
        //if ((a - b) == c || (b - a) == c) {
           // System.out.println("")
        }

}
