/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author User
 */
class ConverterWaktu extends Converter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Menit ke Jam
        if (dariSatuan.equalsIgnoreCase("menit") && keSatuan.equalsIgnoreCase("jam")) {
            return nilai / 60;
        }
        // Jam ke Menit
        else if (dariSatuan.equalsIgnoreCase("jam") && keSatuan.equalsIgnoreCase("menit")) {
            return nilai * 60;
        } 
        // Jam ke Detik
        else if (dariSatuan.equalsIgnoreCase("jam") && keSatuan.equalsIgnoreCase("detik")) {
            return nilai * 3600;
        } else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi waktu");
        }
    }
}

