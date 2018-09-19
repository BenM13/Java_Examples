// Chapter 5, Listing 5.7

public class Species2ndTryDemo
{
    public static void main(String[] args)
    {
        Species2ndTry speciesOfTheMonth = new Species2ndTry();
        System.out.println("Enter data on the Species of the month");
        speciesOfTheMonth.readInput();
        speciesOfTheMonth.writeOutput();
        int futurePopulation = speciesOfTheMonth.predictPopulation(10);
        // change instance variables 
        speciesOfTheMonth.name = "Klingon ox";
        speciesOfTheMonth.population = 10;
        speciesOfTheMonth.growthRate = 15;
        System.out.println("\nThe new species of the Month:");
        speciesOfTheMonth.writeOutput();
        System.out.println("In ten years the population will be " +
                           speciesOfTheMonth.predictPopulation(10));
    }
}