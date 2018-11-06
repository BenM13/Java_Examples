// Chapter 9, Listing 9.2

import java.util.Scanner;

public class ExceptionDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        try
        {
            System.out.println("Enter number of donuts:");
            System.out.print("--> ");
            int donutCount = keyboard.nextInt();

            System.out.println("Enter number of glasses of milk:");
            System.out.print("--> ");
            int milkCouunt = keyboard.nextInt();

            if (milkCouunt < 1)
            {
                throw new Exception("Error: No milk!");
            }

            double donutsPerGlass = donutCount / (double)milkCouunt;
            System.out.println(donutCount + " donuts.");
            System.out.println(milkCouunt + " glasses of milk.");
            System.out.println("You have " + donutsPerGlass + " donuts for each glass of milk.");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Go buy some milk.");
        }
    }
}