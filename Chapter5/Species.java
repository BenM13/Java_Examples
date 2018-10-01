import java.util.Scanner;

public class Species
{
    private String name;
    private int population;
    private double growthRate;

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

    public void setSpecies(String newName, int newPopulation, double newGrowthRate)
        {
            if (newPopulation >= 0) {
                population = newPopulation;
            } else {
                System.out.println("ERROR: population can't be negative");
                System.out.println("I'm exiting.");
                System.exit(0);
            }
            name = newName;
            growthRate = newGrowthRate;
        }
   
    public String getName()
    {
        return name;
    }

    public int getPopulation()
    {
        return population;
    }

    public double getGrowthRate()
    {
        return growthRate;
    }

    public boolean equals(Species otherObject)
    {
        return ((this.name.equalsIgnoreCase(otherObject.name)) &&
               (this.population == otherObject.population) &&
               (this.growthRate == otherObject.growthRate));
    }
}