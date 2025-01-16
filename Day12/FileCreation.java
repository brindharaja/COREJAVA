// Creating a File and Writing Your Name
//In this exercise, you will create a new file (e.g., name.txt) and write your name to it.
//Task:
//Write a program that:
//Creates a new text file called name.txt.
//Write your name to the file.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args) {
        File f1 = new File("namee.txt");
        try {
            if (f1.createNewFile()) {
                System.out.println("File created: " + f1.getName());
            } else {
                System.out.println("File already exists.");
            }
            try (FileWriter f2 = new FileWriter(f1)){;
                f2.write("Brindha");
                System.out.println("Successfully wrote to the file.");
            } }catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
    }
}