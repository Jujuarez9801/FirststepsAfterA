import java.util.Scanner;

public class LectureNotesNested {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

//        int cols = 0, rows = 0;
//        int rows = s.nextInt();
        System.out.print("Rows: ");
        int cols = s.nextInt();
        System.out.print("Columns: ");
        int rows = s.nextInt();
        for(int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //  program 2 //
            int result = 0;
            for(int i = 1; i < 5; i++) {
                for(int k = 1; k <= i; k++) {
                    result += i;
                    System.out.println(result);
                }
            }
            System.out.println("Final result: " + result);
        }
    }


   // program 3, not nested but a little extra something //
//            Scanner s = new Scanner(System.in);
//            for(int i = 12; i > 0; i--) {
//                if(i <= 9) {
//                    System.out.print("0" + "");
//                }
//                System.out.print(i + " ");
//                System.out.println();
//            }
//            System.out.println();
//


