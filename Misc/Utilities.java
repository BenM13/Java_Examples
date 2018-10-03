/*
Proof of concept for a future Utilities class
*/

public class Utilities
{
    private static int newInt; // for use with checkInt

    public static void quitProgram(String message)
    /*
    Safely exits the program and prints error message.
    Must pass a message as a string when calling this method.
    */
    {
        System.out.println("ERROR: " + message);
        System.out.println("Now exiting...Please restart.");
        System.exit(0);
    }

    public static int checkInt(String input)
    /*
    Checks whether a string can be converted to an int
    using a try-catch.
    Returns false if a NumberFormatException is caught.
    Otherwise returns true. 
    */
    {
        try
        {
            newInt = Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            quitProgram("Invalid input.");
        }
        return newInt;
    }
}