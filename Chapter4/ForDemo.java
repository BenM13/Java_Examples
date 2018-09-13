// Chapter 4, listing 4.5: For loop example

public class ForDemo
{
    public static void main(String[] args)
    {
        int countDown;
        for (countDown = 3; countDown >=0; countDown--)
        {
            System.out.println(countDown);
            System.out.println("...");

        }
        System.out.println("KaBOOM! :D");
    }
}