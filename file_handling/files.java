package file_handling;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class files {
    public static void main(String[] args) throws IOException{
        try {
            File myFile = new File("file_handling/ques.txt");
            FileWriter fw = new FileWriter("file_handling/answers.txt");
            Scanner scan = new Scanner(myFile);
            Scanner user_input = new Scanner(System.in);
            while (scan.hasNextLine()) {
                System.out.print("Question: ");
                System.out.println(scan.nextLine());
                System.out.print("Enter Answer: ");
                String ans = user_input.nextLine();
                fw.write(ans+"\n");
            } 
            scan.close();
            fw.close();
            user_input.close();

            System.out.println();

            File myFile2 = new File("file_handling/answers.txt");
            File myFile3 = new File("file_handling/ques.txt");
            Scanner scan2 = new Scanner(myFile2);
            Scanner scan3 = new Scanner(myFile3);
            while (scan2.hasNextLine() && scan3.hasNextLine()) {
                System.out.print("Question: ");
                System.out.println(scan3.nextLine());
                System.out.print("Answer: ");
                System.out.println(scan2.nextLine());
            }
            scan2.close();
            scan3.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
