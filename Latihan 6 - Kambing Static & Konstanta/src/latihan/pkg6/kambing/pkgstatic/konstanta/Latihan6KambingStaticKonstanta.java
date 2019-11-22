/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg6.kambing.pkgstatic.konstanta;

/**
 *
 * @author Muhammad Nandi Junaedi
 */
public class Latihan6KambingStaticKonstanta {

   // Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
}
    class KambingStatic {
        //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
    Latihan6KambingStaticKonstanta.jumlahKambing =485000;
    System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Latihan6KambingStaticKonstanta.jumlahKambing);
    }
}
        
    
     
 
