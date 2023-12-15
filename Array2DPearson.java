import java.util.*;

public class Array2DPearson {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {110,112,121,432,125}
        };

        int [][] tri = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3},
                {1}
        };
        printB(tri);

        int [][] a = new int[5][6]; // 5 rows, 6 columns
        //int [] x = {1,2}; // adds 1D array with array of numbers 1 and 2 at specified row
        //a[2] = x;
        System.out.println("a[0][1] is " + a[0][1]); // row 0, col 1
        print(a);

        int count = print(arr);
        System.out.println(count + " numbers counted");
        printB(arr);

        printReverse(arr);
        print(a);
        randArr(a);
        System.out.println();
        print(a);

        System.out.println();
        indice2DArray(a);
        print(a);

//        double avg = getAvg(a);
//        System.out.println(avg);
        System.out.println("Average of array a: " + getAvg(a));

        print(arr);
        System.out.println("Average of array a: " + getAvg(arr));

        printArray();


//        print(randArr(a)); // assigning random values to an array with set rows and columns
//        print(randArr(arr));

    }
    public static int print(int [][] arr) { // changed from void to return int amount of #'s counted
        int count = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < 10) { // if condition to make array match up
                    System.out.print("00");
                } else if (arr[row][col] < 100) {
                    System.out.print("0");
                }
                System.out.print(arr[row][col] + " ");
                count++; // unneeded to print array, but counts amount of numbers put through
            }
            System.out.println();
        }
//        System.out.println("Total of " + count + " numbers counted");
        return count;
    }

    public static void printB(int [][] arr) {
        int count = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] < 10) { // if condition to make array match up
                    System.out.print("0");
                }
                System.out.print(arr[row][col] + " ");
                count++; // unneeded to print array, but counts amount of numbers put through
            }
            System.out.println();
        }
        System.out.println("Total of " + count + " numbers counted");
    }

    public static int [][] randArr(int [][] arr) {
        Random r = new Random();
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = Math.abs(r.nextInt()) % 100 + 1; // inclusive, 1-100
            }
        }
        return arr;
    }

    public static int [][] indice2DArray(int [][] arr) {
        int value = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
//                value++;
                arr[row][col] = ++value;
//                arr[row][col] = row * arr[0].length + col + 1;
            }
        }
        return arr;
    }

    public static double getAvg(int [][] arr) {
        int sum = 0;
        int count = 0;
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
                count++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println(count + " numbers counted");
        return (double)sum/count;
    }

    public static void printReverse(int [][] arr) {
        for(int row = arr.length - 1; row >= 0; row--) {
            for(int col = arr[row].length - 1; col >= 0; col--) {
                if(arr[row][col] < 10) {
                    System.out.print("00");
                } else if(arr[row][col] < 100) {
                    System.out.print("0");
                }
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void printArray() {
        int size = 10;
        int [] arr = new int[10];
        for(int i = 0; i < size; i++) {
            arr[i] = (size - i) * 2;
            System.out.print(arr[i] + "\t");// second loop not needed, contrary to the final practice exam question
        }
    }
}
