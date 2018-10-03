// Chapter 6, Listing 6.12

public class DollarFormat1stTry
{
    /*
    Displays amount in dollar and cents notation: $#.##
    Rounds after two decimal places.
    Does not advance to the lext line after output.
    */
    public static void write(double amount)
    {
        int allCents = (int)(Math.round(amount * 100));
        int dollars = allCents / 100;
        int cents = allCents % 100;

        System.out.print('$');
        System.out.print(dollars);
        System.out.print('.');

        if (cents < 10)
        {
            System.out.print(0);
            System.out.print(cents);
        } else {
            System.out.print(cents);
        }
    }

    public static void writeln(double amount)
    {
        write(amount);
        System.out.println();
    }
}