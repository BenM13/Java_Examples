/*
An object of this class is a special kind of list and strings. You
can write the list only from beginning to end. You can add only to the end
of the list. You cannot change inidividual entries, but you can erase the
entire list and start over. No entry may appear more than once on the list.
You can use int variables as position markers into the list. Position markers 
are similar to array indices, but are numbered starting with one.
*/

public class OneWayNoRepeatsList
{
    public static int START_POSITION = 1;
    public static int DEFAULT_SIZE = 50;

    /* 
    entry.length is the total number of items you have room for
    on the list 9its capacity); countOfEntries is the number of 
    items currently on the list.
    */
    private int countOfEntries; // can be less than entry.length
    private String[] entry;

    public OneWayNoRepeatsList(int maxNumberOfEntries)
    /*
    Creates an empty list with a given capacity.
    */
    {
        entry = new String[maxNumberOfEntries];
        countOfEntries = 0;
    }

    public OneWayNoRepeatsList()
    /*
    Creates an empty list with a capaicty of DEFAULT_SIZE;
    */
    {
        this(DEFAULT_SIZE);
    }

    public boolean isFull()
    {
        return countOfEntries == entry.length;
    }

    public boolean isEmpty()
    {
        return countOfEntries == 0;
    }

    public void addItem(String item)
    {
        if (!isOnList(item))
        {
            if (countOfEntries == entry.length)
            {
                System.out.println("Adding to a full list!");
                System.exit(0);
            } else {
                entry[countOfEntries] = item;
                countOfEntries++;
            }
        }
    }

    public String getEntryAt(int position)
    /*
    If the argument indicates a position on the list, 
    the entry at that specifried position is returned.
    Otherwise, null is returned.
    */
    {
        String result = null;
        if ((1 <= position) && (position <= countOfEntries))
            result = entry[position - 1];
        return result;
    }

    public boolean atLastEntry(int position)
    /*
    returns true if position indicates the last item on the list.
    Otherwise, returns falase;
    */
    {
        return position == countOfEntries;
    }

    public boolean isOnList(String item)
    /*
    Returns true if item is on the list;
    otherwise, returns false. Does not differentiate
    between uppercase and lowercase letters.
    */
    {
        boolean found = false;
        int i = 0;
        while (!found && (i < countOfEntries))
        {
            if (item.equalsIgnoreCase(entry[i]))
                found = true;
            else i++;
        }
        return found;
    }

    public int getMaxNumEntires()
    {
        return entry.length;
    }

    public int getNumEntries()
    {
        return countOfEntries;
    }

    public void eraseList()
    {
        countOfEntries = 0;
    }
}