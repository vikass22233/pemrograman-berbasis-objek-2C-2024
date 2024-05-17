/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasliburan;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("\nMasukkan Data Mobil");
            System.out.println("----- Tipe -----");
            System.out.println("1. MPV");
            System.out.println("2. SUV");
            System.out.println("3. Mobil Sport");
            System.out.println("4. Mobil Listrik");
            System.out.print("Nomer tipe     : ");
            String Tipe = input.nextLine();
            System.out.print("Merk           : ");
            String Merk = input.nextLine();
            System.out.print("Model          : ");
            String Model = input.nextLine();
            System.out.print("Tahun Produksi : ");
            int TahunProduksi = input.nextInt();

            if (Tipe.equalsIgnoreCase("1")) {
                Mobil mobil = new MPV(Merk, Model, TahunProduksi);
                mobil.showfeature();
                mobil.showfeature(6);
            } else if (Tipe.equalsIgnoreCase("2")) {
                Mobil mobil = new SUV(Merk, Model, TahunProduksi);
                mobil.showfeature();
                mobil.showfeature("merah");
            } else if (Tipe.equalsIgnoreCase("3")) {
                Mobil mobil = new MobilSport(Merk, Model, TahunProduksi);
                mobil.showfeature();
               mobil.showfeature(80);
            } else if (Tipe.equalsIgnoreCase("4")) {
                Mobil mobil = new MobilListrik(Merk, Model, TahunProduksi);
                mobil.showfeature();
                mobil.showfeature(50);
            } else {
                System.out.println("Jenis mobil tidak valid.");
                return;
            }
        }
}
