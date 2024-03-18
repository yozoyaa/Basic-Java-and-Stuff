package PBO.Materi2.LatihanMandiri;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        String Nim = "", Nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUts = 0, nilUas = 0;

        try {
            Nim = JOptionPane.showInputDialog("Nim : ");
            Nama = JOptionPane.showInputDialog("Nama : ");
            nilAbsen = Byte.parseByte(JOptionPane.showInputDialog("Nilai Absen : "));

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        System.out.printf("Nama: %s Nim: %s NilAbsen: %s%n", Nama, Nim, nilAbsen);
        System.out.format("Nama: %s Nim: %s NilAbsen: %s%n", Nama, Nim, nilAbsen);
        System.out.println(String.join(" ", "Nama:", Nama, "Nim:", Nim, "NilAbsen:"));
        System.out.println("Nama : " + Nama + " Nim : " + Nim + " NilAbsen : " + nilAbsen);
    }
}
