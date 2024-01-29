/*
 * Title: Hw01a_Distinct.java
 * Abstract: Program reads from file given by user and displays data about distinct values in such files
 * Author: Justin Juarez
 * Email: jujuarez@csumb.edu
 * Estimate: 1 hour
 * Date: 01/26/24
 */
import java.io.*;
import java.util.Scanner;

public class HW01a_Distinct {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String filename = s.next();
        FileReader fr = new FileReader(filename);
        Scanner fr_in = new Scanner(fr);

        int total = fr_in.nextInt();
        int [] arr = new int[total];
        for(int i = 0; i < total; i++) {
            arr[i] = fr_in.nextInt();
        }
        int min = getMin(arr);
        System.out.println("The minimum number is " + min);
        printNumberandCount(arr);




    }

    public static int getMin(int [] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printNumberandCount(int [] arr) {
//        System.out.println("Number");
//        for(int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        boolean [] same = new boolean[arr.length];
        System.out.println("Number\tCount");
        for(int i = 0; i < arr.length; i++) {
           if(!same[i]) {
               int count = 1;
               for(int k = i + 1; k < arr.length; k++) {
                   if(arr[i] == arr[k]) {
                       count++;
                       same[k] = true;
                   }
               }
               System.out.println(arr[i] + "\t\t" + count);
           }
        }
    }
}
