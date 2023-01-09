/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author pensyarah
 */
public class W12E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SubClass objectSub =  new SubClass();
        // objectSub.enterName();
       // System.out.println(objectSub.toString());
        
       // SubClass objectTwo = new SubClass(2000, "Irfan");
       // System.out.println(objectTwo.toString());
        
        SubClass objectThree =  new SubClass (2001,"Irfan Two",25);
        System.out.println(objectThree.toString());
        objectThree.setAge(100);
        System.out.println(objectThree.toString());
        objectThree.printNewAge(222);
        System.out.println(objectThree.toString());
        objectThree.printAge();
        
        classTwo obj = new classTwo();
        obj.toString();
        
        SuperClass objectF = new SubClass();
        
    }
    
}
