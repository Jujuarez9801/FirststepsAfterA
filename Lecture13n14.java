import java.util.Scanner;
import java.util.Random;

public class Lecture13n14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Continue? e to keep going:  ");
        int num = 0;
        String e = s.next();
        while (num < 10) {
            System.out.println(num);
            System.out.print("Continue? e to keep going:  ");
            e = s.next();
            if (e.equalsIgnoreCase("e")) {
                num++;
            } else {
                System.out.println("Wrong input, enter e to continue: ");
            }


//            Scanner s = new Scanner(System.in);
//            int num = 0;
//            System.out.println(num);
//            System.out.print("Start? Yes to start: ");
//            String answer = s.next();
//            while(num < 10) {
//                System.out.println(num);
//                System.out.print("Continue? yes to keep going: ");
//                answer = s.next();
//                if(answer.equalsIgnoreCase("yes")) {
//                    num++;
//                } else if(answer.equalsIgnoreCase("e")) {
//                    break;
//                }
//            }
//            System.out.println("done");
//        }
//    }
//
//
//        }
//        System.out.println(num);
//        System.out.println("Program reached 10. Stopping now");
//        s.close();
//        int outerCount = 0, innerCount = 0;
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter outer loop size: ");
//        int outer = s.nextInt();

            //        1     2      4
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i); // prints out 0-9
            // }                   // 3

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter starting: ");
//        int a = s.nextInt();
//        System.out.print("Enter ending: ");
//        int b = s.nextInt();
//        for (; a <= b; a++) {
//            if (a % 2 == 1) {
//                System.out.print(a + " ");
//            }
//        }
//        System.out.println();


//            Scanner s = new Scanner(System.in);
            System.out.print("Enter starting: ");
            int a = s.nextInt();
            System.out.print("Enter ending: ");
            int b = s.nextInt();
            for (; a <= b; a++) {
                if (a % 2 == 0) {
                    System.out.print(a + " ");
                }
            }


            System.out.println();
            s.close();


//        Scanner s = new Scanner(System.in);
//        Random r = new Random();
        }

    }
}