package PBO.Materi2.LatihanMandiri;

public class CobaNamaClass{
    String cobaVariabelPublic = "di Universitas Budi Luhur";

    public static void main(String[] args){
        CobaNamaClass objCNC = new CobaNamaClass();
        objCNC.cobaMethodProc();
        String variabelPenerima = objCNC.cobaMethodFunc();
        System.out.println(variabelPenerima+objCNC.cobaVariabelPublic);
    }
    void cobaMethodProc(){
        System.out.println("Senang Belajar JAVA "+cobaVariabelPublic);
    }
    String cobaMethodFunc(){
        String cobaVariabelLocal = "Senang Belajar JAVA ";
        return cobaVariabelLocal;
    }
}
