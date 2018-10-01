/*
    Chapter 5, Listing 5.13
    Class for the purchase of one kind of item, such as 3 oranges.
    Prices are set supermarket systel, such as 5 for $1.25, etc.
*/

import java.util.Scanner;

public class Purchase
{
    private String name;
    private int groupCount; // Part of a price, like the 2 in 2 for $1.99
    private double groupPrice; // Now the $1.99 part
    private int numberBought; // number of items bought
    private final String PROMPT = "--> ";

    public void setName(String newName)
    {
        name = newName;
    }

    //sets price to count prieces for costForCount
    public void setPrice(int count, double costForCount)
    {
        if ((count <= 0) || (costForCount <= 0))
        {
            System.out.println("ERROR: Bad parameters in 'setPrice.' Exiting...");
            System.exit(0);
        } else {
            groupCount = count;
            groupPrice = costForCount;
        }
    }

    public void setNumberBought(int number)
    {
        if (number <= 0) {
            System.out.println("ERROR: Bad parameters in 'setNumberBought.'"
                                + " Exiting...");
            System.exit(0);
        } else {
            numberBought = number;
        }
    }

    // Reads from keyboard the price and number of a purchase
    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of item you are purchasing:");
        System.out.print(PROMPT);
        name = keyboard.nextLine();
        System.out.println("Enter price of item as two numbers.");
        System.out.println("Example: 3 for $2.99 would be entered as");
        System.out.println("'--> 3 2.99'");
        System.out.println("Enter that below:");
        System.out.print(PROMPT);
        groupCount = keyboard.nextInt();
        groupPrice = keyboard.nextDouble();

        if ((groupCount <= 0) || (groupPrice <= 0))
        {
            System.out.println("Both numbers must be positive. Try again.");
            this.readInput();
        }
        
        System.out.println("Enter the number of items purchased:");
        System.out.print(PROMPT);
        numberBought = keyboard.nextInt();
        while (numberBought <= 0) 
        { // invalid, try again :(
            System.out.println("Number must be positive. Try again.");
            System.out.println("Enter the number of items purchased:");
            System.out.print(PROMPT);
            numberBought = keyboard.nextInt();
        }

    }

    // Displays price and number being purchased
    public void writeOutput()
    {
        System.out.println(numberBought + " " + name);
        System.out.println("at " + groupCount + " for $" + groupPrice);
    }

    public String getName()
    {
        return name;
    }

    public double getTotalCost()
    {
        return (groupPrice / groupCount) * numberBought;
    }

    public double getUnitCost()
    {
        return groupPrice / groupCount;
    }

    public int getNumberBought()
    {
        return numberBought;
    }
}