import java.util.*;

public class Array2DPearson2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int [][] arr = new int[3][5];
        print(popArray(arr, r));
//        print(arr);
//        inputArray(arr, s);
//        print(arr);
        sumColumn(arr);
//        sumRow(arr);
//        int sum = sumAll(arr);
//        System.out.println("The sum of all numbers is " + sum);
        System.out.println("The sum of other set array is " + sumAll(arr));
        prodColumn(arr);

        int [][] unevenArray = {
                {1,2,3},
                {1,2},
                {1,2,3,4}
        };
        print(unevenArray);
        sumColumn(unevenArray);
        prodColumn(unevenArray);
        sumRow(unevenArray);
        prodRow(unevenArray);
        System.out.println("Sum of all numbers for this array: " + sumAll(unevenArray));
//        prodRow(arr);
//
//        someArray();
//        someArrayB();
    }

    public static int [][] popArray(int [][] arr, Random r) { // to populate randomly
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Math.abs(r.nextInt()) % 20 + 1;
            }
        }
        return arr;
    }

    public static void print(int [][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print("[" + row + "]" + "[" + col + "]: ");
                if(arr[row][col] < 10) {
                    System.out.print("0");
                }
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int sumAll(int [][] arr) { // this works well
        int sum = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
        }
        return sum;
    }

    public static void sumColumn(int [][] arr) {
        int maxColumns = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length > maxColumns) {
                maxColumns = arr[i].length;
            }
        }
        for(int col = 0; col < maxColumns; col++) {
            int total = 0;
            for(int row = 0; row < arr.length; row++) {
                if(col < arr[row].length) {
                    total += arr[row][col];
                }
//                total += arr[row][col];
//                System.out.println("Sum for column " + col + " is " + total);
            }
            System.out.println("Sum for column " + col + " is " + total);
        }
    }

    public static void sumRow(int [][] arr) {
        for(int row = 0; row < arr.length; row++) {
            int total = 0;
            for(int col = 0; col < arr[row].length; col++) {
                total += arr[row][col];
            }
            System.out.println("Sum for row " + row + " is " + total);
        }
    }

    public static void prodColumn(int [][] arr) {
        int maxColumns = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length > maxColumns) {
                maxColumns = arr[i].length;
            }
        }

        for(int col = 0; col < maxColumns; col++) { // good enough code(?) col < arr[0].length;
            int prod = 1;                           // this overall method code takes into account the..
                                                    // ..possibility of rows with differing lengths
            for(int row = 0; row < arr.length; row++) {
                if(col < arr[row].length) {
                    prod *= arr[row][col];
                }
//                prod *= arr[row][col];
            }
            System.out.println("Product for column " + (col + 1) + " is " + prod); // col or col + 1
        }
    }

    public static void prodRow(int [][] arr) {
        for(int row = 0; row < arr.length; row++) {
            int prod = 1;
            for(int col = 0; col < arr[row].length; col++) {
                prod *= arr[row][col];
            }
            System.out.println("Product for row " + (row + 1) + " is " + prod);
        }
    }

    public static int [][] inputArray(int [][] arr, Scanner s) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter number for array: ");
                arr[row][col] = s.nextInt();
            }
        }
        return arr;
    }

    public static void someArray () {
        int [][] array = {{1,2}, {3,4}, {5,6}};
        for(int i = array.length - 1; i >= 0; i--) {
            for(int j = array[i].length - 1; j >= 0; j--) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void someArrayB() {
        int [][] array = {{1,2}, {3,4}, {5,6}}; // note; [row][col]
        int sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i][0]; // to get sum of numbers in column 0
        }
        System.out.println(sum);
    }

}
