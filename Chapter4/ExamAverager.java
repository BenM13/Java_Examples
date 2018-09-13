// Chapter 4, listing 4.4: Nested Loops

import java.util.Scanner;

public class ExamAverager
{
    public static void main(String[] args)
    {
        System.out.println("This program computes the averages of");
        System.out.println("a list of (nonnegative) exam scores.");
        double sum;
        int numStudents;
        double next;
        String answer;
        Scanner keyboard = new Scanner(System.in);

        do 
        {
            System.out.println();
            System.out.println("Enter all the scores to be averaged.");
            System.out.println("Enter any negative number once when you're done");
            sum = 0;
            numStudents = 0;
            System.out.print(">>> ");
            next = keyboard.nextDouble();
            while (next >= 0)
            {
                sum = sum + next;
                numStudents++;
                System.out.print(">>> ");
                next = keyboard.nextDouble();
            }
            if (numStudents > 0)
                System.out.println("The average is " +
                                   (sum / numStudents));
            else
                System.out.println("No scores to average.");
            System.out.println("Want to average another exam? (yes/no)");
            System.out.print(">>> ");
            answer = keyboard.next();
        } while (answer.equalsIgnoreCase("yes"));
    }
}