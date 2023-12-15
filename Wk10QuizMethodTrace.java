public class Wk10QuizMethodTrace {

    public static void foo1() {
        int x = 10;
        System.out.print(x + " ");
    }

    public static void foo2(int x) {
        System.out.print(x * 2 + " ");
    }

    public static int foo3() {
        int x = 20;
        x += 5;
        System.out.print(x + " ");
        return x; //25
    }

    public static int foo4(int x) {
        x = x % 7; // 25 % 7 = 4
        System.out.print(x + " ");
        return x; //returns 4
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.print(x + " "); // 5

        foo1(); // 10
        System.out.print(x + " "); // 5

        foo2(x); // 10
        System.out.print(x + " "); // 5

        x = foo4(foo3()); // 25 4
        System.out.print(x + " "); // 5

        foo1(); // 10
        System.out.print(x + " "); // 5

        foo2(x); // 10
        System.out.print(x + " "); // 5

        System.out.print(foo4(x)); // 5 5
        //  numbers in total by end of program
    }
}
