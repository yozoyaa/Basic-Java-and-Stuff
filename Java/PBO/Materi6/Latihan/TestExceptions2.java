package PBO.Materi6.Latihan;

public class TestExceptions2 {
    public static void main(String[] args) {
        try {
            System.out.println(args[1]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Data pada array args tidak ditemukan");
        }
    }
}
