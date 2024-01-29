/*
 * Title: HW01b_Histograms.java
 * Abstract: Program reads from file given by user and prints out a histogram of stars corresponding to each
 *           number associated to said number
 * Author: Justin Juarez
 * Email: jujuarez@csumb.edu
 * Estimate: 30 minutes for first part of program, 20 minutes to add new part
 * Date: 01/26/24
 */
// hw01b-1.txt

import java.util.Scanner;
import java.io.*;

public class HW01b_Histograms {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String filename = s.next();

        horizontalHistogram(filename);
        System.out.println();
        verticalHistogram(filename);
    }
    public static void horizontalHistogram(String filename) throws IOException {
        System.out.println("==== Horizontal Histogram ====");

        FileReader fr = new FileReader(filename);
        Scanner fr_in = new Scanner(fr);

        int total = fr_in.nextInt();
        int [] arr = new int[total];
        for(int i = 0; i < arr.length && fr_in.hasNextInt(); i++) {
            int num = fr_in.nextInt();
            arr[i] = num;
            System.out.print(arr[i] + ": ");
            for(int k = 0; k < num; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void verticalHistogram(String filename) throws IOException {
        System.out.println("==== Vertical Histogram ====");
        FileReader fr = new FileReader(filename);
        Scanner fr_in = new Scanner(fr);

        int total = fr_in.nextInt();
        int[] arr = new int[total];
        int height = 0;

        for (int i = 0; i < total && fr_in.hasNextInt(); i++) { // to find the max height in this set
            int num = fr_in.nextInt();
            arr[i] = num;
            if (num > height) {
                height = num;
            }
        }

        for (int i = height; i > 0; i--) {
            for (int k = 0; k < total; k++) {
                if (arr[k] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i = 0; i < total * 2; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i = 0; i < total; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        fr.close();
    }
}
