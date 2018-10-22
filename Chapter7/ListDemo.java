// Chapter 7, Listing 7.8

import java.util.Scanner;

public class ListDemo
{
    public static final int MAX_SIZE = 3; // asuumed > 0
    public static final String PROMPT = "--> ";
    
    public static void main(String[] args)
    {
        OneWayNoRepeatsList toDoList = new OneWayNoRepeatsList(MAX_SIZE);
        System.out.println("Enter items for the list, when prompted.");
        boolean moreEntries = true;
        String next = null;
        Scanner keyboard = new Scanner(System.in);

        while (moreEntries && !toDoList.isFull())
        {
            System.out.println("Enter an item;");
            System.out.print(PROMPT);
            next = keyboard.nextLine();
            toDoList.addItem(next);
            if (toDoList.isFull()) 
            {
                System.out.println("The list is now full");
            } else {
                System.out.println("More items for the list? (yes/no)");
                System.out.print(PROMPT);
                String answer = keyboard.nextLine();
                if (answer.trim().equalsIgnoreCase("no"))
                    moreEntries = false; // User say no more
            }
        }

        System.out.println("The list contains:");
        int position = toDoList.START_POSITION;
        next = toDoList.getEntryAt(position);
        while (next != null) // null indicates end of list
        {
            System.out.println(next);
            position++;
            next = toDoList.getEntryAt(position);
        }
    }
}