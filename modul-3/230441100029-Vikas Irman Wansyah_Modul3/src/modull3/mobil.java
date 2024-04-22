/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull3;

/**
 *
 * @author User
 */
public class mobil extends kendaraan{
    String tipe = "Premium";
    public mobil(String merekkendaraan, String modelkendaraan, char statuskendaraan, int tahunkendaraan) {
        super("mobil", merekkendaraan, modelkendaraan, statuskendaraan, tahunkendaraan);
    }   

    @Override
    public void displayInfo(){
         super.displayInfo();
         System.out.println("tipe : " + this.tipe);
         
    }
}