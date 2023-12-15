import java.util.Scanner;

public class Exam2After {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter rows num: ");
        int rows = s.nextInt();
        System.out.print("Enter cols num: ");
        int cols = s.nextInt();


        for(int i = 0; i <= rows; i++) {
            for(int k = 0; k < cols; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
