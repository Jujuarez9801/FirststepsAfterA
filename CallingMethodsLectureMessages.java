
// Lecture Wk10, creating and invoking methods- relatively simple here.

public class CallingMethodsLectureMessages {

    public static void printHello() {
        System.out.println("Hello there");
//        return hello;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int printMessage2(String message) {
        System.out.println(message);
        int value = 7;
        return value * value;
    }

    public static void main(String[] args) {
//        System.out.println(printHello("")); //
        int message = 7;
        printHello();
        printMessage("Hey there, my name is Justin");
        printMessage("Testing another line over here");
        printMessage2("This is the other one");
        System.out.println(printMessage2("Test") + 15); // 49 + 15 = 64
        int value = printMessage2("Test2");
        System.out.println(value + 1); // 49 + 1 = 50


    }
}
