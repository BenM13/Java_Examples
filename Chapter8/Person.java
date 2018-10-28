// Chapter 8, Listing 8.1

public class Person
{
    private String name;

    public Person()
    {
        name = "(no name yet)";
    }

    public Person (String initName)
    {
        name = initName;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public String getName()
    {
        return name;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + name);
    }

    public boolean hasSameName(Person otherPerson)
    {
        return this.name.equalsIgnoreCase(otherPerson.name);
    }
}