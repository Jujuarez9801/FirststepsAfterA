import java.util.Scanner;
// Yes, this calculates the mean/avg correctly
// Program that runs until user enters 0 or a negative number and returns the Avg/Mean
public class BreakWhileLoopAvg {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = 1, sum = 0, count = 0; //to hold user input
        while(true) {
            System.out.print("Enter a positive # or 0 to stop: ");
            input = s.nextInt();
            if(input == 0)
            {
                break;
            }
            sum += input;
            count++;
        }
        if(count > 0) {
        }
        System.out.println("Average: " + (double)sum/count);
        System.out.println(count);



        // outer and inner loop, Break and Continue

        int outerCount = 0;
        int max = 5;
        int innerCount = 1;

        while(outerCount++ < max) {
            System.out.println("Outer loop iteration " + outerCount);
            boolean done = false;
            while(innerCount < max) {
                System.out.println("\tInner loop iteration " +innerCount);
                System.out.print("\t(C)ontinue, (B)reak, (E)xit? ");
                String enter = s.next();
                if(enter.equalsIgnoreCase("C")) {
                    System.out.println("\tContinuing; skipping loop variable update");
                    continue;
                } else if(enter.equalsIgnoreCase("B")) {
                    System.out.println("\tBreaking; returning to outer loop");
                    break;
                } else if(enter.equalsIgnoreCase("E")) {
                    System.out.println("\tExiting; breaking and setting done to true");
                    done = true;
                    break;
                }
                // anything else, update loop variable and return to condition
                System.out.println("\tUpdating inner loop variable");
                innerCount++;
            }

            if(done) {
                System.out.println("Exiting outer loop with break");
                break;
            }
        }
        System.out.println("Done! Final value for outerCount: " + outerCount
                + " and innerCount: " + innerCount);


    Scanner scanner = new Scanner(System.in);
    String userInput = "";
    while (true) {
        System.out.print("Enter something: ");
        userInput = scanner.nextLine();

        // Your validation rule
        if (userInput.length() > 5) {
            break;  // Exit the loop if the input meets the rule
        } else {
            System.out.println("Input should be more than 5 characters. Try again.");
        }
    }

    // Rest of your code after valid input
        System.out.println("Valid input received: " + userInput);

    // Remember to close the scanner
        scanner.close();
    }
}

