import java.util.Scanner;

public class ArrayQuiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] arr = {2,5,3,2,1,1,5,3,2,9};
        int num;
        do {
            System.out.print("Enter a number between 0 and 9: ");
            num = s.nextInt();
        } while(num <= 0 || num > 9);
//        System.out.print("Enter a number between 0 and 9: ");
//        int num = s.nextInt();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                count++;
            }
        }
        System.out.println(num + " is repeated " + count + " times");

    }
}
