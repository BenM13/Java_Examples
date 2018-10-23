import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection
{
    private final String SERVER_NAME;
    private final String PORT;
    private final String SID;
    private final String USERNAME; 
    private final String PASSWORD;
    private Connection conn; 
    private Statement stmt;
    private ResultSet results;

    public OracleConnection()
    {
        this.SERVER_NAME = "obscured.mit.edu";
        this.PORT = "1521";
        this.SID = "PROPROD";
        this.USERNAME = "incidental";
        this.PASSWORD = System.getenv("obs_pw");
        this.conn = null;
        this.stmt = null;
        this.results = null;
    }

    public void createConnection()
    {
        try
        {
            String driverName = "oracle.jdbc.driver.OracleDriver";
            String url = "jdbc:oracle:thin:@" + SERVER_NAME + ":" +
                         PORT + ":" + SID;
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
            System.out.println("Successfully connected to the database!");    
        } catch (ClassNotFoundException e) {
            System.out.println("Could not find the database driver:\n" + 
                                e.getMessage());
        } catch (SQLException e) {
            System.out.println("There was a problem connecting to the database:\n" + 
                               e.getMessage());
        }

    }

    public ResultSet runQuery(String query)
    /*
    Executes query. Returns ResultSet object.
    */
    {
        try
        {
            System.out.println("Executing query...");
            stmt = conn.createStatement();
            results = stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("There was a problem with the query:\n" +
                               e.getMessage());
        }
        return results;
    }

    public void closeConnection()
    {
        try
        {
            if ((stmt != null) && (conn != null))
            {
                stmt.close();
                conn.close();
                System.out.println("Connection closed");
            }
        } catch (SQLException e) {
            System.out.println("Unable to close conection:\n" +
                               e.getMessage());
        }
    }
}