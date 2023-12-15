import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        final int COLS = 4, ROWS = 3; // pop. 2D array
        int [][] data = new int[ROWS][COLS];
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLS; col++) {
                data[row][col] = row * COLS + col + 1;
            }
        }
        data[1][2] = 44;

        //now to print array
        for(int row = 0; row < ROWS; row++) {
            for(int col = 0; col < COLS; col++) {
                if(row * COLS + col < 9 && data[row][col] < 9) { // for the 44 in [1][2]
                    System.out.print("0");
                }
                System.out.print(data[row][col] + " ");
            }
            System.out.println();
        }

    }
}
