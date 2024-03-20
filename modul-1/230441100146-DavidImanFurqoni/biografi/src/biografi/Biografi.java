/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biografi;

class bio{
    String nama;
    String alamat;
    String sekolah;
    String hobi;
}
public class Biografi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bio saya = new bio();
        saya.nama = "David Iman Furqoni";
        saya.alamat = "Pamekasan";
        saya.sekolah = "SMAN 2";
        saya.hobi = "renang"; 
        System.out.println("halo nama saya "+saya.nama + "saya dari "+saya.alamat + "saya berasal dari sekolah "+saya.sekolah + "hobi saya adalah "+saya.hobi);
        
    }
    
}
