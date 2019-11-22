/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambing.global;

/**
 *
 * @author ASUS
 */
public class Latihan5KambingGlobal {
    // Variabel jumlahkambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing );
    }
    public static void main(String[] args) {
        Latihan5KambingGlobal kambingSusu = new Latihan5KambingGlobal();
        
        // Menampilkan jumlah kambing yang aada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah susu kambing
        kambingSusu.tambahKambing();
    }

    
}
