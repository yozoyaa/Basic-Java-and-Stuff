package PBO.Materi2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContohBufferedReader {

    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat objek InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);

        // Membuat objek BufferedReader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi variabel nama dengan BufferedReader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        // Menampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);

    }

}
