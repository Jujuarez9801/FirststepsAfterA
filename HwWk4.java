import java.util.Scanner;

public class HwWk4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean firstNum = true;
        int num;
        while (true) {
            if (firstNum) {
                System.out.print("Enter numbers, one at a time, and I'll tell you some facts about it. Enter 0 to stop.\n" +
                        "Enter your first number: ");
            } else {
                System.out.print("\n"+ "Enter your next number: ");
            }
            // int num = s.nextInt();
            num = s.nextInt();
            if (num == 0) {
                System.out.print("Done!");
                break;
            }
            firstNum = false;

            System.out.println("You entered " + num);

            if (num % 2 == 0) {
                System.out.println("The number is even");
            } else {
                System.out.println("The number is odd");
            }
            if(num > 0) {
                System.out.println("The number is positive");
            } else {
                System.out.println("The number is negative");
            }
            if (num % 5 == 0) {
                System.out.println("The number is a multiple of 5");
            } else {
                System.out.println("The number is not a multiple of 5");
            }
            double squareRoot = Math.sqrt(Math.abs(num));
            if (num > 0) {
                System.out.println("The square root of the number is " + squareRoot);
            } else {
                System.out.println("The square root of the number is NaN");
            }
            double floorSquareRoot = Math.floor(squareRoot);
            if (num > 0) {
                System.out.println("The floor of the square root of the number is " + floorSquareRoot);
            } else {
                System.out.println("The floor of the square root of the number is NaN");
            }
            if (squareRoot == floorSquareRoot && num > 0) {
                System.out.println("The number is a perfect square");
            } else {
                System.out.println("The number is a not perfect square");
            }
        }
    }
}
//        Scanner s = new Scanner(System.in);
//        int num = s.nextInt();
//
//
//        System.out.print("Enter your next number: ");
//        while (num != 0) {
//            num = s.nextInt();
//            System.out.println("You entered " + num);
//
//            if (num % 2 == 0) {
//                System.out.println("The number is even");
//            } else {
//                System.out.println("The number is odd");
//            }
//            if (num % 5 == 0) {
//                System.out.println("The number is a multiple of 5");
//            } else {
//                System.out.println("The number is not a multiple of 5");
//            }
//        double squareRoot2 = Math.sqrt(Math.abs(num));
//            if (num > 0) {
//                System.out.println("The square root of the number is " + squareRoot2);
//            } else {
//                System.out.println("The square root of the number is NaN");
//            }
//        double floorSquareRoot2 = Math.floor(squareRoot);
//            if (num > 0) {
//                System.out.println("The floor of the square root of the number is " + floorSquareRoot2);
//            } else {
//                System.out.println("The floor of the square root of the number is NaN");
//            }
//            if (squareRoot2 == floorSquareRoot2) {
//                System.out.println("The number is a perfect square");
//            } else {
//                System.out.println("The number is a not perfect square");
//            }
//            System.out.print("Enter your next number: ");
//        }
//        System.out.print("Done!");
//    }



        //prev attempt
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter numbers, one at a time, and I'll tell you some facts about it. Enter 0 to stop.\n" +
//                "Enter your first number: ");
//        int num = s.nextInt();
//        System.out.println("You entered " + num);
//
//        do {
//            System.out.print("Enter your next number: ");
//            num = s.nextInt();
//        } while(num != 0);
//        if(num%2 = 0){
//            System.out.println("something");
//        }
//    }
//}

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your first number: ");
//        int num = 1;
//        while(num != 0) {
//            System.out.println("Enter your next number: ");
//            num = s.nextInt();
//        }
//
//    }
//}




//        Scanner scanner = new Scanner(System.in);
//        boolean isFirstNumber = true;
//
//        while (true) {
//            if (isFirstNumber) {
//                System.out.println("Enter numbers, one at a time, and I'll tell you some facts about it. Enter 0 to stop.");
//                System.out.print("Enter your number: ");
//            } else {
//                System.out.print("Enter your next number: ");
//            }
//            int num = scanner.nextInt();
//
//            if (num == 0) {
//                break;
//            }
//
//            isFirstNumber = false;
//
//            System.out.println("You entered " + num);
//
//            // Check if the number is even or odd
//            if (num % 2 == 0) {
//                System.out.println("The number is even");
//            } else {
//                System.out.println("The number is odd");
//            }
//
//            // Check if the number is positive or negative
//            if (num > 0) {
//                System.out.println("The number is positive");
//            } else if (num < 0) {
//                System.out.println("The number is negative");
//            }
//
//            // Check if the number is divisible by 5
//            if (num % 5 == 0) {
//                System.out.println("The number is a multiple of 5");
//            } else {
//                System.out.println("The number is not a multiple of 5");
//            }
//
//            // Calculate and print the square root of the number
//            double squareRoot = Math.sqrt(Math.abs(num));
//            System.out.println("The square root of the number is " + squareRoot);
//
//            // Calculate and print the floor of the square root of the number
//            double floorSquareRoot = Math.floor(squareRoot);
//            System.out.println("The floor of the square root of the number is " + floorSquareRoot);
//
//            // Check if the number is a perfect square
//            if (squareRoot == floorSquareRoot) {
//                System.out.println("The number is a perfect square");
//            } else {
//                System.out.println("The number is not a perfect square");
//            }
//        }
//
//        scanner.close();
//    }
//}





                   /// nono ///

        //        Scanner s = new Scanner(System.in);
//        String answer = "yes";
//        do {
//            System.out.print("Stop? (yes/no) ");
//            answer = s.next();
//        } while(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("not") || answer.equalsIgnoreCase("n"));
//        System.out.println("Done");
//
//    }
//}



                /// countdown ///

//        Scanner s = new Scanner(System.in);
//        int number;
//        do {
//            System.out.print("Enter a positive number: ");
//            number = s.nextInt();
//        } while (number <= 0);
//
//        s.close();
//
//        while (number > 0) {
//            System.out.println(number);
//            number -= 1;
//
//        }
//
//        System.out.println("CONTACT!");
//    }
//}


