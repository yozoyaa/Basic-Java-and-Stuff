/*
 * Konstanta biasanya digunakan sebagai tempat/ruang di memori
 * untuk menyimpan data yang bersifat sementara dan nilai tetap
 * tidak berubah selama program berjalan
 * Konstanta berupa variabel yang di tambahkan dengan keyword final
 * Konstanta biasanya menggunakan huruf besar semuanya
 */

package PBO.Materi3;

public class Konstanta{

    public static void main(String[] args){
        // deklarasi variabel untuk menghitung keliling lingkaran
        double kel_lingkaran;
        // inisialisasi nilai r dengan nilai 20
        int r=20;

        // deklarasi nilai konstanta
        final double PHI=3.14;

        // proses keliling lingkaran
        kel_lingkaran= 2 * PHI * r;

        // cetak
        System.out.println("Keliling lingkaran="+kel_lingkaran);
    }
}