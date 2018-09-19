// Chapter 5, Listing 5.12

import java.util.Scanner;

public class Species4thTryDemo
{
    public static void main(String[] args)
    {
        Species4thTry speciesOfTheMonth = new Species4thTry();
        System.out.println("Enter the number of years to project:");
        System.out.print("--> ");
        Scanner keyboard = new Scanner(System.in);
        int numYears = keyboard.nextInt();
        System.out.println("Enter data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();

        int futurePopulation = speciesOfTheMonth.predictPopulation(numYears);
        System.out.println("In " + numYears + "years the population will be " +
                            futurePopulation);
        // Change instance variables using set methods
        speciesOfTheMonth.setSpecies("Kingon ox", 10, 15);
        System.out.println("The new Species of the Mopnth:");
        speciesOfTheMonth.writeOutput();

        futurePopulation = speciesOfTheMonth.predictPopulation(numYears);
        System.out.println("In " + numYears + "years the population will be " +
                            futurePopulation);
    }
}