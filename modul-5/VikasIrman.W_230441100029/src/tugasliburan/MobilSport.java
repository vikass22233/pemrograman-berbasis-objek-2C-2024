/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasliburan;

/**
 *
 * @author User
 */
public class MobilSport extends Mobil {
    String kelebihan = "Kapasitas penumpang lebih banyak";

    MobilSport(String merk, String model, int tahunkendaraan){
        super(merk, model, tahunkendaraan);
    }
    
     @Override
    void showfeature(){
        super.showfeature();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
    
    @Override
     void showfeature(int kecepatan){
        System.out.println("kecepatan mobil ini : " +kecepatan +"km/jam");
    }
}
