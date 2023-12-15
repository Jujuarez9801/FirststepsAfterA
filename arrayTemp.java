import java.util.Scanner;

public class arrayTemp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = getPositiveNumber(s);
        String [] names = new String[size];
        populateNames(names, s);
        String inputName;
        do {
            System.out.print("Enter a name or 0 to stop: ");
            inputName = s.next();
            System.out.print(inputName + " is ");
            if(checkName(names, inputName)) {
                System.out.print("in the list ");
            } else {
                System.out.print("not in the list ");
            }
        } while(!inputName.equals("0"));
    }

    public static int getPositiveNumber(Scanner in) {
        int inputN = 0;
        do {
            System.out.print("Enter a positive number above 0: ");
            inputN = in.nextInt();
        } while(inputN <= 0);
        return inputN;
    }

    public static void populateNames(String [] a, Scanner in) {
        for(int i = 0; i < a.length; i++) {
            System.out.print("Enter a name for the array: ");
            a[i] = in.next();

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
