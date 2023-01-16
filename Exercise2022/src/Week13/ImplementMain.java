/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

import static Week13.EmployeeInterface.MAX;

/**
 *
 * @author Badrul
 */
public class ImplementMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ImplementInterface a = new ImplementInterface();
        /*ImplementInterface.MAX;*/
       // System.out.println(MAX);
        System.out.println(a.returnPay());
        System.out.println(a.getValueA());
        
        a.setValueA(2000);
        
        ImplementInterface b =a;
        System.out.println(b.getValueA());
        
    }
    
}
