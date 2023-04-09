import java.sql.*;

public class CheckConnection {
    static final String DB = "example";
    static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB;
    static final String USER = "nemo";
    static final String PASS = "123";
    static final String QUERY = "SELECT * FROM People";

    public static void main(String[] args) throws Exception {
        // ! 1) Load drivers
        Class.forName("com.mysql.cj.jdbc.Driver");

        // ! 2) Connect to DBMS
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        System.out.println("Connected");

        // ! 3) Creating statment
        Statement stmt = conn.createStatement();

        // ! 4) Executing statment
        ResultSet rs = stmt.executeQuery(QUERY);

        while (rs.next()) {
            System.out.println(rs.getInt("personId") + ": " + rs.getString("name"));
        }

        // ! 5) Terminating connection
        conn.close();
    }
}