// Chapter 9, Listing 9.6

import java.util.Scanner;

public class DivideByZeroDemo
{
    private int numerator;
    private int denominator;
    private double quotient;
    private final String PROMPT = "--> ";

    public static void main(String[] args)
    {
        DivideByZeroDemo oneTime = new DivideByZeroDemo();
        oneTime.doIt();
    }

    public void doIt()
    {
        try
        {
            System.out.println("Enter numerator:");
            Scanner keyboard = new Scanner(System.in);
            System.out.print(PROMPT);
            numerator = keyboard.nextInt();

            System.out.println("Enter denominator:");
            System.out.print(PROMPT);
            denominator = keyboard.nextInt();

            if (denominator == 0)
            {
                throw new DivideByZeroException();
            }

            quotient = numerator / (double)denominator;
            System.out.println(numerator + "/" + denominator + " = " + quotient);
        } 
        catch (DivideByZeroException e) 
        {
            System.out.println(e.getMessage());
            giveSecondChance();
        }
    }

    public void giveSecondChance()
    {
        System.out.println("Try again:");
        System.out.println("Enter numerator:");
        System.out.print(PROMPT);
        Scanner keyboard = new Scanner(System.in);
        numerator = keyboard.nextInt();

        System.out.println("Enter denominator:");
        System.out.print(PROMPT);
        denominator = keyboard.nextInt();

        if (denominator == 0)
        {
            System.out.println("Can't divide by zero!");
            System.out.println("You're not good at this, so I'm exiting.");
            System.exit(0);
        }

        quotient = ((double)numerator) / denominator;
        System.out.println(numerator + "/" + denominator + " = " + quotient);
    }
}