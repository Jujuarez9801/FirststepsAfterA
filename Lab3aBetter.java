import java.util.Scanner;

class Lab3aBetter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter a floating point number: ");
        double num1 = s.nextDouble();
        System.out.print("Please enter another floating point number: ");
        double num2 = s.nextDouble();
        System.out.println("The smaller number is "
                + Math.min(num1, num2));

        if(num1 < num2){
            double temp = num1;
            num1 = num2;
            num2 = temp; // need to store num2 variable, as in this case num2 must always be the smallest #.
        }

        System.out.println("num1: " + num1 + ", " + "num2: " + num2);

        System.out.println("The cube of "
                + num1 + " is " + Math.pow(num1, 3));
        System.out.println("The cube of "
                + num2 + " is " + Math.pow(num2, 3));
        double res = Math.pow(num1, num2);
        if(res > 10000000)
            System.out.println(num1 + " ^ "
                    + num2 + " is more than ten million");
        else
            System.out.println(num1 + " ^ "
                    + num2 + " is " + Math.pow(num1, num2));
    }
}