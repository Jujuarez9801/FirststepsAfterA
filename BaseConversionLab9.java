import java.util.Scanner;

// can use nested loop here (most efficient)

public class BaseConversionLab9 {
    public static void main(String[] args) {
        int base = 2, power = 0, result;
        Scanner s = new Scanner(System.in);

        do {
            System.out.print("Enter highest power of 2 to add numbers to (must be above 0): ");
            power = s.nextInt();
        } while(power <= 0);

        for(int i = 0; i <= power; i++) {
            result = 1;
            for(int k = 0; k < i; k++) {
                result *= base;
            }
            System.out.println("2^" + i + " = " + result);
        }

    }
}
