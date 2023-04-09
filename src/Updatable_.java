import java.sql.*;

public class Updatable_ {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        // ? 1) If a change is made to the data that affects the current result set, the
        // ? cursor position may change or a SQLException may be thrown
        // ? 2) Allow to update

        ResultSet rs = st.executeQuery("select * from employee");

        rs.moveToInsertRow();
        rs.updateInt("id", 7);
        rs.updateString("name", "person 7");
        rs.updateDouble("salary", 70000);
        rs.insertRow();

        while (rs.next()) {
            System.out.println(rs.getInt("id") + ": " + rs.getString("name") + ": " + rs.getDouble("salary"));
        }
    }
}
