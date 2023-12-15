import java.util.Scanner;
import java.lang.Float;

public class Boring {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        Scanner scan = new Scanner(System.in);
        double first = scan.nextDouble();

        System.out.print("Enter the second number: ");
        double second = scan.nextDouble();
//        System.out.println("The bigger number is " + Math.max(first, second));

        if(first > second) {
            System.out.println("The first number, " + first + " is bigger than the second number, " + second);
        } else if(first < second) {
            System.out.println("The second number, " + second + " is bigger than the first number, " + first);
        } else {
            System.out.println("The two numbers are equal");
        }


//            boolean correct = (num1 >= num2);
//            boolean wrong = num1 < num2;
//            System.out.println("Is " + num1 + " the bigger number? " + correct);
//            System.out.println("is " + num2 + " the bigger number? " + wrong);

//        boolean correct = num1 >= num2;
//        boolean wrong = num1 < num2;
//        System.out.println("Is " + num1 + " the bigger number? " + correct);
//        System.out.println("Is " + num2 + " the bigger number? " + wrong);

//        } else{
//            boolean wrong = (num1 < num2);
//            System.out.println("is " + num1 + " the bigger number? " + wrong);
//        }
    }
}
