import java.util.Scanner;

class WhilePeerLearning4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // int lock1 = 37;
        // int lock2 = 56;
        // int lock3 = 9;
        // System.out.print("Enter the first number: ");
        // int user1 = s.nextInt();
        // System.out.print("Enter the second number: ");
        // int user2 = s.nextInt();
        // System.out.print("Enter the third number: ");
        // int user3 = s.nextInt();
        // Boolean open1 = user1 == lock1;
        // Boolean open2 = user2 == lock2;
        // Boolean open3 = user3 == lock3;
        // if(open1 & open2 & open3){
        //   System.out.println("Lock opened");
        // } else if((open1 & open2)||(open2 & open3)||(open1 & open3)){
        //   System.out.println("You got two out of three");
        // } else if((open1) || (open2) || (open3)) {
        //   System.out.println("You only got one correct");
        // } else {
        //   System.out.println("You didn't get any correct");
        // }

        // System.out.println("The secret numbers were " + lock1 + " " + lock2 +
        //                  " " + lock3 + " ");

//
//        int count = 0;
//        System.out.print("Continue? (y/n) ");
//        String answer = s.next();
//        while(answer.equalsIgnoreCase("y")) {
//            System.out.print("Continue? (y/n) ");
//            answer = s.next();
//            count++;
//        }
//        System.out.println("The loop repeated " + count + " times.");
//    }

        int count = 0;
        double temperature;
        do {
            System.out.print("Please enter a temperature: ");
            temperature = s.nextDouble();
            count++;
            if (temperature > 80) {
                System.out.println("It is too hot!");
            } else if (temperature <= 32) {
                System.out.println("It is too cold!");
            }
        } while(temperature <= 32 || temperature > 80);
            System.out.println("Finally a warm enough temperature of " + temperature
                    + " degrees, only had to ask " + count + " times.");

//        int count = 0;
//        double temperature;
//        do {
//            System.out.print("Please enter a temperature: ");
//            temperature = s.nextDouble();
//            count++;
//            if (temperature > 80) {
//                System.out.println("Too hot! Please enter another temperature: ");
//            } else if (temperature <= 32) {
//                System.out.print("It is too cold! Please enter another temperature: ");
//            }
//        } while(temperature <= 32 || temperature > 80);
//            System.out.println("Finally, only took " + count + " tries to get it right.");




//        String answer = "N";
//        int count = 0;
//        do {
//            System.out.print("Will you continue? (Y/N): ");
//            answer = s.next();
//            count++;
//        } while(! answer.equalsIgnoreCase("y"));
//        System.out.println("Finally! you made me question you4 " + count + " times.");
    }

}
