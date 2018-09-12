import java.util.Scanner;

/*
    Program to computer area of a circle.
    Author: whomever cares
    email: who comments in their email?
    Ok, I think I get the point of comments now
*/

public class CircleCalculation
{
    public static void main(String[] args)
    {
        double radius; // in inches
        double area; // in square inches
        Scanner keybaord = new Scanner(System.in);
        System.out.println("Enter the radius of the circle in inches:");
        radius = keybaord.nextDouble();
        area = 3.141592654 * radius * radius;
        System.out.println("A circle of radius " + radius + " inches");
        System.out.println("has an area of " + area + " square inches.");
    }
}