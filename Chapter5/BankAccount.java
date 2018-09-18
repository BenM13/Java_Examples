/*
    Chapter 5, Listing 5.5: Local Variables
    This class is used in the LocalVariablesDemo.java program
*/

public class BankAccount
{
    public double amount;
    public double rate;
    
    public void showNewBalance()
    {
        double newAmount = this.amount + (this.rate / 100.0) * this.amount;
        System.out.println("With interest added, the new amount is $"
                           + newAmount);
    }
}