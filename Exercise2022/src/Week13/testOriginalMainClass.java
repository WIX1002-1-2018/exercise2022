/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week13;

/**
 *
 * @author pensyarah
 */
public class testOriginalMainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        originalMainClass obj1 = new originalMainClass();
        
        obj1.integerTwo = 100;
        obj1.setIntegerOne(200);
        
        System.out.println("this is integer one:" + obj1.getIntegerOne());
        System.out.println("this is integer two:" + obj1.integerTwo);
        
        originalMainClass obj2 = new originalMainClass(20);
        obj2.printValue();
        
        originalMainClass obj3 = new originalMainClass(10,20);
        obj3.printValue();
        obj3.printValue(3000);
        
        originalMainClass obj4 =obj3;
        obj4.printValue();
        
        originalMainClass obj5 =obj4;
        obj5.printValue();
        
        print(obj5);
        
    }
    
    public static void print(Object a){
        
       
        
    }
    
}
