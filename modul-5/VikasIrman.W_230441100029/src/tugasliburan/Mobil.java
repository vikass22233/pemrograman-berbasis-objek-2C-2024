/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasliburan;

/**
 *
 * @author User
 */
public class Mobil {
    String merk,model;
    int tahunkendaraan;
    
    Mobil(String merk, String model, int tahunkendaraan){
       this.merk = merk;
       this.model = model;
       this.tahunkendaraan = tahunkendaraan;
    }
       
    void showfeature(){
        System.out.println("\nInformasi Kendaraaan");
        System.out.println("merk               :" +this.merk);
        System.out.println("model              :" +this.model);
        System.out.println("tahunkendaraan     :" +this.tahunkendaraan);
    }

    void showfeature(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void showfeature(String i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
}
