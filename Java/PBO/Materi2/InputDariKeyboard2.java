package PBO.Materi2;

import javax.swing.*;

// input from GUI

import javax.swing.JOptionPane;

public class InputDariKeyboard2 {
    public static void main(String[] args) {
        String Nim = "", Nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUts = 0, nilUas = 0;

        try {
            Nim = JOptionPane.showInputDialog("Nim : ");
            Nama = JOptionPane.showInputDialog("Nama : ");
            nilAbsen = Byte.parseByte(JOptionPane.showInputDialog("Nilai Absen : "));
            nilTugas = Byte.parseByte(JOptionPane.showInputDialog("Nilai Tugas : "));
            nilUts = Byte.parseByte(JOptionPane.showInputDialog("Nilai UTS : "));
            nilUas = Byte.parseByte(JOptionPane.showInputDialog("Nilai UAS : "));

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
        System.out.println("=".repeat(50));
        System.out.println("\t\t Cetak Data Mahasiswa");
        System.out.println("=".repeat(50));
        System.out.println("NIM \t\t: " + Nim);
        System.out.println("Nama \t\t: " + Nama);
        System.out.println("Nilai Absen \t: " + nilAbsen);
        System.out.println("Nilai Tugas \t: " + nilTugas);
        System.out.println("Nilai UTS \t: " + nilUts);
        System.out.println("Nilai UAS \t: " + nilUas);
        System.out.println("=".repeat(50));
    }
}
