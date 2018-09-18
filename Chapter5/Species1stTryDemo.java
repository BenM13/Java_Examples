// Chapter 5, Listing 5.4

public class Species1stTryDemo
{
    public static void main(String[] args)
    {
        Species1stTry speciesOfTheMonth = new Species1stTry();
        System.out.println("Enter the data on the Species of the Month:");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();
        
        int futurePopulation = speciesOfTheMonth.getPopulationIn10();
        System.out.println("In 10 years the population will be " 
                            + futurePopulation);
        
        /* Change the species to show how to change
           the values of instance variables */
        speciesOfTheMonth.name = "Krogan";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("\nThe new Species of the Month:");
        speciesOfTheMonth.writeOutput();
        System.out.println("In 10 years the population will be "
                            + speciesOfTheMonth.getPopulationIn10());
    }
}