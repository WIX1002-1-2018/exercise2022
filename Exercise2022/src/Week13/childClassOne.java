/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class childClassOne extends originalMainClass {

    public childClassOne() {
        System.out.println("Constructor from the childClassOne");
    }

    public childClassOne(int integerOne) {
        super(integerOne);
    }

    public childClassOne(int integerOne, int integerTwo) {
        super(integerOne, integerTwo);
        System.out.println("Constructor Called in the childClassOne (Two Para)");
    }
    
    @Override
    public void printValue(){
        System.out.println("printValue() From child childClassOne.");
        System.out.println("this is integer one:" + super.getIntegerOne());
        System.out.println("this is integer two:" + this.integerTwo);   
    }
    
    
    
}
