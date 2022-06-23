import java.sql.*;
import java.util.ArrayList;

public class Main {
    // For time zone issue;
    // type it in dbUrl which adds some additional parameters:
    // jdbc:mysql://localhost/db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
    // For SSLException, add after /db?; useSSL=false&

    // Insert Operation
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            String sql = "delete from city where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4083);
                   int result = statement.executeUpdate();
            System.out.println("Data deleted!");
            // System.out.println("Connection established successfully!");
        } catch(SQLException sqlException) {
            // throw new RuntimeException(sqlException.getMessage());
            dbHelper.showErrorMessage(sqlException);
        } finally {
            assert connection != null;
            assert statement != null;
            statement.close();
            connection.close();

        }

    }

    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code, Name, Continent, Region from country");
            ArrayList<Country> countries = new ArrayList<>();

            while(resultSet.next()) {
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(countries.size());
            // System.out.println("Connection established successfully!");
        } catch(SQLException sqlException) {
            // throw new RuntimeException(sqlException.getMessage());
            dbHelper.showErrorMessage(sqlException);
        } finally {
            assert connection != null;
            connection.close();
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            String sql = "insert into city(Name, CountryCode, District, Population) values (?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");
            statement.setString(2,"TUR");
            statement.setString(3,"Düzce");
            statement.setInt(4,400976);
            int result = statement.executeUpdate();
            System.out.println("Data recorded!");
            // System.out.println("Connection established successfully!");
        } catch(SQLException sqlException) {
            // throw new RuntimeException(sqlException.getMessage());
            dbHelper.showErrorMessage(sqlException);
        } finally {
            assert connection != null;
            assert statement != null;
            statement.close();
            connection.close();

        }
    }

    public void updateData() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            String sql = "update city set population = 90000, district = 'Turkey' where id = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 4083);
            int result = statement.executeUpdate();
            System.out.println("Data updated!");
            // System.out.println("Connection established successfully!");
        } catch(SQLException sqlException) {
            // throw new RuntimeException(sqlException.getMessage());
            dbHelper.showErrorMessage(sqlException);
        } finally {
            assert connection != null;
            assert statement != null;
            statement.close();
            connection.close();
        }
    }
}