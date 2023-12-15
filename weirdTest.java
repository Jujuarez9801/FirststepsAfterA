public class weirdTest {
    public static int product(int x, int y){
        return x*y;
    }

    public static void main(String[] args) {
        int x = 2, y = 5, z = 10;
        int p = product(x, y);
        System.out.println(product(p, z) + " " + product(product(x, y), z)); // product(product (x,y), z
                                                                              // =  (2*5) * 100
                                                         // product(x,y), z: is still product(x,y)
    }
}