// Chapter 7, Listing 7.2

import java.util.Scanner;

public class ArrayOfTemps2
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many temperatures do you have?");
        System.out.print("--> ");
        int size = keyboard.nextInt();
        double[] temperature = new double[size];

        // Read temperatures and compute their average
        System.out.println("Enter " + temperature.length + " temperatures below");
        double sum = 0;
        for (int i = 0; i < temperature.length; i++)
        {
            System.out.print((i + 1) + ")--> ");
            temperature[i] = keyboard.nextDouble();
            sum += temperature[i];
        }
        double average = sum / temperature.length;
        System.out.println("The average temperature is " + average);

        //Display each temperature and its relation to the average
        System.out.println("The temperatures are:");
        for (int i = 0; i < temperature.length; i++)
        {
            if (temperature[i] < average)
                System.out.println(temperature[i] + " below average");
            else if (temperature[i] > average)
                System.out.println(temperature[i] + " above average");
            else
                System.out.println(temperature[i] + " at average");
        }
    }
}