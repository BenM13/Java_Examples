// Chapter 6, Listing 6.6

import java.util.Scanner;

public class DimensionDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a measurement in inches:");
        System.out.print("--> ");
        double inches = keyboard.nextDouble();
        double feet = DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = " + feet + " feet.");
        
        System.out.println("\nEnter a measurement iin feet:");
        System.out.print("--> ");
        feet = keyboard.nextDouble();
        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = " + inches + " inches ");
        System.out.println();
    }
}