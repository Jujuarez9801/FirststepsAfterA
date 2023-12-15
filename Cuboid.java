import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        System.out.print("Please enter the width: ");
        Scanner scan = new Scanner(System.in);
        double width = scan.nextDouble();

        System.out.print("Please enter the height: ");
        double height = scan.nextDouble();

        System.out.print("Please enter the depth: ");
        double depth = scan.nextDouble();
        double area = (2 * depth*width) + (2 * depth*height) + (2 * height*width); // area = 2dw + 2dh + 2hw
        double volume = depth * width * height; // volume = d * w * h (or l * b * h)

        System.out.println("The area of the cuboid " + "(width = " + width + ", " + "height = " + height
                            + ", " + "depth = " + depth + ") is " + area + " square units");
        System.out.println("The volume of the cuboid " + "(width = " + width + ", " + "height = " + height
                + ", " + "depth = " + depth + ") is " + volume + " cubic units");





    }
}
