/*
Chapter 6, Listint 6.1
Class for basic pet information: name, age, and weight
*/

public class Pet
{
    private String name;
    private int age; // in years
    private double weight; // in pounds

    public Pet() // Default constructor
    {
        name = "(No name yet)";
        age = 0;
        weight = 0;
    }

    private void quitProgram()
    {
        System.out.println("ERROR: Invalid parameters");
        System.out.println("Now exiting...goodbye!");
        System.exit(0);
    }

    public Pet(String initName, int initAge, double initWeight)
    {
        name = initName;
        if ((initAge < 0) || (initWeight < 0))
        {
            quitProgram();
        } else {
            age = initAge;
            weight = initWeight;
        }
    }

    public void setPet(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            quitProgram();
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public Pet(String initName)
    {
        name = initName;
        age = 0;
        weight = 0;
    }

    public void setName(String newName)
    {
        name = newName; // age and weight are unchanged
    }

    public Pet(int initAge)
    {
        name = "(No name yet).";
        weight = 0;
        if (initAge < 0)
            quitProgram();
        else
            age = initAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
            quitProgram();
        else
            age = newAge; // name and weight are unchanged
    }

    public Pet(double initWeight)
    {
        name = "(No name yet)";
        age = 0;
        if (initWeight < 0)
            quitProgram();
        else
            weight = initWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
            quitProgram();
        else
            weight = newWeight; // namne and age are unchanged
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight " + weight + " pounds");
    }
}