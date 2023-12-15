import java.util.Scanner;
// Some code from book, some from lecture

public class Arrays {

    public static void timesTwo(int [] a) {
        for(int i = 0; i < a.length; i++) {
            a[i] = a[i] * 2;
        }
    }

    public static int [] mCopy(int [] a) { // returning arrays
        int [] b = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    public static int sum(int [] a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
//        int [] a = new int[8];
//        int [] b = {1, 2, 3, 4, 5, 9};
//        System.out.println(b[3]);
//        System.out.println("Length of b array is " + b.length); // length is not a method
//        for(int i = 0; i < b.length; i++) { // or i < however many there is
//            System.out.println(b[i]);
//        }
        // Method 1: Copy arrays
        int [] q = {1,2,3};
        int [] qCopy = mCopy(q);
        q[1] = 5;
        qCopy[1] = 10;
        System.out.println("q: " + q[1] + "\nqCopy: " + qCopy[1]);
        System.out.println("The sum of the original array(q) is " + sum(q));

        System.out.println();


        // Method 2: Returning different arrays
        int [] a2 = {3,6,9,12,15};
        int [] a2Copy = a2.clone(); // copy specified array
        System.out.println(a2[4]); // prints 15
        System.out.println("Sum of the array is " + sum(a2)); // 45
        timesTwo(a2);
        System.out.println(a2[4]); // now prints 30, every number in array is *2 now

        // Method 3: Sum of array
        System.out.println("Sum of the array is " + sum(a2)); // now 90, as array is changed



        Scanner s = new Scanner(System.in);
        System.out.print("Enter an array size: ");
        int size = s.nextInt();
        int [] a = new int[size];
        double [] u = new double[size];
        for(int i = 0; i < size; i++) { // can also do i < u.length
            System.out.print("Enter array contents: ");
            u[i] = s.nextDouble();
            System.out.println(u[i]);
        }
        System.out.println("Arrays:");
        for(int i = 0; i < u.length; i++) { // original order
            System.out.println(u[i]);
        }
        System.out.println();
        for(int i = u.length - 1; i >= 0; i--) { // reverse
            System.out.println(u[i]);
        }


    }
}
