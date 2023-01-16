/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class testPolyOriginalClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        originalMainClass obj1 = new originalMainClass();
        childClassOne obj2 = new childClassOne();
        childClassTwo obj3 = new childClassTwo();
        
        System.out.println("childClassOne");
        originalMainClass obj4 = new childClassOne();
        obj4.printValue();
        
        System.out.println("childClassTWo");
        originalMainClass obj5 = new childClassTwo();
        obj5.printValue();
        
    }
    
}
