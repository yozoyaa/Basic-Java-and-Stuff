package PBO.Silver;

import java.util.Scanner;

public class Kantin {

    private static final double DISCOUNT_STUDENT = 2000;
    private static final double DISCOUNT_100K = 2000;
    private static final double DISCOUNT_OLD_STUDENT_PERCENTAGE = 0.02;
    private static final int OLD_STUDENT_YEAR_THRESHOLD = 20;

    private static final double PRICE_NASI_GORENG = 15000;
    private static final double PRICE_MIE_GORENG = 13000;
    private static final double PRICE_MIE_REBUS = 10000;
    private static final double PRICE_SOTO_AYAM = 12000;
    private static final double PRICE_SOTO_DAGING = 15000;
    private static final double PRICE_SNACK_CHIKI = 2000;
    private static final double PRICE_SNACK_OTHERS = 1000;
    private static final double PRICE_DRINK = 5000;
    private static final double PRICE_AQUA_STUDENT = 4000;
    private static final double PRICE_AQUA_STAFF = 3000;

    private static int calculateAngkatan(String nipNim) {
        int yearOfEntry = Integer.parseInt(nipNim.substring(0, 2));
        return yearOfEntry;
    }

    private static String voucher = "";

    private static double[] calculatePrice(int foodChoice, int snackChoice, int drinkChoice, int foodQuantity, int snackQuantity, int drinkQuantity, String nipNim, String status) {
        double foodPrice = 0;
        switch (foodChoice) {
            case 1: foodPrice = PRICE_NASI_GORENG; break;
            case 2: foodPrice = PRICE_MIE_GORENG; break;
            case 3: foodPrice = PRICE_MIE_REBUS; break;
            case 4: foodPrice = PRICE_SOTO_AYAM; break;
            case 5: foodPrice = PRICE_SOTO_DAGING; break;
            default: foodPrice = 0; break;
        }

        double snackPrice = 0;
        switch (snackChoice) {
            case 1: snackPrice = PRICE_SNACK_CHIKI; break;
            case 2: case 3: snackPrice = PRICE_SNACK_OTHERS; break;
            default: snackPrice = 0; break;
        }

        double drinkPrice = 0;
        switch (drinkChoice) {
            case 1: case 2: case 3: case 4:
                drinkPrice = PRICE_DRINK; break;
            case 5:
                drinkPrice = status.equals("mahasiswa") ? PRICE_AQUA_STUDENT : PRICE_AQUA_STAFF; break;
            default: drinkPrice = 0; break;
        }

        double totalPrice = ((foodPrice * foodQuantity) + (snackPrice * snackQuantity) + (drinkPrice * drinkQuantity));
        double discountApplied = 0;

        if (status.equals("mahasiswa")) {
            discountApplied += DISCOUNT_STUDENT + (foodQuantity + snackQuantity + drinkQuantity);
            int yearOfEntry = calculateAngkatan(nipNim);
            if (yearOfEntry < OLD_STUDENT_YEAR_THRESHOLD) {
                discountApplied += totalPrice * DISCOUNT_OLD_STUDENT_PERCENTAGE;
            }
            totalPrice -= discountApplied;
        }

        if (totalPrice >= 100000) {
            discountApplied += DISCOUNT_100K;
            totalPrice -= DISCOUNT_100K;
        }

        if (foodQuantity >= 10) {
            voucher = "Voucher for one extra portion of " + foodChoice;
        }

        return new double[]{totalPrice, discountApplied};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeatProgram;

        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();
            
            System.out.println("NIP/NIM: ");
            String nipNim = scanner.nextLine();
            
            int angkatan = calculateAngkatan(nipNim);
            
            System.out.println("Status (a. Mahasiswa, b. Karyawan): ");
            String statusInput = scanner.nextLine();
            String status = statusInput.equalsIgnoreCase("a") ? "mahasiswa" : "karyawan";
            
            System.out.println("Pilih Makanan Berat (1-5, 0 untuk tidak makan): ");
            int foodChoice = scanner.nextInt();
            
            System.out.println("Masukkan jumlah Makanan Berat: ");
            int foodQuantity = scanner.nextInt();
            
            System.out.println("Pilih Camilan (1-3, 0 untuk tidak ngemil): ");
            int snackChoice = scanner.nextInt();
            
            System.out.println("Masukkan jumlah Camilan: ");
            int snackQuantity = scanner.nextInt();
            
            System.out.println("Pilih Minuman (1-5, 0 untuk tidak minum): ");
            int drinkChoice = scanner.nextInt();
            
            System.out.println("Masukkan jumlah Minuman: ");
            int drinkQuantity = scanner.nextInt();

            int totalPesanan = foodQuantity + snackQuantity + drinkQuantity;
            double[] priceAndDiscount = calculatePrice(foodChoice, snackChoice, drinkChoice, foodQuantity, snackQuantity, drinkQuantity, nipNim, status);
            double NewPriceAfterDiscount = priceAndDiscount[0];
            double discountApplied = priceAndDiscount[1];

            System.out.println("Total Bayar\t: " + NewPriceAfterDiscount);
            System.out.println("Masukkan jumlah uang: ");
            int uang = scanner.nextInt();

            double kembalian = uang - NewPriceAfterDiscount;
            scanner.nextLine();

            System.out.println("===========================================================================");
            System.out.println("Nama Pelanggan\t: " + namaPelanggan);
            System.out.println("NIP/NIM\t\t: " + nipNim);
            System.out.println("Angkatan\t: " + angkatan);
            System.out.println("Status\t\t: " + (status.equals("mahasiswa") ? "a. Mahasiswa" : "b. Karyawan"));
            System.out.println("\nPilih Makanan    :");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Mie Rebus");
            System.out.println("4. Soto Ayam");
            System.out.println("5. Soto Daging");
            System.out.println("6. Tidak makan");
            System.out.println("Masukkan Pilihan: " + foodChoice);
            System.out.println("Masukkan jumlah: " + (foodChoice != 6 ? foodQuantity : " - "));
            
            System.out.println("\nPilih Snack    :");
            System.out.println("1. Chiki");
            System.out.println("2. Lidi-Lidi");
            System.out.println("3. Kerupuk");
            System.out.println("4. Tidak ngemil");
            System.out.println("Masukkan Pilihan: " + snackChoice);
            System.out.println("Masukkan jumlah: " + (snackChoice != 6 ? snackQuantity : " - "));

            System.out.println("\nPilih Minuman    :");
            System.out.println("1. Es Teh Manis");
            System.out.println("2. Minuman Saset seduh");
            System.out.println("3. Kopi Panas");
            System.out.println("4. Teh Panas");
            System.out.println("5. Aqua");
            System.out.println("6. Tidak Minum");
            System.out.println("Masukkan Pilihan: " + drinkChoice);
            System.out.println("Masukkan jumlah: " + (drinkChoice != 6 ? drinkQuantity : " - "));
            System.out.println("===========================================================================");
            System.out.println("Total Pesanan: " + totalPesanan);
            System.out.println("Total harga\t: " + (NewPriceAfterDiscount + discountApplied));
            System.out.println("Discount: " + discountApplied);
            System.out.println("Voucher: " + voucher);
            System.out.println("===========================================================================");
            System.out.println("Total Bayar\t: " + NewPriceAfterDiscount);
            System.out.println("Uang\t\t: " + uang);

            if (uang < NewPriceAfterDiscount) {
                System.out.println("Uang tidak cukup untuk melakukan pembayaran.");
            }
            System.out.println("Kembalian\t: " + kembalian);

            System.out.println("Apakah Anda Ingin Mengulang menggunakan program ini ? (Y/T)");
            repeatProgram = scanner.nextLine();
            
        } while (repeatProgram.equalsIgnoreCase("Y"));

        scanner.close();
        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
