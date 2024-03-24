/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author SMK_BIM
 */
public class Manusia {

    // Atribut
    private String nama;
    private int umur;
    private String alamat;
    public Manusia(){
        
        System.out.println("Nama Saya= Adzka");
        System.out.println("Umur Saya = 19");
        System.out.println("Alamat Saya = Jombang");
        
        
    }
//    metode berjalan
    public static void berjalan(){
        System.out.println(" Bisa Berjalan");
    }
//    metode berlari
    public static void Berlari(){
        System.out.println(" Bisa Berlari");
    }
    
    public static void main(String[] args){
    Manusia obj = new Manusia();
    obj.berjalan();
    obj.Berlari();
   }
}
    
//    // Konstruktor
//    public Manusia(String nama, int umur, String alamat) {
//        this.nama = nama;
//        this.umur = umur;
//        this.alamat = alamat;
//    }
//    
//    // Metode berjalan
//    public void berjalan() {
//        System.out.println(nama + " sedang berjalan.");
//    }
//    
//    // Metode berlari
//    public void berlari() {
//        System.out.println(nama + " sedang berlari.");
//    }
//    
//    // Getter untuk nama
//    public String getnama() {
//        return nama;
//    }
//    
//    // Getter untuk umur
//    public int getUmur() {
//        return umur;
//    }
//    
//    // Getter untuk alamat
//    public String getAlamat() {
//        return alamat;
//    }
//}

//    // Atribut
//    private String nama;
//    private int umur;
//    private String alamat;
//    
//    public Manusia(){
//        System.out.println("Nama Saya= Adzka");
//        System.out.println("Umur Saya = 19");
//        System.out.println("Alamat Saya = Jombang");
//        
//        
//    }
////    metode berjalan
//    public static void berjalan(){
//        System.out.println(" Bisa Berjalan");
//    }
//    public static void Berlari(){
//        System.out.println(" Bisa Berlari");
//    }
//    
//    public static void main(String[] args){
//    Manusia obj = new Manusia();
//    obj.berjalan();
//    obj.Berlari();
//    }
//}