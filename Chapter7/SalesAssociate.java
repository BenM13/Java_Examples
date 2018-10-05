// Chapter 7, Listing 7.3

import java.util.Scanner;

public class SalesAssociate
{
    private String name;
    private double sales;
    private final String PROMPT = "--> ";

    public SalesAssociate()
    {
        name = "(No record)";
        sales = 0;
    }

    public SalesAssociate(String initName, double initSales)
    {
        set(initName, initSales);
    }

    public void set(String newName, double newSales)
    {
        name = newName;
        sales = newSales;
    }

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter name of sales associate");
        System.out.print(PROMPT);
        name = keyboard.nextLine();

        System.out.println("Enter the associates sales total");
        System.out.print(PROMPT + " $");
        sales = keyboard.nextDouble();        
    }

    public void writeOutput()
    {
        System.out.println("NAME: " + name);
        System.out.println("SALES: $" + sales);
    }

    public String getName()
    {
        return name;
    }

    public double getSales()
    {
        return sales;
    }
}