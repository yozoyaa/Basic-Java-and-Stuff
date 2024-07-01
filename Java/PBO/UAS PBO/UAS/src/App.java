import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.sql.*;

public class App extends JFrame {

    private JTextField txtKodeMatakuliah, txtNama, txtSKS, txtKodePrasyarat;
    private JButton btnTambah, btnUbah, btnHapus, btnBersih;

    public App() {
        setTitle(":: Form Entri Data Matakuliah ::");
        setSize(450, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtKodeMatakuliah = addTextField("Kode Matakuliah:", formPanel);
        txtNama = addTextField("Nama:", formPanel);
        txtSKS = addTextField("SKS:", formPanel);
        txtKodePrasyarat = addTextField("Kode Prasyarat:", formPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnTambah = new JButton("Tambah");
        btnUbah = new JButton("Ubah");
        btnHapus = new JButton("Hapus");
        btnBersih = new JButton("Bersih");

        btnTambah.addActionListener(e -> addData());
        btnUbah.addActionListener(e -> updateData());
        btnHapus.addActionListener(e -> deleteData());
        btnBersih.addActionListener(e -> clearFields());

        buttonPanel.add(btnTambah);
        buttonPanel.add(btnUbah);
        buttonPanel.add(btnHapus);
        buttonPanel.add(btnBersih);
        toggleButtonState();

        add(formPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);

        setResizable(true);
        setVisible(true);
    }

    private JTextField addTextField(String label, JPanel panel) {
        JLabel lbl = new JLabel(label);
        JTextField txt = new JTextField();
        panel.add(lbl);
        panel.add(txt);
        txt.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { toggleButtonState(); }
            public void removeUpdate(DocumentEvent e) { toggleButtonState(); }
            public void insertUpdate(DocumentEvent e) { toggleButtonState(); }
        });
        return txt;
    }

    private void toggleButtonState() {
        boolean enabled = !txtKodeMatakuliah.getText().trim().isEmpty() &&
                          !txtNama.getText().trim().isEmpty() &&
                          !txtSKS.getText().trim().isEmpty() &&
                          !txtKodePrasyarat.getText().trim().isEmpty();
        btnTambah.setEnabled(enabled);
        btnUbah.setEnabled(enabled);
        btnHapus.setEnabled(enabled);
    }

    private void addData() {
        String kode = txtKodeMatakuliah.getText().trim();
        String nama = txtNama.getText().trim();
        String sks = txtSKS.getText().trim();
        String prasyarat = txtKodePrasyarat.getText().trim();
    
        String checkSql = "SELECT COUNT(*) FROM matakuliah WHERE Kode_Matakuliah = ? AND Nama = ? AND SKS = ?";
    
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
            
            checkStmt.setInt(1, Integer.parseInt(kode));
            checkStmt.setString(2, nama);
            checkStmt.setInt(3, Integer.parseInt(sks));
            
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                JOptionPane.showMessageDialog(this, "Duplicate Data Found, Please Input new data", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "INSERT INTO matakuliah (Kode_Matakuliah, Nama, SKS, Kode_Prasyarat) VALUES (?, ?, ?, ?)";
                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    stmt.setInt(1, Integer.parseInt(kode));
                    stmt.setString(2, nama);
                    stmt.setInt(3, Integer.parseInt(sks));
                    stmt.setString(4, prasyarat);
    
                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error menambahkan data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void updateData() {
        String kode = txtKodeMatakuliah.getText().trim();
        String nama = txtNama.getText().trim();
        String sks = txtSKS.getText().trim();
        String prasyarat = txtKodePrasyarat.getText().trim();

        String sql = "UPDATE matakuliah SET SKS = ?, Kode_Prasyarat = ? WHERE Kode_Matakuliah = ? AND Nama = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, Integer.parseInt(sks));
            stmt.setString(2, prasyarat);
            stmt.setInt(3, Integer.parseInt(kode));
            stmt.setString(4, nama);

            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error mengubah data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void deleteData() {
        String kode = txtKodeMatakuliah.getText().trim();
        String nama = txtNama.getText().trim();
        String sks = txtSKS.getText().trim();

        String sql = "DELETE FROM matakuliah WHERE Kode_Matakuliah = ? AND Nama = ? AND SKS = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, Integer.parseInt(kode));
            stmt.setString(2, nama);
            stmt.setInt(3, Integer.parseInt(sks));

            int affectedRows = stmt.executeUpdate();
            if (affectedRows > 0) {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clearFields();
            } else {
                JOptionPane.showMessageDialog(this, "Data tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error menghapus data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        txtKodeMatakuliah.setText("");
        txtNama.setText("");
        txtSKS.setText("");
        txtKodePrasyarat.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(App::new);
    }
}

class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/DATAMHS?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "Fikriimamsyah12321";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
