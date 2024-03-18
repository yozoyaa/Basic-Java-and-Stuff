package PBO.Materi2;

import java.io.Console;

public class InputConsole {
    public static void main(String[] args) {
        Console con = System.console();
        
        // Check if a console is available
        if (con != null) {
            String nama;
            int usia;
            
            // Directly using Console's readLine method to prompt user input
            nama = con.readLine("Inputkan nama: ");
            String usiaStr = con.readLine("Inputkan usia: ");
            usia = Integer.parseInt(usiaStr);
            
            // Mengampilkan isi variabel nama dan usia
            System.out.println("Nama kamu adalah: " + nama);
            System.out.println("Saat ini berusia " + usia + " tahun");
        } else {
            System.out.println("No console available. Please run this program from a command line terminal.");
        }
    }
}
