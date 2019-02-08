public class OptionsDemo
{
    public static void main(String[] args)
    {
        Flag lst = new Flag();
        System.out.println(lst.getOptions().get("opt_in"));
    }
}