/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nonpolygonhierarchyy;

/**
 *
 * @author User
 */
class NonPolygon {
    double diameter;
    double secDiameter;
    
    void NonPolygon() {
        this.diameter = 10;
        this.secDiameter = 20;
        
    }

    double area() {
        return 0;
    }
        

    double perimeter() {
        return (3*(Math.pow(diameter - secDiameter, 2)/(Math.pow(diameter - secDiameter, 2)(Math.sqrt(-3(Math.pow(diameter - secDiameter, 2)/Math.pow(diameter+secDiameter,2))+4+10))))+1) * Math.PI(diameter + secDiameter);
   }
    }
}
    
//      void NonPolygon() {
//        this.diameter = 10;
//        
//    }
//}
