package PBO.Materi6.Latihan;

public class A {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
            System.out.println("Perintah selanjutnya");
        } catch (Exception kesalahan) {
            System.out.println(kesalahan);
        }
    }
}
