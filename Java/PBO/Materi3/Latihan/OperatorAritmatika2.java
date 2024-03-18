package PBO.Materi3.Latihan;

public class OperatorAritmatika2 {
    public static void main(String[] args) {
        String nim = "2311500967";
        String nama = "Fickry";
        final int HargaSKS = 60000;
        byte totSKS = 21;

        System.out.println("NIM\t\t: " + nim);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Harga SKS\t: " + HargaSKS);
        System.out.println("Total SKS\t: " + totSKS);
        System.out.println("========================");
        int hargaTotal = HargaSKS * totSKS;
        System.out.println("total Bayar\t: " + hargaTotal);
        System.out.println("========================");
    }
}
