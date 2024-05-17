/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasliburan;

/**
 *
 * @author User
 */
public class SUV extends Mobil {
    String kelebihan = "Memiliki kemampuan off-road";

    SUV(String merk, String model, int tahunkendaraan){
        super(merk, model, tahunkendaraan);
    }
    
     @Override
    void showfeature(){
        super.showfeature();
        System.out.println("Kelebihan       : "+ this.kelebihan);
    }
    
    @Override
     void showfeature(String warna){
        System.out.println("warna mobil ini : " +warna);
    }
}

