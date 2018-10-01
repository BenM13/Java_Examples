// Chapter 5, Listing 5.14

public class PurchaseDemo
{
    public static void main(String[] args)
    {
        Purchase oneSale = new Purchase();
        oneSale.readInput();
        oneSale.writeOutput();
        System.out.println("Cost per unit: $" + oneSale.getUnitCost());
        System.out.println("Total cost: $" + oneSale.getTotalCost());
    }
}