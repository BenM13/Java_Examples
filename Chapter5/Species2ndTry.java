// Chapter 5, listing 5.5

import java.util.Scanner;

public class Species2ndTry
{
    public String name;
    public int population;
    public double growthRate;

    public void readInput()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        System.out.print("--> ");
        name = keyboard.nextLine();
        System.out.println("What is the population of the species?");
        System.out.print("--> ");
        population = keyboard.nextInt();
        System.out.println("Enter growth rate (as % increase per year)");
        System.out.print("--> ");
        growthRate = keyboard.nextDouble();
    }

    public void writeOutput()
    {
        System.out.println("\nName: " + name);
        System.out.println("Population: " + population);
        System.out.println("Growth rate: " + growthRate + "%");
    }

    public int predictPopulation(int years)
    {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) 
        {
            populationAmount = (populationAmount +
            (growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int)populationAmount;
        return result;
    }
}