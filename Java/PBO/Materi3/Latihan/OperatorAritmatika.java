package PBO.Materi3.Latihan;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        int angka1, angka2, hasil;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Angka-1 :");
        angka1 = keyboard.nextInt();
        System.out.print("Input Angka-2 :");
        angka2 = keyboard.nextInt();

        hasil = (Integer)(angka1 + angka2);

        // penjumlahan hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);
    }
}
