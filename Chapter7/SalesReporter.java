// Chapter 7, Listing 7.4

import java.util.Scanner;

public class SalesReporter
{
    private final String PROMPT = "--> "; // to make console easier to read
    private double highestSales;
    private double averageSales;
    private SalesAssociate[] team; // array object created in getData
    private int numAssociates; // same as team.length

    public void getData()
    /*
    Reads the number of sales associates and data for each one
    */
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of sales associates");
        System.out.print(PROMPT);
        numAssociates = keyboard.nextInt();
        team = new SalesAssociate[numAssociates + 1];
        for (int i = 1; i <= numAssociates; i++)
        {
            team[i] = new SalesAssociate(); // SalesAssociate ojbect created here
            System.out.println("Enter data for associate #" + i);
            team[i].readInput();
            System.out.println();
        }

    }

    public void computeStats()
    /*
    Computes the average and highest sales figures.
    PRECONDITION: There must be at least 1 SalesAssociate
    */
    {
        double nextSales = team[1].getSales();
        highestSales = nextSales;
        double sum = nextSales;
        for (int i = 2; i <= numAssociates; i++)
        {
            nextSales = team[i].getSales();
            sum += nextSales;
            if (nextSales > highestSales)
                highestSales = nextSales; //highestSales so far;
        }
        averageSales = sum / numAssociates;
    }

    public void displayResults()
    /*
    Displays a sales report on the screen
    */
    {
        System.out.println("Average sales per associate is $" + averageSales);
        System.out.println("The highest sales figure is $" + highestSales);
        System.out.println("\nThe following had the highest sales:");
        // loops through to find the highest sales total
        for (int i = 1; i <= numAssociates; i++)
        {
            double nextSales = team[i].getSales();
            if (nextSales == highestSales)
            {
                team[i].writeOutput();
                System.out.println("$" + (nextSales - averageSales) 
                                   + " above the average.");
                System.out.println();
            }
        }
        System.out.println("The rest performed as follows: ");
        for (int i = 1; i <= numAssociates; i++)
        {
            double nextSales = team[i].getSales();
            if (team[i].getSales() != highestSales)
            {
                team[i].writeOutput();
                if (nextSales >= averageSales)
                    System.out.println("$" + (nextSales -
                                       averageSales) + " above the average.");
                else
                    System.out.println("$" + (averageSales -
                                        nextSales) + " below the average.");
                System.out.println();
            }
        }
    }

    public static void main(String[] args)
    {
        SalesReporter clerk = new SalesReporter();
        clerk.getData();
        clerk.computeStats();
        clerk.displayResults();
    }
}