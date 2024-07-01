import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_Table {
    static final String DB_URL = "jdbc:mysql://localhost:3306/DATAMHS?useSSL=false&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "Fikriimamsyah12321";

    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();) {
            String sql = "CREATE TABLE matakuliah (" +
                         "Kode_Matakuliah INT PRIMARY KEY," +
                         "Nama VARCHAR(45)," +
                         "SKS INT," +
                         "Kode_Prasyarat VARCHAR(10))";
            stmt.executeUpdate(sql);
            System.out.println("Table created successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Failed to create the table.");
        }
    }
}
