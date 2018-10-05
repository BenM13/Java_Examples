/*
Proof of concept for a future Utilities class
*/

public class Utilities
{
    private static int newInt; // for use with checkInt and convertInt

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

    public static boolean checkInt(String input)
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
            System.out.println("ERROR: Invalid input");
            return false;
        }
        return true;
    }

    public static int convertToInt(String input)
    /*
    Checks whether a string can be converted to an int
    using a try-catch.
    Converts string and returns int if it passes the try block.
    Calls quitProgram() if test fails. 
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