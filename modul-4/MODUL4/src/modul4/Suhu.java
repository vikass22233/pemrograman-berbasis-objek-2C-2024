/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;

/**
 *
 * @author User
 */
class ConverterSuhu extends Converter {
    @Override
    double konversi(double nilai, String dariSatuan, String keSatuan) {
        // Celsius ke Fahrenheit
        if (dariSatuan.equalsIgnoreCase("Celcius") && keSatuan.equalsIgnoreCase("Fahrenheit")) {
            return nilai * 9 / 5 + 32;
        }
        // Fahrenheit ke Celsius
        else if (dariSatuan.equalsIgnoreCase("Fahrenheit") && keSatuan.equalsIgnoreCase("Celcius")) {
            return (nilai - 32) * 5 / 9;
        }
        // Celcius ke Kelvin
        else if (dariSatuan.equalsIgnoreCase("Celcius") && keSatuan.equalsIgnoreCase("Kelvin")) {
            return nilai + 273;
        }
        // Kelvin ke Celcius
        else if (dariSatuan.equalsIgnoreCase("Kelvin") && keSatuan.equalsIgnoreCase("Celcius")) {
            return nilai - 273;
        }
        // Reamur ke kelvin
        else if (dariSatuan.equalsIgnoreCase("Reamur") && keSatuan.equalsIgnoreCase("Kelvin")) {
            return nilai * 5 / 4 + 273;
        }
        // kelvin ke reamur
        else if (dariSatuan.equalsIgnoreCase("Kelvin") && keSatuan.equalsIgnoreCase("Reamur")) {
            return (nilai  - 273) * 4 / 5 ;
        }
        // celcius ke reamur
        else if (dariSatuan.equalsIgnoreCase("celcius") && keSatuan.equalsIgnoreCase("Reamur")) {
            return nilai * 4 / 5;
        }
         // celcius ke reamur
        else if (dariSatuan.equalsIgnoreCase("Reamur") && keSatuan.equalsIgnoreCase("Celcius")) {
            return (nilai * 5 / 4);
        }
         // reamur ke fahrenheit
         else if (dariSatuan.equalsIgnoreCase("Reamur") && keSatuan.equalsIgnoreCase("fahrenheit")) {
            return nilai * 9 / 4 + 32;
        }else {
            throw new IllegalArgumentException("Satuan tidak valid untuk konversi suhu");
        }
    }
}

    







