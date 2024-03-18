/*Kelas dapat didefiniskan sebagai cetak biru (blueprint) atau prototipe/kerangka
yang mendefiniskan variabel-variabel (data) dan method-method (perilaku)
umum dari sebuah objek. Dengan kata lain kelas adalah sebuah kesatuan yang
terintegrasi antara method dan data yang mengacu pada suatu objek.
Dalam dunia permrograman, sebenarnya kelas tidak jauh berbeda dengan tipe
data sederhana. Perbedaannya, tipe data sederhana digunakan untuk
mendeklarasikan variabel ‘normal’, sedangkan kelas digunakan untuk
mendeklarasikan sebuah variabel yang berupa objek. Variabel yang berupa
objek ini sering disebut dengan referensi objek (object reference).
Pada saat kita membuat sebuah kelas baru. Sekali didefiniskan, maka tipe data
baru ini dapat digunakan untuk membuat suatu objek dari tipe tersebut.
Dengan kata lain, kelas adalah pola (template) untuk pembuatan objek, dan
objek adalah wujud nyata (instance) dari sebuah kelas.  */

package PBO.Materi3;

public class Mahasiswa {
    public String nama;
    public int nrp;
    Mahasiswa(String a, int b) {
        nama = a;
        nrp = b;
    }
    public void cetak() {
        System.out.println("Nama : " + nama + "Nrp : " + nrp);
    }
}

/*Setelah kita membuat sebuah kelas, untuk menggunakannya maka kita harus
membuat sebuah instance dari kelas tersebut. Berikut cara membuat objek dari
kelas: (Demo File)
 */