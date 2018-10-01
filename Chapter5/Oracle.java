// Chapter 5, Listing 5.15

import java.util.Scanner;

public class Oracle
{
    private String oldAnswer = "The answer is in your heart";
    private String newAnswer;
    private String question;
    private final String PROMPT = "--> ";
    
    public void chat()
    {
        System.out.print("I am the oracle. ");
        System.out.println("I will answer any one-line question");
        Scanner keyboard = new Scanner(System.in);
        String response;
        do
        {
            answer();
            System.out.println("Do you wish to ask another question?");
            System.out.print(PROMPT);
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("The oracle will now rest.");
    }

    private void answer()
    {
        System.out.println("What is your question?");
        System.out.print(PROMPT);
        Scanner keyboard = new Scanner(System.in);
        question = keyboard.nextLine();
        seekAdvice();
        System.out.println("You askedthe question:");
        System.out.println(" " + question);
        System.out.println("Now, here is my answer:");
        System.out.println(" " + oldAnswer);
        update();
    }

    private void seekAdvice()
    {
        System.out.println("Hmm, I need some help on that.");
        System.out.println("Give me one line of advice.");
        System.out.print(PROMPT);
        Scanner keyboard = new Scanner(System.in);
        newAnswer = keyboard.nextLine();
        System.out.println("Thank you. That helped a lot.");
    }

    private void update()
    {
        oldAnswer = newAnswer;
    }
}