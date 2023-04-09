import java.sql.*;

public class Statement_ {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        Statement stmt = conn.createStatement();

        ResultSet rs = stmt.executeQuery("Select * from People");

        while (rs.next()) {
            System.out.println(rs.getInt("personId") + ": " + rs.getString("name"));
        }
        conn.close();
    }
}
