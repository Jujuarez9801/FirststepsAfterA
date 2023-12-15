import java.util.Scanner;
import java.util.Random;

/*Title: CST231-Lab3B
Names: Jamie Len
Email: jlen@csumb.edu
       jujuarez@csumb.edu
Date: 09/08/23
Abstract: This program involves swapping the values of two variables, using mathematical methods, and generating random numbers within a specified range. */


class Lab3aReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a floating point number: ");
        double num1;
        num1 = scan.nextDouble();
        System.out.println("Enter another floating point number: ");
        double num2;
        num2 = scan.nextDouble();

        if(num1 < num2){
            System.out.print(num1 + " is the smallest of the two");
            double dnum1 = num1;
            num1 = num2;
            num2 = dnum1;
        } else {
            System.out.println("num1: " + num1 + " num2: " + num2);
        }

        double cube1 = Math.pow(num1, 3);
        System.out.println("The cube of " + num1 + " is " + cube1);
        double cube2 = Math.pow(num2, 3);
        System.out.println("The cube of " +  num2 + " is " + cube2);
        double num = Math.pow(num1, num2);
        if(num > 10000000){
            System.out.println(num1 + "^" + num2 + "=" + "more than 10 million");
        } else {
            System.out.println(num1 + "^" + num2 + "=" + num);
        }
        System.out.println("Please enter a minimum value: ");
        int min;
        min = scan.nextInt();
        System.out.println("Please enter the size of the range: ");
        int range;
        range = scan.nextInt();
        int size =  min + range - 1;
        System.out.println(size);
        System.out.println("Min: " + min + " Max: " + size);
        Random rand = new Random();
        int random = rand.nextInt() % min + range + 1;
        System.out.println("The number is " + random);

    }
}



