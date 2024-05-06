/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author User
 */
class ConverterPanjang extends Converter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Meter ke Centimeter
        if (dariSatuan.equalsIgnoreCase("Meter") && keSatuan.equalsIgnoreCase("Centimeter")) {
            return nilai * 100;
        }
        // Centimeter ke Meter
        else if (dariSatuan.equalsIgnoreCase("Centimeter") && keSatuan.equalsIgnoreCase("Meter")) {
            return nilai / 100;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi panjang");
        }
    }
}