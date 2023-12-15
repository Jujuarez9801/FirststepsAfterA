//import java.util.Scanner;
//import java.io.IOException;
//import java.io.FileReader;
//
class FileReadandWriteStringNum {
    public static void main(String[] args) {
        System.out.print("Hi");

        //// Program reads from .txt file and returns how many times each word in .txt file is entered ////

//        String fileN = "repwords.txt";
//        FileReader f_in = new FileReader(fileN);
//        Scanner s_in = new Scanner(f_in);
//        while(s_in.hasNextLine()) {
//            String word = s_in.next();
//
//            FileReader f_in2 = new FileReader(fileN);
//            Scanner s_in2 = new Scanner(f_in2);
//            int count = 0;
//            while(s_in2.hasNext()) {
//                String word2 = s_in2.next();
//                if(word2.equalsIgnoreCase(word)) {
//                    count++;
//                }
//            }
//            System.out.println("The word " + word + " appears " + count + " times");
//            f_in2.close();
//            // s_in2.close();
//            // s_in.close();
//            //f_in.close();
//        }
//    }
//}



        //// prints out numbers, append to existing ones and add them separately

//        String filename = "output.txt";
//
//        // Open the file in append mode (true as the second argument)
//        FileWriter f_out = new FileWriter(filename, true);
//        PrintWriter p_out = new PrintWriter(f_out);
//
//        // Generate and append new numbers to the file
//        for (int i = 1; i <= 10; i++) {
//            int randomNumber = (int) (Math.random() * 100); // Generate a random number (change as needed)
//            p_out.println(randomNumber);
//        }
//
//        p_out.close(); // Close the PrintWriter
//
//        FileReader fr_in = new FileReader(filename);
//        Scanner s_in = new Scanner(fr_in);
//        int sum = 0;
//        while (s_in.hasNextInt()) {
//            int data = s_in.nextInt();
//            sum += data;
//            System.out.println("Current sum: " + sum);
//        }
//        System.out.println("Final sum: " + sum);
//
//        fr_in.close();
//    }
//}

    }
}





//// reads from words.txt and counts how many times each word is repeated ////


//        String filename = "words.txt";
//        FileReader fr = new FileReader(filename);
//        Scanner fileScanner = new Scanner(fr);
//
//        while(fileScanner.hasNext()) {
//            String word = fileScanner.next();
//            // System.out.println(word);
//            int count = 0;
//            FileReader frInner = new FileReader(filename);
//            Scanner fileScannerInner = new Scanner(frInner);
//
//            while(fileScannerInner.hasNext()) {
//                if(fileScannerInner.next().equals(word)) {
//                    count++;
//                }
//            }
//
//            frInner.close();
//            System.out.println(word + ": " + count);
//        }
//
//        fr.close();
//    }
//}










//import java.io.*;
//        import java.util.Scanner;

/*
Trying to get this program to print the below printout:

foo
    bar
        baz
    hmm
quux

*/

//class Main {
//    public static void main(String[] args) throws IOException {
//        Scanner console = new Scanner(System.in);
//        System.out.print("Enter a compressed file name: ");
//
//        String filename = console.nextLine();
//        FileReader fr = new FileReader(filename);
//        Scanner fileScanner = new Scanner(fr);
//
//        int wordCount = fileScanner.nextInt();
//        int size = fileScanner.nextInt();
//        System.out.println(wordCount);
//        System.out.println(size);
//
//
//        // String word = "";
//        // while(fileScanner.hasNext()){
//        //   words = fileScanner.next();
//        //   // System.out.println(words);
//        for(int i = 0; i <= wordCount; i++) {
//            String words = fileScanner.nextLine();
//            for(int k = 0; k < (i - 1) * size; k++) {
//                System.out.print(" ");
//            }
//            System.out.println(words);
//        }
//        console.close();
//        fileScanner.close();
//    }
//}

