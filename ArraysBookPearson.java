import java.util.Scanner;
import java.util.Random;

// method void print - for(int i = 0; i < a.length && i < count; i++) {
//
// }
// can send array as an argument to a method
// in main: whle(f_in.hasNext)

public class ArraysBookPearson {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        double [] myList = new double[10]; // myList[0] - myList[9]
//        myList[0] = 2.21;
//        myList[1] = 5.75;

        // more efficient way:
        double [] myList = {1.1,2.2,3.33,4.1,5,6,7,8,9,10};


        //   myList is a variable that contains a reference to an array of double elements
        //     = myList is an array
        // Array indices are 0 based; that is, they range from 0 to myList.length - 1.
        // holds 10 double values, and the indices are from 0 to 9.


        for(int i = 0; i < myList.length; i++) {
            myList[i] = i; // assigns current i variable to that place in myList
        }

        System.out.print("Enter size for array: ");
        int size = s.nextInt();

        double [] myArray = new double[size];
        for(int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number for array: ");
            myArray[i] = s.nextDouble();
        }

        for(int i = 0; i < myArray.length; i++) { // print each array
            System.out.println(myArray[i]);
        }
        System.out.println();

        for(int i = myArray.length - 1; i >= 0; i--) { // reverse order print array
            System.out.println(myArray[i]);
        }

        char [] city = {'D','a','l','l','a','s'};
        System.out.println(city); // Dallas

        double max = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("The largest number of this array is " + max);


        // shifting elements of an array around
        for(int i = 0; i < myArray.length - 1; i++) {
            int j = (int)(Math.random() * myArray.length); // generate random indexes for j

            // swap myArray[i] with myArray[j]
            double temp = myArray[i];
            myArray[i] = myArray[j];
            myArray[j] = temp;

        }
        double temp = myArray[0];
        for(int i = 1; i < myArray.length; i++) { // shift elements left
            myArray[i - 1] = myArray[i];
        }
        myArray[myArray.length - 1] = temp; // move the first element to fill in the last position
    }
}
