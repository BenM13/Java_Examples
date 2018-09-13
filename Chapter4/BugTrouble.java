/*
    Chapter 4, listing 4.3. roach population
    Program to calculate how long it will take a population of
    roaches to completely fill a house from floor to ceiling
*/

import java.util.Scanner;

public class BugTrouble
{
    public static final double GROWTH_RATE = 0.95; // 95% growth per week
    public static final double ONE_BUG_VOL = 0.002; // in cubic feet

    public static void main(String[] args)
    {
        System.out.println("Enter the total volume of your house");
        System.out.print("in cubic feet: ");
        Scanner keyboard = new Scanner(System.in);
        double houseVolume = keyboard.nextDouble();

        System.out.println("Enter the estimated number of");
        System.out.print("roaches in your house: ");                        
        int startPopulation = keyboard.nextInt();
        int weeks = 0;
        double population = startPopulation;
        double totalBugVolume = population * ONE_BUG_VOL;
        double newBugs, newBugVolume;

        while (totalBugVolume < houseVolume)
        {
            newBugs = population * GROWTH_RATE;
            newBugVolume = newBugs * ONE_BUG_VOL;
            population = population + newBugs;
            totalBugVolume = totalBugVolume + newBugVolume;
            weeks++;
        }

        System.out.println("Starting with a roach population of " 
                           + startPopulation);
        System.out.println("and a house with a volume of " + houseVolume +
                           " cubic feet,");
        System.out.println("after " + weeks + " weeks,");
        System.out.println("the house will be filled with " +
                           (int)population + " roaches.");
        System.out.println("They will fill a volume of " +
                           (int)totalBugVolume + " cubic feet.");
    }
}