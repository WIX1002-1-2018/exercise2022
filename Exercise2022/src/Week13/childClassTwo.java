/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class childClassTwo extends originalMainClass{
    
    public childClassTwo() {
        System.out.println("Constructor from the childClassTwo");
    }
    
    @Override
    public void printValue(){
        System.out.println("printValue() From child childClassTwo.");
        System.out.println("this is integer one:" + super.getIntegerOne());
        System.out.println("this is integer two:" + this.integerTwo);   
    }

    
}
