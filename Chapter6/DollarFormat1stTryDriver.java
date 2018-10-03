// Chapter 6, Listing 6.13

import java.util.Scanner;

public class DollarFormat1stTryDriver
{
    public static void main(String[] args)
    {
        double amount;
        String response;
        final String PROMPT = "--> ";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Testing DollarFormart1stTry.write()");
        do
        {
            System.out.println("Enter a value of type double");
            System.out.print(PROMPT);
            amount = keyboard.nextDouble();
            DollarFormat1stTry.writeln(amount);
            System.out.println("Test againt? (yes/no)");
            System.out.print(PROMPT);
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Now exiting...goodbye!");
    }
}