import java.util.Scanner;
// print triangle methods

public class ShapesRevisit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a row number: ");
        int rows = s.nextInt();
        System.out.print("Enter a column number: ");
        int cols = s.nextInt();
        printSquare(rows, cols);
//        printTriangle(size);
//        printFlippedTriangle(size);
//        printOtherFlippedTriangle(size);
//        printParallelogram(size);

    }
    public static void printSquare(int rows, int cols) {
        for(int i = 0; i < rows; i++) {
            for(int k = 0; k < cols; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(); // to separate shapes
    }
    public static void printTriangle(int size) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printFlippedTriangle(int size) {
        for(int i = 0; i < size; i++) {
            for(int k = size; k > i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printOtherFlippedTriangle(int size) {
        for(int i = 1; i <= size; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for(int k = i; k <= size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printParallelogram(int size) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= size; i++) {
            for(int k = 1; k < i; k++) {
                System.out.print("  ");
            }
            for(int k = i; k <= size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
