import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.NullPointerException;

public class QueryDemo
{
    public static void main(String[] args)
    {
        OracleConnection obscured = new OracleConnection();
        String query;
        obscured.createConnection();

        if ((args.length > 0) && (args[0].equalsIgnoreCase("Opt-in")))
        {
            query = "SELECT DISTINCT pc.username, person.email, " +
                    "names.profile_name full_name " +
                    "FROM (SELECT pcourse.user_id, pcourse.username " +
                    "FROM whmitx_person_course pcourse " +
                    "WHERE pcourse.course_id = 'MITx/15.762x/3T2018') pc " +
                    "JOIN ( SELECT user_id, email " +
                    "FROM whmitx_person WHERE email_opt_in_flag = '1') person " +
                    "ON person.user_id = pc.user_id " +
                    "JOIN whmitx_person_name names " +
                    "ON names.user_id = pc.user_id  " + 
                    "WHERE ROWNUM <= 10";
        } else {
            query = "SELECT DISTINCT pc.username, person.email, " +
                    "names.profile_name full_name " +
                    "FROM (SELECT pcourse.user_id, pcourse.username " +
                    "FROM whmitx_person_course pcourse " +
                    "WHERE pcourse.course_id = 'MITx/15.762x/3T2018') pc " +
                    "JOIN ( SELECT user_id, email " +
                    "FROM whmitx_person)  person " +
                    "ON person.user_id = pc.user_id " +
                    "JOIN whmitx_person_name names " +
                    "ON names.user_id = pc.user_id " + 
                    "WHERE ROWNUM <= 10";
        }

        ResultSet queryResults = obscured.runQuery(query);

        try
        {
            while (queryResults.next())
            {
                String username = queryResults.getString("USERNAME");
                String email = queryResults.getString("EMAIL");
                System.out.println(username + "\t" + email);
            }
        } catch (SQLException e) {
            System.out.println("There was a problem getting the results:\n" +
                               e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("There was a poroblem getting results:\n" +
                               e.getMessage());
        }

        obscured.closeConnection();
    }
}