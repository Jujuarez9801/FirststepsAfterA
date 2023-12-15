public class CallingMethodTracing {
    public static void main(String[] args) {
        int x = 1, y = 2;
        foo(x,y); // makes "foo" correlate- this method's (x,y), (1,2), is the other methods (y,z), (1,2)
    }

    public static void foo(int y, int z) {
        int x = 5;
        x = x + 1; // 5 + 1 = 6
        System.out.println(x);
        y = y + 1; // 2 + 1 = 2
        System.out.println(y);
        z = z + 1; // 2 + 1 = 3
        System.out.println(z);
        int sum = x + y + z;
        System.out.println(x + " " + y + " " + z + " = " + sum);
    } // to be continued

}
