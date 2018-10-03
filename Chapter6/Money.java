// Chapter 6, Listing 6.16

import java.util.Scanner;

public class Money
/*
Class representing nonnegative amouns of money
such as $100, $41.99, $0.05, you get the idea
*/
{
    private long dollars;
    private long cents;
    private final String PROMPT = "--> ";

    private void quitProgram(String message)
    {
        System.out.println("ERROR: " + message);
        System.out.println("Now exiting...");
        System.exit(0);
    }
    
    public void set(long newDollars)
    {
        if (newDollars < 0)
        {
            quitProgram("Value cannot be negative.");
        } 
        else 
        {
            dollars = newDollars;
            cents = 0;
        }
    }

    public void set(double newAmount)
    {
        if (newAmount < 0)
        {
            quitProgram("Value cannot be negative.");
        } 
        else 
        {
            long allCents = Math.round(newAmount * 100);
            dollars = allCents / 100;
            cents = allCents % 100;
        }
    }

    public void set(Money moneyObject)
    {
        this.dollars = moneyObject.dollars;
        this.cents = moneyObject.cents;
    }

    public void set(String amountString)
    /*
    Precondition: The argument is an ordinary representation of an amount
    of money, with or without a dollar sign. Fractions of a cent are not
    allowed.
    */
    {
        String dollarsString;
        String centsString;

        // Delete '$' if present:
        if (amountString.charAt(0) == '$')
        {
            amountString = amountString.substring(1);
        }
        amountString = amountString.trim();

        // Locate decimal point
        int pointLocation = amountString.indexOf(".");
        if (pointLocation < 0) // i.e. if there's no decimal point
        {
            cents = 0;
            dollars = Long.parseLong(amountString);
        }
        else
        {
            dollarsString = amountString.substring(0, pointLocation);
            centsString = amountString.substring(pointLocation + 1);

            // one digit in cents means tenths of a dollar
            if (centsString.length() <= 1)
                centsString = centsString + "0";
            
            // convert to numeric
            dollars = Long.parseLong(dollarsString);
            cents = Long.parseLong(centsString);
            if ((dollars < 0) || (cents < 0) || (cents > 99))
                quitProgram("Illegal representation of money.");
        }
    }

    public void readInput()
    {
        System.out.println("Enter amount on a line by itself");
        Scanner keyboard = new Scanner(System.in);
        System.out.print(PROMPT);
        String amount = keyboard.nextLine();
        set(amount.trim());
    }

    public void writeOutput()
    // NOTE: Does not go to next line after displaying money
    {
        System.out.print("$" + dollars);
        if (cents < 10)
            System.out.print(".0" + cents);
        else
            System.out.print("." + cents);
    }

    public Money times(int n)
    // Returns n times the calling object
    {
        Money product = new Money();
        product.cents = n * cents;
        long carryDollars = product.cents / 100;
        product.cents = product.cents % 100;
        product.dollars = n * dollars + carryDollars;
        return product;
    }

    public Money add(Money otherAmount)
    {
        Money sum = new Money();
        sum.cents = this.cents + otherAmount.cents;
        long carryDollars = sum.cents / 100;
        sum.cents = sum.cents % 100;
        sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
        return sum;
    }
}