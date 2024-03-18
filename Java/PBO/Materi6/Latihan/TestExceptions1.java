package PBO.Materi6.Latihan;

public class TestExceptions1 {
    public static void main(String[] args) {
        try {
            int bil = 10;
            System.out.println(bil/0);
        } catch (Exception xx) {
            System.out.println(xx.getMessage());
        }
    }
}
