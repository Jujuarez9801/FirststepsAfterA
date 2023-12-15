import java.util.Scanner;

public class Wk11Lecture {
    public static void main(String[] args) {
//        for(int i = 1; i < 4; i++){
////            System.out.println("\t\t\t"+i);
//            for(int j = 6; j > 3; j--){
////                System.out.println("\t\t" + j);
//                if(j % i == 0){
//                    System.out.print(j + " ");
//                } else if(i % j == 0){
//                    System.out.print(i + " ");
//                } else{
//                    System.out.print(( i + j) + " ");
//                }
//            }
//        }

//        int k = 0;
//        for(int i = 1; i < 4; i++){
//            for(int j = i; j < 4; j += 2){
//                if((k + i) > (j - k)){
//                    System.out.print((j + k) + "(a) ");
//                } else if ((i + k) % j == 0){
//                    System.out.print(i + "(b) ");
//                } else{
//                    System.out.print((i + j) + "(c) ");
//                }
//            }
//            k = i;
//        }

//        public static void main(String[] args){
            String a = "Add";
            Scanner s = new Scanner(System.in);
            int b = readInput(s);
            int c = readInput(s);
            display("Add", add(b,c));
    }
        public static void display(String b, int c){
            System.out.print(b + " two numbers: " + c);
        }
        public static int readInput(Scanner s){
            System.out.print("Enter integer input: ");
            int a = s.nextInt();
            return a;
        }
        public static int add(int x, int y){
            return x + y;
        }


}

