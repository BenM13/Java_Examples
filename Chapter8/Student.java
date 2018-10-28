// Chapter 8, Listing 8.2

public class Student extends Person
{
    private int studentID;

    public Student()
    {
        super();
        studentID = 0; // i.e. no ID yet
    }

    public Student(String initName, int initID)
    {
        super(initName);
        studentID = initID;
    }

    public void reset(String newName, int newID)
    {
        setName(newName);
        studentID = newID;
    }

    public void setStudentID(int newID)
    {
        studentID = newID;
    }

    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("ID #: " + studentID);
    }

    public boolean equals(Student otherStudent)
    {
        return this.hasSameName(otherStudent) && (this.studentID == otherStudent.studentID);
    }
}