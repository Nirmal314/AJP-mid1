import java.sql.*;

public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        PreparedStatement ps = conn.prepareStatement("select * from People where personId = ?");
        ps.setString(1, "101");

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("name"));
        }
    }
}
