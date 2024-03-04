package PBO.Materi2.LatihanMandiri;

public class CobaNamaClass{
    // deklarasi variabel String
    String cobaVariabelPublic = "di Universitas Budi Luhur";

    public static void main(String[] args){
        // membuat objek dari class
        CobaNamaClass objCNC = new CobaNamaClass();
        objCNC.cobaMethodProc();
        String variabelPenerima = objCNC.cobaMethodFunc();
        System.out.println(variabelPenerima+objCNC.cobaVariabelPublic);
    }

    // method procedure
    void cobaMethodProc(){
        System.out.println("Senang Belajar JAVA "+cobaVariabelPublic);
    }

    // method function
    String cobaMethodFunc(){
        String cobaVariabelLocal = "Senang Belajar JAVA ";
        return cobaVariabelLocal;
    }
}
