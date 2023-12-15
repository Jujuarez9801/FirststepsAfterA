// Date: 09/01/2023

import java.util.Scanner;
public class TemperatureConversion {
    public static void main(String[] args) {
        System.out.print("Please enter a temperature: ");
        Scanner s = new Scanner(System.in);
        double tempf = s.nextDouble();
        double tempc = (tempf - 32) / 1.8;
        double tempcf = (tempf * 9.0/5.0) + 32;
        int a = 10;
        int b = 7;
        System.out.println(a%b + " and " + b%a);
        System.out.println("If the Fahrenheit temperature is " + tempf + "," + " the Celsius temperature is " + tempc);
        System.out.println("If the Celsius temperature is " + tempf + "," + " The Fahrenheit temperature is " + tempcf);
        System.out.println("The rounding result of " + tempf + " is " + Math.round(tempf) ); // extra stuff
    }
}
