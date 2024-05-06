/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author User
 */
class ConverterBerat extends Converter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Kilogram ke Ton
        if (dariSatuan.equalsIgnoreCase("Kilogram") && keSatuan.equalsIgnoreCase("Ton")) {
            return nilai / 1000; // 1 ton = 1000 kg
        }
        // Ton ke Kilogram
        else if (dariSatuan.equalsIgnoreCase("Ton") && keSatuan.equalsIgnoreCase("Kilogram")) {
            return nilai * 1000; // 1 ton = 1000 kg
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi berat");
        }
    }
}

           
   
