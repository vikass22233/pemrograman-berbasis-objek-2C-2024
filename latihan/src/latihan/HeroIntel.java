/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author User
 */
public class HeroIntel extends Latihan {
    String type = "sopan";
    
    HeroIntel(String nama) {
        super(nama);
    }
    
    void display() {
        super.display();
        System.out.println("Type:" + this.type);
    }
    
    void showoff() {
        System.out.println("I'AM SOFAN");
    }
   
}
