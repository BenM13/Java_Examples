// Chapter 6, Listing 6.14

public class DollarFormat
{
    public static void write(double amount)
    /*
    Displays amount in dollars and cents notation i.e. $##.##
    Rounds after two decimal places.
    Does not advance to the next line after input.
    */
    {
        if (amount >= 0)
        {
            System.out.print('$');
            writePositive(amount);
        } else {
            double positiveAmount = amount * -1; // Book is wrong, I'm right :P
            System.out.print('$');
            System.out.print('-');
            writePositive(positiveAmount);
        }
    }

    private static void writePositive(double amount)
    /*
    Precondition: amount >= 0
    Displays amonut in dollars and cents notation.
    Rounds after two decinal places.
    Omits the dollar sign.
    */
    {
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;

        System.out.print(dollars);
        System.out.print('.');

        if (cents < 10)
            System.out.print('0');
        System.out.print(cents);
    }

    public static void writeln(double amount)
    /*
    Disaplys amount in dollar and cents notation.
    Rounds after two decimal places/
    Advances to the next line after output.
    */
    {
        write(amount);
        System.out.println();
    }

}