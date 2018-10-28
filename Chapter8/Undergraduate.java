// Chatper 8, Listing 8.4

public class Undergraduate extends Student
{
    private int level; // 1 = freshmean, 2 = sophmore, 3 = junior, 4 = senior}

    public Undergraduate()
    {
        super();
        level = 1;
    }

    public Undergraduate(String initName, int initID, int initLevel)
    {
        super(initName, initID);
        setLevel(initLevel); 
    }

    public void reset(String newName, int newID, int newLevel)
    {
        reset(newName, newID); // reset method from Student class
        setLevel(newLevel);
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int newLevel)
    {
        if ((newLevel >= 1) && (newLevel <= 4))
        {
            level = newLevel;
        } else {
            System.out.println("Illegal variable!");
            System.exit(0);
        }
    }

    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Grade level: " + level);
    }

    public boolean equals(Undergraduate otherUndergrad)
    {
        return equals((Student)otherUndergrad) && (this.level == otherUndergrad.level);                
    }
}