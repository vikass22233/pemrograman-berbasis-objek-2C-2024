/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }
    
     public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        alamat = scanner.nextLine();
         System.out.println("Masukan jurusan: ");
        jurusan = scanner.nextLine();
    }
     
    public void inputJurusan(Scanner scanner) {
        System.out.println("Pilihan Jurusan:");
        System.out.println("41. Teknik Informatika");
        System.out.println("42. Teknik Industri");
        System.out.println("43. Teknik Elektro");
        System.out.println("44. Sistem Informasi");
        System.out.println("45. Teknik Mesin");
        System.out.println("46. Teknik Mekatronika");
        System.out.print("Masukkan Kode Jurusan (41-46): ");
        String kodeJurusan = scanner.nextLine();
    }

    public void displayData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }

    

