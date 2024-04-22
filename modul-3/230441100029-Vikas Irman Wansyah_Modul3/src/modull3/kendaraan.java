/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull3;
/**
 *
 * @author User
 */
public class kendaraan {
    String jeniskendaraan;
    String merekkendaraan;
    String modelkendaraan;
    char statuskendaraan;
    int tahunkendaraan;
    
     // Konstruktor
    kendaraan(String jeniskendaraan, String merekkendaraan, String modelkendaraan, char statuskendaraan, int tahunkendaraan) {
        this.jeniskendaraan    = jeniskendaraan;
        this.merekkendaraan    = merekkendaraan;
        this.modelkendaraan    = modelkendaraan;
        this.statuskendaraan   = statuskendaraan;
        this.tahunkendaraan    = tahunkendaraan;
    }
   
   
    // Menampilkan informasi kendaraan
    void displayInfo() {
        System.out.println("jenis Kendaraan: " + jeniskendaraan);
        System.out.println("merekkendaraan: " + merekkendaraan);
        System.out.println("modelkendaraan: " + modelkendaraan);
        System.out.println("tahun kendaraan: " + tahunkendaraan);
     }  
    
    // Getter untuk nama
    char getstatuskendaraan() {
        return statuskendaraan;
    }
}
    

   