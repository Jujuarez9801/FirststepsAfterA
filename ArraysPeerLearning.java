import java.util.Scanner;

public class ArraysPeerLearning {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = getPositiveNumber(in);
        String [] names = new String[size];
        populateNames(names, in);
        String inputName;
        do {
            System.out.print("Enter a name to check or 0 to stop: ");
            inputName = in.next();
            System.out.print(inputName + " is ");
            if(checkName(names, inputName)) {
                System.out.println("in the list");
            } else {
                System.out.println("NOT in the list");
            }
        } while(! inputName.equals("0"));
    }

    public static int getPositiveNumber(Scanner s) {
        int num = 0;
        do {
            System.out.print("Enter a positive number: ");
            num = s.nextInt();
        } while(num <= 0);
        return num;
    }

    public static void populateNames(String [] names, Scanner s) {
        for(int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i+1) + " of " + names.length + ": ");
            names[i] = s.next();
        }
    }

    public static boolean checkName(String [] a, String n) {
        for(int i = 0; i < a.length; i++) {
            if(n.equalsIgnoreCase(a[i])) {
                return true;
            }
        }
        return false;
    }
}
