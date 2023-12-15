import java.util.*;

public class HWWk12Matrix {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][] d = load(s);
        int [][] e = load(s);
        int [][] result;

        String operation, printType;
        do {
            System.out.print("Select operation (a for add, m for multiply, p for print): ");
            operation = s.next();
        } while(! (operation.equals("a") || operation.equals("m") || operation.equals("p")));

        if(operation.equals("p")) {
            print(d);
            print(e);
            return;
        }

         do {
             System.out.print("Select print type (r for result, p for pretty-print): ");
             printType = s.next();
         } while(! (printType.equals("r") || printType.equals("p")));

         if(operation.equals("a")) {
             result = add(d, e);

         } else {
             result = multiply(d, e); //
         }

         if(printType.equals("r")) {
             print(result);
         } else {
             if(operation.equals("a")) {
                 prettyPrint("+", d, e, result);
             } else {
                 prettyPrint("*", d, e, result);
             }
         }
    }
    public static int [][] load(Scanner s) {
        int [][] mat = new int[SIZE][SIZE];
        System.out.print("Enter 9 ints for the matrix: ");
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                // System.out.print("Enter 9 ints for the matrix: ");
                mat[row][col] = s.nextInt();
            }
        }
        return mat;
    }

    public static void print(int [][] arr) {
        System.out.println();
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int [][] add(int[][] arr1, int[][] arr2) {
        int [][] sum = new int[SIZE][SIZE];
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                sum[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        return sum;
    }

    public static int [][] multiply(int[][] arr1, int[][] arr2) {
        int [][] product = new int[SIZE][SIZE];
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                product[row][col] = arr1[row][0] * arr2[0][col] + arr1[row][1] * arr2[1][col] + arr1[row][2] * arr2[2][col];
            }
        }
        return product;
    }

    public static void prettyPrint(String op, int[][] arr1, int[][] arr2, int[][] result) {
        System.out.println();
        for(int row = 0; row < SIZE; row++) {
            for(int col = 0; col < SIZE; col++) {
                System.out.print(arr1[row][col] + " ");
            }
//            System.out.print(" ");
            if(row == SIZE / 2) {
                System.out.print(op + " ");
            } else {
                System.out.print("  ");
            }

            for(int col = 0; col < SIZE; col++) {
                System.out.print(arr2[row][col] + " ");
            }
//            System.out.print(" ");

            if(row == SIZE / 2) {
                System.out.print("= ");
            } else {
                System.out.print("  ");
            }
            for(int col = 0; col < SIZE; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}
