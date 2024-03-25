/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2.modul1;
import java.util.Scanner;
/**
 *
 * @author User
 */

public class tugas2_modul1 {
    String nama,prodi,alamat;
    long nim;
      
 
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        
        tugas2_modul1 mahasiswa=new tugas2_modul1();
        System.out.println("Masukan Nama :");
        mahasiswa.nama= input.nextLine();
        System.out.println("Masukan Prodi :");
        mahasiswa.prodi= input.nextLine();
        System.out.println("Masukan Alamat :");
        mahasiswa.alamat= input.nextLine();
        System.out.println("Masukan Nim :");
        mahasiswa.nim= input.nextLong();
        
        System.out.println("========'DATA MAHASISWA'========");
        System.out.println("Nama :" +mahasiswa.nama);
        System.out.println("Prodi :" +mahasiswa.prodi);
        System.out.println("Alamat :" +mahasiswa.alamat);
        System.out.println("Nim :" +mahasiswa.nim);  
    }  
}

