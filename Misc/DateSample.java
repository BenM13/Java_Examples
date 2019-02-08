import java.text.SimpleDateFormat;
import java.util.Date;

public class DateSample
{
    public static String getTimestamp()
    {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = new Date();
        return formatter.format(today);
    }

    public static void main(String[] args)
    {
        System.out.println("Today's date and time is:");
        System.out.println(getTimestamp());
    }
}