// Chapter 5, Listing 5.18

public class SpeciesEqualsDemo
{
    public static void main(String[] args)
    {
        Species s1 = new Species();
        Species s2 = new Species();

    s1.setSpecies("Klingon ox", 10, 15);
    s2.setSpecies("Klingon ox", 10, 15);

    if (s1 == s2)
        System.out.println("Matches with ==");
    else 
        System.out.println("Does not match with ==");
    
    if (s1.equals(s2))
        System.out.println("Matches with the equals method");
    else
        System.out.println("Does not match the equals method");
    
    System.out.println("Now change one Klingon ox to lowercase");
    s2.setSpecies("klingon ox", 10, 15); // using lowercase now
    if (s1.equals(s2))
        System.out.println("Matches with the equals method");
    else
        System.out.println("Does not match with the equals method");
    }
}