package Silver;

import java.util.Scanner;

public class Silver_2311500967_Fickry_Imamsyah_AG {

    private static final double fi_ = 2000;
    private static final double ck_ = 0.02;
    private static final int ry_ = 20;

    private static final double sy_ = 15000;
    private static final double ah_ = 13000;
    private static final double fi_y = 10000;
    private static final double ck_y = 12000;
    private static final double ry_sy = 15000;
    private static final double sy_ah = 2000;
    private static final double fi_ck = 1000;
    private static final double ah_sy = 5000;
    private static final double ck_ry = 4000;
    private static final double fi_sy = 3000;

    private static int im_(String syah) {
        return Integer.parseInt(syah.substring(0, 2));
    }

    private static String sy_ck = "";

    private static double[] ck_sy(int sy_fi, int ah_ck, int ry_fi, int ck_ah, int sy_ry, int fi_ah, String im_sy, String sy_im) {
        double syah_fi = 0;
        switch (sy_fi) {
            case 1: syah_fi = sy_; break;
            case 2: syah_fi = ah_; break;
            case 3: syah_fi = fi_y; break;
            case 4: syah_fi = ck_y; break;
            case 5: syah_fi = ry_sy; break;
            default: syah_fi = 0; break;
        }

        double fi_ck_ = 0;
        switch (ah_ck) {
            case 1: fi_ck_ = sy_ah; break;
            case 2: case 3: fi_ck_ = fi_ck; break;
            default: fi_ck_ = 0; break;
        }

        double im_sy_ = 0;
        switch (ry_fi) {
            case 1: case 2: case 3: case 4:
                im_sy_ = ah_sy; break;
            case 5:
                im_sy_ = sy_im.equals("mahasiswa") ? ck_ry : fi_sy; break;
            default: im_sy_ = 0; break;
        }

        double total_sy = (syah_fi * ck_ah) + (fi_ck_ * sy_ry) + (im_sy_ * fi_ah);
        double applied_ck = 0;

        if (sy_im.equals("mahasiswa")) {
            int entry_sy = im_(im_sy);
            if (entry_sy < ry_) {
                applied_ck += total_sy * ck_;
            }
            total_sy -= applied_ck;
        }

        if (total_sy >= 100000) {
            applied_ck += fi_;
            total_sy -= fi_;
        }

        if (ck_ah >= 10) {
            sy_ck = "Mendapatkan Voucher, 1 Porsi gratis untuk makanan nomor " + sy_fi;
        } else {
            sy_ck = "Tidak Mendapatkan Voucher";
        }

        return new double[]{total_sy, applied_ck};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String im_ck;
    
        do {
            System.out.print("\033[H\033[2J");
            System.out.flush();
    
            System.out.println("Nama Pelanggan: ");
            String fi_im = sc.nextLine();
    
            System.out.println("NIP/NIM: ");
            String im_sy = sc.nextLine();
    
            int ck_sy = im_(im_sy);
    
            System.out.println("Status (a. Mahasiswa, b. Karyawan): ");
            String ry_im = sc.nextLine();
            String sy_im = ry_im.equalsIgnoreCase("a") ? "mahasiswa" : "karyawan";
    
            System.out.println("Pilihan Makanan");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Mie Rebus");
            System.out.println("4. Soto Ayam");
            System.out.println("5. Soto Daging");
            System.out.println("6. Tidak makan");
            System.out.println("Pilih Makanan Berat (1-5, 0 untuk tidak makan): ");
            int sy_fi = sc.nextInt();
    
            System.out.println("Masukkan jumlah Makanan Berat: ");
            int ck_ah = sc.nextInt();
    
            System.out.println("Pilihan Snack");
            System.out.println("1. Chiki");
            System.out.println("2. Lidi-Lidi");
            System.out.println("3. Kerupuk");
            System.out.println("4. Tidak ngemil");
            System.out.println("Pilih Camilan (1-3, 0 untuk tidak ngemil): ");
            int ah_ck = sc.nextInt();
    
            System.out.println("Masukkan jumlah Camilan: ");
            int sy_ry = sc.nextInt();
    
            System.out.println("Pilihan Minuman");
            System.out.println("1. Es Teh Manis");
            System.out.println("2. Minuman Saset seduh");
            System.out.println("3. Kopi Panas");
            System.out.println("4. Teh Panas");
            System.out.println("5. Aqua");
            System.out.println("6. Tidak Minum");
            System.out.println("Pilih Minuman (1-5, 0 untuk tidak minum): ");
            int ry_fi = sc.nextInt();
    
            System.out.println("Masukkan jumlah Minuman: ");
            int fi_ah = sc.nextInt();
            sc.nextLine();
    
            double[] fi_syah = ck_sy(sy_fi, ah_ck, ry_fi, ck_ah, sy_ry, fi_ah, im_sy, sy_im);
            double syah_ah = fi_syah[0];
            double ck_ry = fi_syah[1];
            
            System.out.println("Total Bayar\t: " + syah_ah);
            double ah_fi;
            int sy_ry_;

            do {
                System.out.println("Masukkan jumlah uang: ");
                sy_ry_ = sc.nextInt();
                sc.nextLine();
    
                ah_fi = sy_ry_ - syah_ah;
                if (ah_fi < 0) {
                    System.out.println("Uang yang dimasukkan tidak cukup. Silakan masukkan jumlah yang cukup.");
                }
            } while (ah_fi < 0);
    
            boolean sy_di = syah_ah + ck_ry >= 100000;
    
            System.out.println("=".repeat(50));
            System.out.println("Nama Pelanggan\t: " + fi_im);
            System.out.println("NIP/NIM\t\t: " + im_sy);
            if (sy_im.equals("mahasiswa")) {
                System.out.println("Angkatan\t: " + ck_sy);
            } else {
                System.out.println("Angkatan\t: Pembeli adalah karyawan");
            }
            System.out.println("Status\t\t: " + (sy_im.equals("mahasiswa") ? "Mahasiswa" : "Karyawan"));
            System.out.println("=".repeat(50));
            System.out.println("\nPilihan Makanan :");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Mie Rebus");
            System.out.println("4. Soto Ayam");
            System.out.println("5. Soto Daging");
            System.out.println("6. Tidak makan");
            System.out.println("Pilihan Makanan Nomor\t\t: " + sy_fi);
            System.out.println("Jumlah Makanan Yang di pesan\t: " + (sy_fi != 6 ? ck_ah : " - "));
    
            System.out.println("\nPilihan Snack :");
            System.out.println("1. Chiki");
            System.out.println("2. Lidi-Lidi");
            System.out.println("3. Kerupuk");
            System.out.println("4. Tidak ngemil");
            System.out.println("Pilihan Snack Nomor\t\t: " + ah_ck);
            System.out.println("Jumlah Snack Yang di pesan\t: " + (ah_ck != 4 ? sy_ry : " - "));
    
            System.out.println("\nPilihan Minuman :");
            System.out.println("1. Es Teh Manis");
            System.out.println("2. Minuman Saset seduh");
            System.out.println("3. Kopi Panas");
            System.out.println("4. Teh Panas");
            System.out.println("5. Aqua");
            System.out.println("6. Tidak Minum");
            System.out.println("Pilihan Minuman Nomor\t\t: " + ry_fi);
            System.out.println("Jumlah Minuman Yang di pesan\t: " + (ry_fi != 6 ? fi_ah : " - "));
            System.out.println("=".repeat(50));
            System.out.println("Jumlah Pesanan\t: " + (ck_ah + sy_ry + fi_ah));
            System.out.println("Total harga\t: " + (syah_ah + ck_ry));

            if (sy_im.equals("mahasiswa")) {
                if (ck_sy < 20) {
                    if (sy_di) {
                        System.out.println("Discount\t: 2% dan potongan harga 2000");
                    } else {
                        System.out.println("Discount\t: 2%");
                    }
                } else {
                    if (sy_di) {
                        System.out.println("Discount\t: potongan harga 2000");
                    } else {
                        System.out.println("Discount\t: Mahasiswa angkatan tersebut tidak mendapatkan discount.");
                    }
                }
            } else {
                if (sy_di) {
                    System.out.println("Discount\t: potongan harga 2000");
                } else {
                    System.out.println("Discount\t: Tidak Mendapatkan Discount");
                }
            }
    
            System.out.println("Voucher\t\t: " + sy_ck);
            System.out.println("Potongan\t: " + ck_ry);
            System.out.println("=".repeat(50));
            System.out.println("Total Bayar\t: " + syah_ah);
            System.out.println("Uang\t\t: " + sy_ry_);
            if (sy_ry_ < syah_ah) {
                System.out.println("Uang tidak cukup untuk melakukan pembayaran.");
            }
            System.out.println("Kembalian\t: " + ah_fi);
            System.out.println("=".repeat(50));
            System.out.println("Programer : ");
            System.out.println("NIM     : " + im_sy);
    
            if (im_sy.equals("2311500967")) {
                System.out.println("Nama    : Fickry Imamsyah");
            } else {
                System.out.println("Nim Tersebut adalah nim pelanggan.");
            }
    
            System.out.println("Apakah Anda Ingin Mengulang menggunakan program ini ? (Y/T)");
            im_ck = sc.nextLine();
    
        } while (im_ck.equalsIgnoreCase("Y"));
    
        sc.close();
        System.out.println("Terima kasih telah menggunakan program ini.");
    }
}
