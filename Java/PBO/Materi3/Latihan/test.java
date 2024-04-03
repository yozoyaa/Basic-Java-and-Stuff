package PBO.Materi3.Latihan;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan Nim: ");
        String NIM = scanner.nextLine();
        
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukan nilai Tugas: ");
        double nilTugas = scanner.nextDouble();
        
        System.out.print("Masukan nilai UTS: ");
        double nilUTS = scanner.nextDouble();
        
        System.out.print("Masukan nilai UAS: ");
        double nilUAS = scanner.nextDouble();
        
        scanner.close();
        
        double nilAkhir = (nilTugas * 0.3) + (nilUTS * 0.4) + (nilUAS * 0.4);
        
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Akhir\t: " + nilAkhir);
        
        String grade;
        if (nilAkhir >= 85) {
            grade = "A";
        } else if (nilAkhir >= 80) {
            grade = "A-";
        } else if (nilAkhir >= 75) {
            grade = "B+";
        } else if (nilAkhir >= 70) {
            grade = "B";
        } else if (nilAkhir >= 65) {
            grade = "B-";
        } else if (nilAkhir >= 60) {
            grade = "C+";
        } else if (nilAkhir >= 55) {
            grade = "C";
        } else if (nilAkhir >= 50) {
            grade = "C-";
        } else if (nilAkhir >= 45) {
            grade = "D";
        } else {
            grade = "E";
        }
        
        System.out.println("Grade\t\t: " + grade);
    }
}