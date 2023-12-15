import java.util.Scanner;
// sum of numbers between two numbers using method

/*
Methods enable code sharing and reuse. The max method can be invoked from any class, not just TestMax.
If you create a new class, you can invoke the max method using ClassName.methodName (i.e., TestMax.max).
*/
public class MethodPearsonBook {
    public static int sumMethod(int num1, int num2) { // This can also be done in 3 seperate for loops..
                                                  // ..so methods can be much more efficient at times
        int sum = 0;
        for(int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static double methodFormat(double i, double j) { // not invoked so far
        while(i < j) {
            j--;
        }
        return j;
    }

    public static int getMax(int num1, int num2) {
        int result = 0;
        if(num1 > num2) {
            result = num1;
        } else if(num2 > num1) {
            result = num2;
        }
        return result;
    }

    public static int signHere(int n) {
        if(n > 0) {
            return 1;
        } else if(n == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void decimalToBinary () {
        Scanner s = new Scanner(System.in);
        int binaryResult = 0, addValue = 1, remainder = 0, decimal = 0;

        System.out.println("Enter decimal number to convert: ");
        decimal = s.nextInt();
        while(decimal > 0) {
            remainder = decimal % 2;
            binaryResult += remainder * addValue;
            decimal /= 2;

            addValue *= 10;
        }
        System.out.println(binaryResult);
//        return binaryResult;
    }



    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = 0, num2 = 0;


//        int decimal = 0;
//        System.out.println("Enter decimal number to convert into binary: ");
//        decimal = s.nextInt();

//        System.out.println("Decimal converted into binary is " + decimalToBinary);
        decimalToBinary();
//        System.out.println("Decimal converted into binary is " + decimalToBinary(3));


        int i = 2;
        int j = 5;
        int k = getMax(i,j);
        System.out.println("The max of " + i + " and " + j + " is " + k);

        System.out.println("The sum of numbers between 1 to 10 is " + sumMethod(1,10));
        System.out.println("The sum of numbers between 20 and 37 is " + sumMethod(20,37));

        System.out.print("Enter first number to calculate numbers between two numbers: ");
        num1 = s.nextInt();
        System.out.print("Enter ending number: ");
        num2 = s.nextInt();
        System.out.println("Sum of two chosen numbers is " + sumMethod(num1, num2));

        System.out.println("Method sign: " + signHere(i));
        System.out.println("i is still " + i);

        System.out.println("The bigger of 10 and 88 is " + getMax(10,88));
    }
}
