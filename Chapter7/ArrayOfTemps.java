// Chapter 7, Listing 7.1

import java.util.Scanner;

public class ArrayOfTemps
{
    public static void main(String[] args)
    {
        double[] temperature = new double[7];

        // read temperatures and compute their averge:
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 7 tempreatures:");
        double sum = 0;
        for (int i = 0; i < 7; i++)
        {
            System.out.print((i + 1) + ")--> ");
            temperature[i] = keyboard.nextDouble();
            sum += temperature[i];
        }
        double average = sum / 7;
        System.out.println("The average temperature is " + average);

        // Display each temperature and its relation to the average
        System.out.println("The temperatures are:");
        for (int i = 0; i < 7; i++)
        {
            if (temperature[i] < average)
                System.out.println(temperature[i] + ": below average");
            else if (temperature[i] > average)
                System.out.println(temperature[i] + ": above average");
            else
                System.out.println(temperature[i] + ": at aveage");
        }

        // System.out.println(temperature);
    }
}