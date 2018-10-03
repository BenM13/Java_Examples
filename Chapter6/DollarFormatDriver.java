import java.util.Scanner;

public class DollarFormatDriver
{
    public static void main(String[] args)
    {
        double amount;
        String response;
        final String PROMPT = "--> ";
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Testing DollarFormat.writeln():");
        do
        {
            System.out.println("Enter a decimal value:");
            System.out.print(PROMPT);
            amount = keyboard.nextDouble();
            DollarFormat.writeln(amount);
            System.out.println("Test again? (yes/no)");
            System.out.print(PROMPT);
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes"));
        System.out.println("Now exiting...goodbye!");
    }
}