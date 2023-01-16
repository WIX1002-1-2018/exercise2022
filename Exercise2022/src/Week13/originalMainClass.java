/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class originalMainClass {
    
    private int integerOne;
    public int integerTwo;

    public originalMainClass() {
        System.out.println("Constructor Called in the originalMainClass");
    }

    public originalMainClass(int integerOne) {
        this.integerOne = integerOne;
        System.out.println("Constructor Called in the originalMainClass (One Para)");
    }

    public originalMainClass(int integerOne, int integerTwo) {
        this.integerOne = integerOne;
        this.integerTwo = integerTwo;
        System.out.println("Constructor Called in the originalMainClass (Two Para)");
    }
    
    public int getIntegerOne() {
        return integerOne;
    }

    public void setIntegerOne(int integerOne) {
        this.integerOne = integerOne;
    }
    
    public void printValue(){
        System.out.println("printValue() From original parent class.");
        System.out.println("this is integer one:" + this.integerOne);
        System.out.println("this is integer two:" + this.integerTwo);        
    }
    
    public void printValue(int integerOne){
        
        System.out.println("This method will be called (Overload) !!!!");
        System.out.println("this is integer one:" + integerOne);
        System.out.println("this is integer two:" + this.integerTwo);        
    }
    
    public void printValueOne(){
        System.out.println("printValueOne() From original parent class.");
    }
    
    
    
}
