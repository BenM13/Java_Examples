/**
Chapter 8, Listing 8.13
Class for drawing rectangles on the screen using keyboard
characters. Each character is higher than it is wide, so 
these rectangles will look taller than one might expect/
Inherits getOffset, setOffset, and drawAt from the base class 
*/

public class Rectangle2 extends ShapeBasics implements RectangleInterface
{
    private int height;
    private int width;

    public Rectangle2()
    {
        super();
        height = 0;
        width = 0;
    }

    public Rectangle2(int initOffset, int initHeight, int initWidth)
    {
        super(initOffset);
        height = initHeight;
        width = initWidth;
    }

    public void set(int newHeight, int newWidth)
    {
        height = newHeight;
        width = newWidth;
    }

    public void drawHere()
    {
        drawHorizontalLine();
        drawSides();
        drawHorizontalLine();
    }

    private void drawHorizontalLine()
    {
        skipSpaces(getOffset());
        for (int count = 0; count < width; count++)
        {
            System.out.print('-');
        }
        System.out.println();
    }

    private void drawSides()
    {
        skipSpaces(getOffset());
        System.out.println('|');
        skipSpaces(width - 2);
        System.out.println('|');
    }

    public static void skipSpaces(int number)
    {
        for (int count = 0; count < number; count++)
        {
            System.out.println(' ');
        }
    }
}

