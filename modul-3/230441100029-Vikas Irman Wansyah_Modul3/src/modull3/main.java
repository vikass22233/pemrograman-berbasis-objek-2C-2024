/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modull3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int jumlahKendaraan;
         System.out.print("Masukkan jumlah kendaraan yang akan di input: ");
         jumlahKendaraan = input.nextInt();
         input.nextLine();
         kendaraan[] daftarKendaraan = new kendaraan[jumlahKendaraan];
         
         // Memasukkan data kendaraan
         for (int i = 0; i < jumlahKendaraan; i++) {
             System.out.println("\nMasukkan data kendaraan ke-" + (i + 1));
             System.out.print("Jenis Kendaraan (Mobil/Motor): ");
             String jenis = input.nextLine();
             System.out.print("Merek Kendaraan: ");
             String merek = input.nextLine();
             System.out.print("Model Kendaraan: ");
             String model = input.nextLine();
             System.out.print("Status Kendaraan(T/D:) ");
             char status = input.nextLine().charAt(0);
             System.out.print("Tahun Kendaraan: ");
             int tahun = input.nextInt();
             input.nextLine();
        

             if (jenis.equalsIgnoreCase("Mobil")) {
                 daftarKendaraan[i] = new mobil(merek, model, status, tahun);
             } else if (jenis.equalsIgnoreCase("Motor")) {
                 daftarKendaraan[i] = new motor(merek, model, status, tahun);
             } else {
                 System.out.println("Jenis kendaraan tidak valid.");
             }
         }

         
         // Menampilkan informasi kend2araan yang telah dimasukkan
        System.out.println("\nDaftar Kendaraan:");
        for (kendaraan kendaraan : daftarKendaraan) {
            kendaraan.displayInfo();
             if (kendaraan.getstatuskendaraan() == 'T'){
                System.out.println("Status Kendaraan: Tersedia");
            } else if (kendaraan.getstatuskendaraan() == 'D'){
                System.out.println("Status Kendaraan:  Disewakan");
        }
      }
   }
}
       
       
       
       