package PBO.Materi3.Latihan;

public class OperatorTenery2 {
    public static void main(String[] args) {
        String NIM = "2311598756";
        String nama = "Fickry Imamsyah";
        byte nilAkhir = 98;
        System.out.println("NIM\t\t: " + NIM);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nilai Akhir\t: " + nilAkhir);
        System.out.print("Predikat\t: ");
        System.out.println(nilAkhir >= 85 ? "Memuaskan" : "Tidak Memuaskan");
    }
}
