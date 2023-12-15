import java.util.Scanner;

public class HwWk10MethodsB {

    public static int getSize(Scanner s) {
        int size;
        do {
            System.out.print("Enter size above 1: ");
            size = s.nextInt();
        } while(size <= 1);
        return size;
    }

    public static void square(int size) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int size) {
        for(int i = 0; i < size; i++) {
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void flippedTriangle(int size) {
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

    public static void parallelogram(int size) {
        for(int i = 1; i <= size; i++) {
//            System.out.print("* ");
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= size; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print("  ");
            }
            for(int k = i; k <= size; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = getSize(in);
        System.out.println("Rectangle:");
        square(size);
        System.out.println();
         System.out.println("Triangle:");
         triangle(size);
         System.out.println();
         System.out.println("Flipped Triangle:");
         flippedTriangle(size);
         System.out.println();
         System.out.println("Parallelogram");
         parallelogram(size);
    }
}
