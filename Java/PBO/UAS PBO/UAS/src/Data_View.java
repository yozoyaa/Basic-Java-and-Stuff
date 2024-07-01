import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data_View extends JFrame {

    private JTable table;

    public Data_View() {
        setTitle("Data View for Matakuliah");
        setSize(500, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initializeUI();
        setVisible(true);
    }

    private void initializeUI() {
        String[] columnNames = {"Kode Matakuliah", "Nama", "SKS", "Kode Prasyarat"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
        table = new JTable(model);

        try {
            fillData(model);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error accessing the database: " + e.getMessage(),
                                          "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }

    private void fillData(DefaultTableModel model) throws SQLException, ClassNotFoundException {
        Connection conn = getConnection();
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM matakuliah";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            int kode = rs.getInt("Kode_Matakuliah");
            String nama = rs.getString("Nama");
            int sks = rs.getInt("SKS");
            String prasyarat = rs.getString("Kode_Prasyarat");

            model.addRow(new Object[]{kode, nama, sks, prasyarat});
        }

        rs.close();
        stmt.close();
        conn.close();
    }

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/DATAMHS?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "Fikriimamsyah12321";
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(url, user, pass);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Data_View::new);
    }
}
