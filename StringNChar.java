import java.util.*;


public class StringNChar {
    public static final int ROWS = 4;
    public static final int COLS = 3;
    public static void main(String[] args) {
        char [][] g = new char[ROWS][COLS];


    }

    public static void print (char [][] g) {
        for(int row = 0; row < g.length; row++) {
            for(int col = 0; col < g[row].length; col++) {
                System.out.print(g[row][col]);
            }
            System.out.println();
        }
    }

//    public static char [][] popArray(char [][] arr) {
//
//    }
}
