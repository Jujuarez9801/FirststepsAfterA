import java.util.Scanner;

public class MethodPearsonBook2 {

    public static void printHelloTimes(String message, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void nPrintln(String message, int n) {
        while(n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

    public static int bar (int x, int y, int z) {
//        int temp = x;
        x = y + z;
        y = x * z;
        z = z + 5; // 1 + 5
        return z; // only returns z value
    }

    public static void main(String[] args) {
        int x = 1, y = 2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        printHelloTimes("Hello", n);

        nPrintln("Print this " , 5);

//        x = bar(y,y,x);
        int m = bar(y,y,x);
        System.out.println(m);

    }
}
