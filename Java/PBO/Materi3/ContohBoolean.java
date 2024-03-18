/*Tipe Boolean adalah tipe data yang digunakan untuk menampung nilai
logika, yaitu nilai yang hanya memiliki dua buah kemungkinan (benar atau
salah). Tipe ini ditandai dengan kata kunci Boolean. Dalam bahasa Java, nilai
benar dipresentasikan dengan kata kunci true dan nilai salah dengan kata kunci false.  */

package PBO.Materi3;

public class ContohBoolean {
    public static void main(String[] args) {
        boolean a = true;
        if (a) {
            System.out.println("Running");
        }
        if (!a) {
            System.out.println("Failed");
        }
    }
}
