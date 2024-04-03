package PBO.Materi5.Latihan;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        double pulsaBalance = 50000;
        String cekKuota = "50 Gb";
        String cekPromo = "Promo Bulan Ini bla bla bla";

        System.out.println("Menu:");
        System.out.println("1. Cek Pulsa");
        System.out.println("2. Cek Kuota Data");
        System.out.println("3. Cek Promo");
        System.out.print("Masukkan pilihan Anda (1-3): ");
        userChoice = scanner.nextInt();
        scanner.nextLine();

        if (userChoice == 1) {
            System.out.println("Nominal pulsa Anda saat ini adalah: Rp " + pulsaBalance);
            System.out.print("Apakah Anda ingin membeli pulsa? (ya/tidak): ");
            String beliPulsa = scanner.nextLine();
            if (beliPulsa.equalsIgnoreCase("ya")) {
                System.out.println("Pilih nominal pulsa yang ingin Anda beli:");
                System.out.println("1. Rp 10.000");
                System.out.println("2. Rp 25.000");
                System.out.println("3. Rp 50.000");
                System.out.println("4. Rp 100.000");
                System.out.print("Masukkan pilihan Anda (1-4): ");
                int pilihanPulsa = scanner.nextInt();
                scanner.nextLine();
                if (pilihanPulsa == 1) {
                    System.out.println("Anda Success Membeli pulsa seharga Rp 10.000");
                } else if (pilihanPulsa == 2) {
                    System.out.println("Anda Success Membeli pulsa seharga Rp 25.000");
                } else if (pilihanPulsa == 3) {
                    System.out.println("Anda Success Membeli pulsa seharga Rp 50.000");
                } else if (pilihanPulsa == 4) {
                    System.out.println("Anda Success Membeli pulsa seharga Rp 10.000");
                } else {
                    System.out.println("Not Found");
                }
            } else {
                System.out.println("Anda memilih untuk tidak membeli pulsa.");
            }
        } else if (userChoice == 2) {
            System.out.println("Kuota Tersisa anda sekitar: " + cekKuota);
            System.out.print("Apakah Anda ingin membeli kuota data? (ya/tidak): ");
            String beliKuota = scanner.nextLine();
            if (beliKuota.equalsIgnoreCase("ya")) {
                System.out.println("Pilih nominal kuota yang ingin Anda beli:");
                System.out.println("1. 12Gb/7 Rp. 45.000");
                System.out.println("2. 24Gb/7 Rp. 60.000");
                System.out.println("3. 32Gb/7 Rp. 75.000");
                System.out.println("4. 48Gb/7 Rp. 80.000");
                System.out.print("Masukkan pilihan Anda (1-4): ");
                int pilihanKuota = scanner.nextInt();
                scanner.nextLine();
                if (pilihanKuota == 1) {
                    System.out.println("Anda Success Membeli Kuota seharga Rp 45.000");
                } else if (pilihanKuota == 2) {
                    System.out.println("Anda Success Membeli Kuota seharga Rp 60.000");
                } else if (pilihanKuota == 3) {
                    System.out.println("Anda Success Membeli Kuota seharga Rp 75.000");
                } else if (pilihanKuota == 4) {
                    System.out.println("Anda Success Membeli Kuota seharga Rp 80.000");
                } else {
                    System.out.println("Not Found");
                }
            } else {
                System.out.println("Anda memilih untuk tidak membeli kuota data.");
            }
        } else if (userChoice == 3) {
            System.out.println(cekPromo);
            System.out.print("Apakah Anda tertarik dengan promo ini? (ya/tidak): ");
            String tertarikPromo = scanner.nextLine();
            if (tertarikPromo.equalsIgnoreCase("ya")) {
                System.out.println("Pilih paket promo yang ingin Anda beli:");
                System.out.println("1. Paket Kuota 12gb/7 Rp. 30.000");
                System.out.println("2. Paket Kuota 24gb/30 Rp. 40.000");
                System.out.println("3. Paket Kuota 32gb/30 Rp. 50.000");
                System.out.println("4. Paket Kuota 48gb/30 Rp. 60.000");
                System.out.print("Masukkan pilihan Anda (1-4): ");
                int pilihanPromo = scanner.nextInt();
                scanner.nextLine();
                if (pilihanPromo == 1) {
                    System.out.println("Anda Success Membeli Promo Kuota seharga Rp 30.000");
                } else if (pilihanPromo == 2) {
                    System.out.println("Anda Success Membeli Promo Kuota seharga Rp 40.000");
                } else if (pilihanPromo == 3) {
                    System.out.println("Anda Success Membeli Promo Kuota seharga Rp 50.000");
                } else if (pilihanPromo == 4) {
                    System.out.println("Anda Success Membeli Promo Kuota seharga Rp 60.000");
                } else {
                    System.out.println("Not Found");
                }
            } else {
                System.out.println("Anda memilih untuk tidak mengambil promo.");
            }
        } else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        System.out.println();
        scanner.close();
    }
}
