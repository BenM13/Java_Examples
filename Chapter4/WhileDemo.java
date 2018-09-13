// Chapter 4, listing 4.1, while loops
// I made some tweaks just for fun

import java.util.Scanner;

public class WhileDemo
{
    public static void main(String[] args)
    {
        int count, number;

        System.out.println("Enter a number");
        System.out.println("Preferably not one that's unreasonably large");
        Scanner keyboard = new Scanner(System.in);
        number = keyboard.nextInt();

        count = 1;
        if (number <= 0) {
            System.out.println("You can't have " + number + " iterations!");
            System.exit(0);
        } else if ((number > 0) && (number < 1000)) {
            while (count <= number)
            {
                System.out.print(count + ", ");
                count++;
            }
        } else {
            System.out.println("No way am I gonna do " + number + " iterations!");
            System.out.println("I'm exiting!");
            System.exit(0);
        }

        System.out.println();
        System.out.println("Ok, " + number + " iterations. There you go.");
    }
}