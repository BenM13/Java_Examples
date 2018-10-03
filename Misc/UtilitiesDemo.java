import java.util.Scanner;

public class UtilitiesDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        System.out.print("--> ");
        String input = keyboard.nextLine();
        System.out.println("You entered: " + Utilities.checkInt(input));
    }
}