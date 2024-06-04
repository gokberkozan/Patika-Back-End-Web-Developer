import java.sql.*;

public class Main {

    public static final String DB_URL = "jdbc:mysql://localhost/jdbc";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        try {
            // Connecting to database
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

            // Creating a table
            st = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(255)," +
                    "position VARCHAR(255)," +
                    "salary DOUBLE)";
            st.execute(createTableSQL);

            // Adding data
            String insertDataSQL = "INSERT INTO employees (name, position, salary) VALUES " +
                    "('Stephen Curry', 'Point Guard', 2500.0)," +
                    "('Michael Jordan', 'Shooting Guard', 4000.0)," +
                    "('Lebron James', 'Small Forward', 3500.0)," +
                    "('Tim Duncan', 'Power Forward', 2000.0)," +
                    "('Kareem Abdul-Jabbar', 'Center', 3000.0)";
            st.execute(insertDataSQL);

            String selectDataSQL = "SELECT id, name, position, salary FROM employees";
            try (ResultSet rs = st.executeQuery(selectDataSQL)) {
                // Processing results
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String position = rs.getString("position");
                    double salary = rs.getDouble("salary");

                    // Printing
                    System.out.println("ID: " + id + ", Name: " + name + ", Position: " + position + ", Salary: " + salary);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}