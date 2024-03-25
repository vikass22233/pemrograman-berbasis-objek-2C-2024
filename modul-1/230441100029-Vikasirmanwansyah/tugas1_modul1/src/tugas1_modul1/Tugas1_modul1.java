/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1_modul1;

class Manusia {
String nama,alamat;
int umur;

public void Berjalan(){
    System.out.println("Saya adalah " + nama + " saya " + "sedang Berjalan");
}
void Berlari(){
    System.out.println("kemudian " + nama + " sekarang " + " Sedang Berlari");
}
}
public class Tugas1_modul1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia ();
        Manusia manusia2 = new Manusia ();
        
        manusia1.nama = "Zefanya";
        manusia1.umur = 17;
        manusia1.alamat = "Candi ";
        System.out.println("nama : " + manusia1.nama);
        System.out.println("umur : " + manusia1.umur);
        System.out.println("alamat : " + manusia1.alamat);
        manusia1.Berjalan();
        manusia1.Berlari();
        
        manusia2.nama = "Vikaas";
        manusia2.umur = 20;
        manusia2.alamat = "Gedangan";
        System.out.println("nama : " + manusia2.nama);
        System.out.println("umur : " + manusia2.umur);
        System.out.println("alamat : " + manusia2.alamat);
        manusia2.Berjalan();
        manusia2.Berlari();
    }
    
}