// Chapter 3, listing 3.5: Switch statements

import java.util.Scanner;

public class MultipleBirths
{
    public static void main(String[] args)
    {
        int numBabies;
        System.out.println("Enter number of babies born at once:");
        Scanner keyboard = new Scanner(System.in);
        numBabies = keyboard.nextInt();

        switch (numBabies)
        {
            case 0:
                System.out.println("Well, at least you have some peace and quiet");
                break;
            case 1:
                System.out.println("Congratulations!");
                break;
            case 2:
                System.out.println("Wow. Twins!");
                break;
            case 3:
                System.out.println("Wow! Triplets!");
                break;
            case 4:
            case 5:
                System.out.println("No way.");
                break;
            default:
                System.out.println("I don't believe you.");
                break;
        }
    }
}