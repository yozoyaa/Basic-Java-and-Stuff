package PBO.Materi1;

public class tulisanCetak2Baris_05 {
    public tulisanCetak2Baris_05() {
    }
    public void cetak(String a, String b) {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        tulisanCetak2Baris_05 obj05 = new tulisanCetak2Baris_05();
        obj05.cetak("Selamat Datang di Perkuliahan PBO", "Di Universitas Budi Luhur");
    }
}
