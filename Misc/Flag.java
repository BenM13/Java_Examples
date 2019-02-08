import java.util.HashMap;

public class Flag
{
    private static HashMap<String, String> options = new HashMap<String, String>();

    public Flag()
    {
        options = new HashMap<String, String>();
        options.put("opt_in", "email_opt_in = 1");
        options.put("paid", "paid = 0");
        options.put("audit", "paid = 0");
    }

    public HashMap<String, String> getOptions()
    {
        return options;
    }
}