import java.sql.*;

public class Scrollable_ {
    static void printData(ResultSet rs) throws Exception {
        System.out.println(rs.getInt("id") + ": " + rs.getString("name") + ": " + rs.getDouble("salary"));
    }

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        // ? 1) If a change is made to the data that affects the current result set, the
        // ? cursor position will not change
        // ? 2) Don't allow to update

        ResultSet rs = st.executeQuery("select * from employee");

        rs.first();
        // ! move cursor to first row
        printData(rs);

        rs.last();
        // ! move cursor to last row
        printData(rs);

        rs.absolute(2);
        // ! move cursor to 2nd row
        printData(rs);
    }
}
