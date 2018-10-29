// Chapter 8, Listing 8.8

public class Rectangle implements Measurable
{
    private double myWidth;
    private double myHeight;

    public Rectangle(double width, double height)
    {
        myHeight = height;
        myWidth = width;
    }

    public double getPerimeter()
    {
        return 2 * (myHeight * myHeight);
    }

    public double getArea()
    {
        return myHeight * myHeight;
    }
}