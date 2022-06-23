import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String dbUrl = "jdbc:mysql://localhost:3306/world";
    private String userName = "root";
    private String password = "mN0_aS7-xF";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, userName, password);
    }

    public void showErrorMessage(SQLException sqlException) {
        System.out.println("Error : " + sqlException.getMessage());
        System.out.println("Error Code : " + sqlException.getErrorCode());
    }
}
