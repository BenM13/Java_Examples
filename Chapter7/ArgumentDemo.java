// Chapter 7, Listing 7.5

import java.util.Scanner;

public class ArgumentDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter you score on exam 1:");
        System.out.print("--> ");
        int firstScore = keyboard.nextInt();
        int[] nextScore = new int[3];

        for (int i = 0; i < nextScore.length; i++)
        {
            nextScore[i] = firstScore + (5 * i);
        }

        for (int i = 0; i < nextScore.length; i++)
        {
            double possibleAverage = getAverage(firstScore, nextScore[i]);
            System.out.println("If you score on exam 2 is " + nextScore[i]);
            System.out.println("your average will be " + possibleAverage);
        }
    }

    public static double getAverage(int n1, int n2)
    {
        return (n1 + n2) / 2;
    }
}