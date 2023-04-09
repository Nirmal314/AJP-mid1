import java.sql.*;

public class Transaction_ {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        conn.setAutoCommit(false);
        // ! disable auto commit

        Statement st = conn.createStatement();
        st.executeUpdate("insert into sample_table (id, name) values (1, '1st')");
        st.executeUpdate("insert into sample_table (id, name) values (2, '2nd')");

        Savepoint s1 = conn.setSavepoint("s1");
        // ! create a savepoint
        st.executeUpdate("insert into sample_table (id, name) values (3, '3rd')");
        st.executeUpdate("insert into sample_table (id, name) values (4, '4th')");

        conn.rollback(s1);
        // ! rollback to s1

        st.executeUpdate("INSERT INTO users (id, name) VALUES (5, '5th')");

        // ! commit true
        conn.commit();
    }
}
