import java.util.Scanner;

public class ExamPracticeDayBefore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a size: ");
        int size = s.nextInt();
        System.out.print("Enter a symbol to print: ");
        char symbol = s.next().charAt(0);

        printHollowSquare(size, symbol);
    }

    public static void printHollowSquare(int size, char symbol) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
                if(i == 0 || i == size - 1 || k == 0 || k == size - 1) {
                    System.out.print(symbol);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
