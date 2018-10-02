// Chapter 6, Listing 6.7

import java.util.Scanner;

public class SavingsAccount
{
    private double balance;
    public static double interestRate = 0;
    public static int numAccounts = 0;
    
    public SavingsAccount()
    {
        balance = 0;
        numAccounts++;
    }

    public static void setInterestRate(double newRate)
    /*
    NOTE: a static method can reference a static variable
    but it cannot reference an instance variable
    */
    {
        interestRate = newRate;
    }

    public static double getInterestRate()
    {
        return interestRate;
    }

    public static  int getNumAccounts()
    {
        return numAccounts;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public double withdraw(double amount)
    {
        if (balance >= amount)
            balance -= amount;
        else
            amount = 0;
        return amount;
    }

    public void addInterest()
    {
        double interest = balance * interestRate;
        balance += interest;
    }

    public double getBalance()
    {
        return balance;
    }

    public static void showBalance(SavingsAccount account)
    {
        System.out.print(account.getBalance());
    }
}