/*
    Chapter 3, listing 3.1
    Demonstration of if-else
*/

import java.util.Scanner;

public class BankBalance
{
    public static final double PENALTY = 8.00;
    public static final double INTEREST = 0.02; // 2% annual rate

    public static void main(String[] args)
    {
        double balance;

        System.out.println("Enter your current balance: $");
        Scanner keyboard= new Scanner(System.in);
        balance = keyboard.nextDouble();
        System.out.println("Original balance: $" + balance);

        if (balance >= 0) {
            balance = balance + (INTEREST * balance) / 12;
        } else {
            balance = balance - PENALTY; 
        }

        System.out.println("After adjusting for one month");
        System.out.println("of interest and penalties,");
        System.out.println("your new balance is $" + balance);

    }
}