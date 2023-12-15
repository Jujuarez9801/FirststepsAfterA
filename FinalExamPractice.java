public class FinalExamPractice {
    public static void main(String[] args) {
        int [] arr = new int[15];
        int [] b = new int[10];
        printArray(arr);
        popArray(arr);
       // printArray((b)); // same thing as printArray(b) in this case
        printArray(b);

        int x = 1;
        x = c(x);
        System.out.println(x);

        int [][] c = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        print(c);
        System.out.println();
        print(transpose(c)); // prints transpose of array c, but c after remains unchanged otherwise
//        print(c); // Array c is still the same...
        //int [][] d = transpose(c); // ...but can create new array to take on such change
        //print(d);

        int [][] qw = new int[3][2];
        qw[0][0] = 2;
        qw[2][1] = 5;
        print(qw);

//        int [] arr = new int[10];
//        int val = 20;
//        for(int i = 9; i >= 0; i--) {
//            arr[i] = val;
//            val -= 2;
//            System.out.print(arr[i] + "\t");
//        }
    }

    public static void print(int [][] arr) {
        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static int c(int x) {
//        System.out.println(++x);
        //return x++; // in main, prints out 1 no matter what
        return ++x; // in main, prints out 2
    }

    public static int [] popArray(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static void printArray(int [] arr) { // previously just ()
        // intended code here
//        int size = 10;
//        int [] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (arr.length - i) * 2;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println(); // trailing new line for whichever reason
    }

    public static int [][] transpose(int [][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int [][] out = new int[cols][rows];
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                out[c][r] = arr[r][c];
            }
        }
        return out;
    }
}
