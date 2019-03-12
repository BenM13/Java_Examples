public class ThreadDemo
{
    public static void main(String args[])
    {
        RunnableDemo run1 = new RunnableDemo("Thread-1");
        run1.beginThread();

        RunnableDemo run2 = new RunnableDemo("Thread-2");
        run2.beginThread();
    }
}