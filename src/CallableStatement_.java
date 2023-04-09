import java.sql.*;

public class CallableStatement_ {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "nemo", "123");
        System.out.println("Connected");

        CallableStatement cs = conn.prepareCall("{CALL GetSalary(?,?)}");
        cs.setInt(1, 5);
        cs.registerOutParameter(2, Types.DOUBLE);
        cs.execute();

        System.out.println(cs.getDouble(2));
    }
}
