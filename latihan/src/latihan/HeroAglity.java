/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author User
 */
public class HeroAglity extends Latihan {
    String type ="Abilitiy";

    HeroAglity(String nama) {
        super(nama);
    }
    
    
    void display () {
        super.display();
        System.out.println("Type:" + this.type);
    }
}
