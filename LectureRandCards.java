import java.util.Random;

class LectureRandCards {
    public static void main(String[] args) {
        Random r = new Random();
        // 0 - spade, 1 - hearts, 2 - clubs, 3 - diamonds
        int suit = Math.abs(r.nextInt()) % 4;
        System.out.println("suit: " + suit);
        // 1 - 13
        int face = Math.abs(r.nextInt()) % 13 + 1;
        System.out.println("face: " + face);

        int h = Math.abs(r.nextInt()) % 13 + 1;
        int j = Math.abs(r.nextInt()) % 13 + 1;
        int k = Math.abs(r.nextInt()) % 13 + 1;
        int o = 13 % 5; // remainder 3
        int q = 5 % 13; // remainder 5
        int w = 25 % 7; // remainder 4
        int v = 8 % 2; // remainder 0
        int b = 11 % 7; // remainder 4
        int e = 68 % 5; // remainder 3
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
        System.out.println(o);
        System.out.println(q);
        System.out.println(w);
        System.out.println(v);
        System.out.println(b);
        System.out.println(e);

//         int num = 5 * 3;
//         int num2 = 5/2;
//         double value = 5/2;
//         double value2 = 5.0/2.0;
//         int num3 = (int) (5.0/2.0);
//         int num4 = 19 / 4;
//         int num5 = 19 % 4;
//         System.out.println(num);
//         System.out.println(num2);
//         System.out.println(value);
//         System.out.println(value2);
//         System.out.println(num3);
//         System.out.println(num4);
//         System.out.println(num5);
    }
}