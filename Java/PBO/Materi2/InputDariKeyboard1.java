package PBO.Materi2;

// Input from console

import java.io.*;

public class InputDariKeyboard1 {
    public static void main(String[] args) {
        String Nim = "", Nama = "";
        byte nilAbsen = 0, nilTugas = 0, nilUts = 0, nilUas = 0;
        BufferedReader objinput = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("=".repeat(50));
            System.out.println("\t\t Input.Data.Mahasiswa");
            System.out.println("=".repeat(50));
            System.out.println("Nim\t\t: ");            Nim = objinput.readLine();
            System.out.println("Nama\t\t: ");           Nama = objinput.readLine();
            System.out.println("Nilai Absen \t: ");     nilAbsen = Byte.parseByte(objinput.readLine());
            System.out.println("Nilai Tugas \t: ");     nilTugas = Byte.parseByte(objinput.readLine());
            System.out.println("Nilai Uts \t: ");       nilUts = Byte.parseByte(objinput.readLine());
            System.out.println("Nilai Uas \t: ");       nilUas = Byte.parseByte(objinput.readLine());
            System.out.println("=".repeat(50));

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
