public class LabMethodArrays {
    public static void main(String[] args) {
        int size = 10;
        int [] fives = new int[size];
        for(int i = 0; i < size; i++) {
            fives[i] = (i+1) * 5;
        }
        print(fives);
        System.out.println("Reverse!");
        printReverse(fives);
    }

    public static void print(int [] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }

    public static void printReverse(int [] arr) {
        int limit = 7, count = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            if(count >= limit) {
                break;
            }
            count++;
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
