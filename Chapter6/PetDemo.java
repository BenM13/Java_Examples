// Chapter 6, Listing 6.2

import java.util.Scanner;

public class PetDemo
{
    public static void main(String[] args)
    {
        final String PROMPT = "--> ";

        Pet myPet = new Pet();
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        myPet.writeOutput();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the correct name:");
        System.out.print(PROMPT);
        String correctName = keyboard.nextLine();
        myPet.setName(correctName);

        System.out.println("Please enter the correct pet age:");
        System.out.print(PROMPT);
        int correctAge = keyboard.nextInt();
        myPet.setAge(correctAge);

        System.out.println("Please enter the correct pet weight in pounds:");
        System.out.print(PROMPT);
        double correctWeight = keyboard.nextDouble();
        myPet.setWeight(correctWeight);

        System.out.println("Thank you. My records have been updated.");
        System.out.println("Here's what I now have on file:");
        myPet.writeOutput();
    }
}