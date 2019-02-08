import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class AppendDemo
{
    public static void main(String[] args)
    {
        String filename = "appendMe.txt";

        FileWriter file = null;
        PrintWriter outputStream = null;
        
        try
        {
            file = new FileWriter(filename, true);
            outputStream = new PrintWriter(file);
            System.out.println("Enter three lines of text:");
            Scanner keyboard = new Scanner(System.in);
            for (int count = 1; count <= 3; count++)
            {
                String line = keyboard.nextLine();
                outputStream.println(count + " " + line);
            }
            outputStream.close();
            file.close();
            System.out.println("Those line were written to " + filename);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        
       
    }
}