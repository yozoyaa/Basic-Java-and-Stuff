package PBO.Materi2.LatihanMandiri;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        int nilAbsen = 0, nilTugas = 0, nilUts = 0, Total = 0;

        try {
            nilAbsen = Integer.parseInt(JOptionPane.showInputDialog("Nilai Absen : "));
            nilTugas = Integer.parseInt(JOptionPane.showInputDialog("Nilai Tugas : "));
            nilUts = Integer.parseInt(JOptionPane.showInputDialog("Nilai UTS : "));

            Total = (int) (nilAbsen + nilTugas + nilUts);

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        System.out.println("Nilai Absen: " + nilAbsen + ", Nilai Tugas: " + nilTugas + ", Nilai UTS: " + nilUts + ", Total: " + Total);
    }
}
