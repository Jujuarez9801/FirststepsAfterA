import java.util.Scanner;
// create printTriangle method, arguments taking in sides, position, and symbol

public class ExamQ11printTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter sides number: ");
        int side = s.nextInt();
        System.out.print("Enter position/direction: ");
        String position = s.next();
        System.out.print("Enter symbol: ");
        char symbol = s.next().charAt(0);

        System.out.println("The triangle is: ");
        printTriangle(side, position, symbol);

    }

    public static void printTriangle(int side, String position, char symbol) {
        if(position.equalsIgnoreCase("up")) {
            for(int i = 0; i < side; i++) {
                for(int k = 0; k <= i; k++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        } else {
            for(int i = 1; i <= side; i++) {
                for(int k = 1; k < i; k++) {
                    System.out.print("  ");
                }
                for(int k = i; k <= side; k++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            }
        }

    }
}
