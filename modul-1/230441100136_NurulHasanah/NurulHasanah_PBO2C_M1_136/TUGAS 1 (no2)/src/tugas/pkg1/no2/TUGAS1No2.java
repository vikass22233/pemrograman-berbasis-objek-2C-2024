/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg1.no2;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class TUGAS1No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String nama;
        int nim;
        String prodi;
        String alamat;
       
        
        System.out.print("Masukkan Nama \t: ");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM \t: ");
        nim = input.nextInt();
        input.nextLine();
        
        System.out.print("Masukkan Prodi \t: ");
        prodi = input.nextLine();

        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();

        System.out.println("====================");
        System.out.println("Nama \t:" + nama);
        System.out.println("NIM \t:" + nim);
        System.out.println("Prodi \t:" + prodi);
        System.out.println("Alamat \t:" + alamat);
        
    }
    
}
