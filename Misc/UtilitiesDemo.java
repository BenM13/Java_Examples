import java.util.Scanner;

public class UtilitiesDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        System.out.print("--> ");
        String input = keyboard.nextLine();
        System.out.println("You entered: " + Utilities.convertToInt(input));

        int yourInt;
        do 
        {
            System.out.println("\nEnter a new integer: ");
            System.out.print("--> ");
            input = keyboard.nextLine();
        } while (!(Utilities.checkInt(input)));
        yourInt = Integer.parseInt(input);
        System.out.println("You entered: " + yourInt);
    }
}