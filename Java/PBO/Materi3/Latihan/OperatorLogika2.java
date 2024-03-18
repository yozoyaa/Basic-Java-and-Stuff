package PBO.Materi3.Latihan;

public class OperatorLogika2 {
    public static void main(String[] args) {
        String NIM = "231184984";
        String nama = "Yoz";
        byte nilAkhir = 85;
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Akhir\t: " + nilAkhir);
        if (nilAkhir >= 85 && nilAkhir <= 100) {
            System.out.println("Grade\t\t: A");
        } else {
            System.out.println("Grade\t\t: E");
        }
    }
}
