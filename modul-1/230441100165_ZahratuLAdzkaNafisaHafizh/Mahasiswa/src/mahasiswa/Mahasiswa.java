/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;

import java.util.Scanner;

/**
 *
 * @author SMK_BIM
 */
public class Mahasiswa {
public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nama,nim,prodi,alamat;

        System.out.print("Masukkan Nama = ");
        nama= sc.nextLine(); 
        System.out.print("Masukkan Nim = ");
        nim= sc.nextLine();
        System.out.print("Masukkan Prodi = ");
        prodi= sc.nextLine(); 
        System.out.print("Masukkan Alamat= ");
        alamat= sc.nextLine(); 


        System.out.println("Nama Anda= " + nama);
        System.out.println("NIM Anda= " + nim);
        System.out.println("Prodi Anda= " + prodi);
        System.out.println("Alamat Anda= " + alamat);
     }
}
    
