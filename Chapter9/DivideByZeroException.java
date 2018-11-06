// Chapter 9, Listing 9.5

public class DivideByZeroException extends Exception
{
    public DivideByZeroException()
    {
        super("Division by zero!");
    }

    public DivideByZeroException(String message)
    {
        super(message);
    }
}