// Chapter 6, Listing 6.3

public class Pet2
{
    private String name;
    private int age;
    private double weight;

    public Pet2(String initName, int initAge, double initWeight)
    {
        set(initName, initAge, initWeight);
    }

    public Pet2(String initName)
    {
        set(initName, 0, 0);
    }

    public Pet2(int initAge)
    {
        set("(No name yet)", initAge, 0);
    }

    public Pet2() // default constructor
    {
        set("(No name yet)", 0, 0);
    }

    public void setPet(String newName, int newAge, double newWeight)
    {
        set(newName, newAge, newWeight);
    }

    public void setName(String newName)
    {
        set(newName, age, weight); // age and weight are unchanged
    }

    public void setAge(int newAge)
    {
        set(name, newAge, weight); // name and weight are unchanged
    }

    public void setWeight(double newWeight)
    {
        set(name, age, newWeight); // name and age are unchanged
    }

    private void set(String newName, int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("ERROR: age/weight cannot be negative.");
            System.out.println("Now exiting...");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
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
        System.out.println("Weight: " + weight + " pounds");
    }
}