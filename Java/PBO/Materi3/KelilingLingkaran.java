/* Double
Tipe ini mengandung tingkat ketelitian ganda atau presisi ganda (double
precision) dan menggunakan ruang penyimpanan 64-bit untuk menyimpan nilai.
Tipe double tentu lebih cepat untuk melakukan perhitungan-perhitungan
matematis daripad tipe float. Untuk perhitungan yang bersifat bilangan riil dan
menghasilkan hasil yang lebih akurat, maka lebih baik menggunakan tipe
double.  */

package PBO.Materi3;

public class KelilingLingkaran {
    public static void main(String[] args) {
        double pi = 3.1416;
        double r = 2.12;
        double keliling;
        keliling = 2 * pi * r;
        System.out.println("Keliling linkaran Adalah : " + keliling);
    }
}
