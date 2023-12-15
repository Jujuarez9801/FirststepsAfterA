import java.util.Random;
// Lab 10

public class Lab10 {
    public static void quux(double num1, double num2) {
        String sm = "secret message";
        System.out.println("Entering quux");
        System.out.println(num1 + num2);
        bar(6);
//        int bar = bar();
//        System.out.println(bar);
        System.out.println(sm);
        System.out.println("Exiting quux");
//        return sm;
    }

    public static void bar(int num1) {
        System.out.println("Entering bar");
        System.out.println(num1);
        foo("I like otters");
//        String foo = foo("I like otters");
//        System.out.println(foo);
//        System.out.println(double );
        System.out.println("Exiting bar");
//        return double num1;
    }

    public static int foo(String sm) {
        Random r = new Random();
        int rnum = r.nextInt(9) + 1; // or % 9 + 1
        System.out.println("Entering foo");
        System.out.println(sm);
        System.out.println("Exiting quux");
        return rnum;
    }

    public static void main(String[] args) {
        System.out.println("Entering main");
        quux(0.5, 2.22);
//        String quux = quux(0.5, 2.22);
//        System.out.println(quux);
        System.out.println("Exiting main");

    }
}
