/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class testChildClassOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        childClassOne obj1 = new childClassOne();
        childClassOne obj2 = new childClassOne(111,222);
        obj2.printValue();
        
        childClassTwo obj3 = new childClassTwo();
        obj3.printValue();
       
    }
    
}
