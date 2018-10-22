import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    
    public static void main(String[] args)
    {
        Connection conn = null;
        try 
        {
            // create driver class
            String driverName = "oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);

            String serverName = "obscured.mit.edu";
            String serverPort = "1521";
            String sid = "PROPROD";
            String url = "jdbc:oracle:thin:@" + serverName + ":" +
                          serverPort + ":" + sid;
            String username = "incidental";
            String password = System.getenv("obs_pw");

            // connect to database
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Successfully connected to the database!");
            
            String query = "SELECT course_id FROM whmitx_course " +
                       "WHERE ROWNUM <= 10";
            Statement stmt = null;
            
            // run query and print results
            stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery(query);
            System.out.println("\nExecuting query...");
            while (results.next()) 
            {
                String course_id = results.getString("COURSE_ID");
                System.out.println(course_id);
            }

            // Close statement and conn objects
            if ((stmt != null) && (conn != null)) {
                stmt.close();
                conn.close();
                System.out.println("\nConnection closed.\n");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver " +
                               e.getMessage());
        } catch (SQLException e) {
            System.out.println("There was a SQLException thrown:" +
                               e.getMessage());
        }

    }
}