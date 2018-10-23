// Chapter 7, Listing 7.10

public class ArraySorter
{
    public static void selectionSort(int[] anArray)
    {
        for (int index = 0; index < anArray.length - 1; index++)
        {
            int indexOfNextSmallest = getIndexOfSmallest(index, anArray);
            interchange(index, indexOfNextSmallest, anArray);
        }
    }

    public static int getIndexOfSmallest(int startIndex, int[] a)
    /*
    Returns the index of the smallest value in the poriton of the
    array tjat begins at the element whose index is startIndex and 
    ends at the last element.
    */
    {
        int min = a[startIndex];
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index < a.length; index++)
        {
            if (a[index] < min)
            {
                min = a[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    public static void interchange(int i, int j, int[] a)
    /*
    Predondition: i and j are valid indices for the array a.
    Postcondition: Values of a[i] and a[j] have been interchanged
    */
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp; // original value of a[i]
    }
}