import java.io.*;
import java.util.Scanner;
//import java.io.FileReader;

public class LectureWk8FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        new File("").getAbsolutePath();
        FileReader infile = new FileReader("numbers.txt");
        Scanner f = new Scanner(infile);
        int sum = 0, data;
        while(f.hasNext())
        {
            data = f.nextInt();
            sum += data;
        }
        f.close();
        System.out.println("Sum is " + sum);





//        String fileName = "hello.txt";
//        FileReader fr = new FileReader("TextH.txt");
//
//        fr.close();

    }
}
