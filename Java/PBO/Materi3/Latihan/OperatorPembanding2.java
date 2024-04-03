package PBO.Materi3.Latihan;

public class OperatorPembanding2 {
    public static void main(String[] args) {
        String NIM = "2311500967";
        String nama = "Fickry";
        byte nilAkhir = 98;
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Akhir\t: " + nilAkhir);
        if (nilAkhir >= 85) {
            System.out.println("Predikat\t: Sangat Memuaskan");
        } else {
            System.out.println("Predikat\t: Tidak Memuaskan");
        }
    }
}
