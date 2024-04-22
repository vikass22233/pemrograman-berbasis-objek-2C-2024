/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull3;

/**
 *
 * @author User
 */
public class motor extends kendaraan{
    String tipe = "Premium";
    public motor(String merekkendaraan, String modelkendaraan, char statuskendaraan, int tahunkendaraan) {
        super("motor", merekkendaraan, modelkendaraan, statuskendaraan, tahunkendaraan);
    }   
    
    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("tipe : " + this.tipe);
         
    }
}

