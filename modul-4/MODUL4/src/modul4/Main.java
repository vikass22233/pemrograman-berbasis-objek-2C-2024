/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("======> Konversi satuan dari suhu, panjang, berat, dan waktu <=====");
            System.out.println("1. Suhu");
            System.out.println("2. Panjang");
            System.out.println("3. Berat");
            System.out.println("4. Waktu");
            System.out.print("Masukkan Input(1/2/3/4)");
            
         // Menerima input pilihan konversi
            System.out.print("Masukkan nomor jenis konversi: ");
            int choice = scanner.nextInt();


            // Menerima input nilai dan satuan awal
            System.out.print("Masukkan nilai: ");
            double nilai = scanner.nextDouble();
            System.out.print("Masukkan satuan awal: ");
            String dariSatuan = scanner.next();

            // Menerima input satuan akhir
            System.out.print("Masukkan satuan tujuan: ");
            String keSatuan = scanner.next();

            // Melakukan konversi sesuai pilihan pengguna

             Converter converter = null;

            if (dariSatuan.equalsIgnoreCase("meter") || dariSatuan.equalsIgnoreCase("centimeter")
                    || keSatuan.equalsIgnoreCase("meter") || keSatuan.equalsIgnoreCase("centimeter")) {
                converter = new ConverterPanjang();
            }else if (dariSatuan.equalsIgnoreCase("celcius") || dariSatuan.equalsIgnoreCase("fahrenheit") ||
                    keSatuan.equalsIgnoreCase("celcius") || keSatuan.equalsIgnoreCase("fahrenheit") ||
                    dariSatuan.equalsIgnoreCase("celcius") || dariSatuan.equalsIgnoreCase("kelvin") ||
                    keSatuan.equalsIgnoreCase("kelvin") || keSatuan.equalsIgnoreCase("celcius") ||
                    dariSatuan.equalsIgnoreCase("reamur") || dariSatuan.equalsIgnoreCase("kelvin") ||
                    keSatuan.equalsIgnoreCase("kelvin") || keSatuan.equalsIgnoreCase("reamur") ||
                    dariSatuan.equalsIgnoreCase("celcius") || dariSatuan.equalsIgnoreCase("reamur")||
                    keSatuan.equalsIgnoreCase("reamur") || keSatuan.equalsIgnoreCase("celcius") ||
                    dariSatuan.equalsIgnoreCase("reamur") || dariSatuan.equalsIgnoreCase("fahrenheit")){
                converter = new ConverterSuhu();   
            }else if (dariSatuan.equalsIgnoreCase("kilogram") || dariSatuan.equalsIgnoreCase("ton") || 
                    keSatuan.equals("kilogram") || keSatuan.equalsIgnoreCase("ton")) {
                converter = new ConverterBerat();
            } else if (dariSatuan.equalsIgnoreCase("menit") || dariSatuan.equalsIgnoreCase("jam") ||
                    keSatuan.equalsIgnoreCase("menit") || keSatuan.equalsIgnoreCase("jam") ||
                    dariSatuan.equalsIgnoreCase("jam") || dariSatuan.equalsIgnoreCase("detik")){
                converter = new ConverterWaktu ();
                
            } else {
                throw new IllegalArgumentException("Satuan tidak valid");
            }
            double hasil = converter.konversi(nilai, dariSatuan, keSatuan);
            System.out.println("Konversi dari " + nilai + " " + dariSatuan + " ke " + keSatuan + ": " + hasil);
        

        }
    }
