package PBO.Materi7.Latihan;

public class Cetak2 {
    //Main Class
    int no;
    String nama;
    //deklarasi variabel class
    Cetak2(int no, String nama) {
        no = no;
        nama = nama;
        //nama variabel class dan variabel atribut sama
        //tanpa keyword this
    }

    void tampil() {
        System.out.println(no + " " + nama);
        //menampilkan nilai/value yang di variabel no dan nama
    }

    public static void main(String[] okedroid) {
        //method void main utama
        Cetak c1 = new Cetak(43, "Fathurrahman");
        //membuat obyek baru dari constructor Cetak
        c1.tampil();
        //menampilkan method tampil()
    }
}
