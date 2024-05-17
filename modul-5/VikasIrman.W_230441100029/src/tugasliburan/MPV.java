/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasliburan;

/**
 *
 * @author User
 */
public class MPV extends Mobil {
    String kelebihan = "Kapasitas penumpang lebih banyak";

    MPV(String merk, String model, int tahunkendaraan){
        super(merk, model, tahunkendaraan);
    }
    
     @Override
    void showfeature(){
        super.showfeature();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
    
    @Override
     void showfeature(int seatbelt){
        System.out.println("seatbelt mobil ini : " +seatbelt);
    }
}

