/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week12;

/**
 *
 * @author pensyarah
 */
public class W12E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SuperClass classOne =  new SuperClass();
        classOne.enterName();
        classOne.printName();
        classOne.printAge();
        classOne.ageTwo = 20;
        //System.out.println("The new age : " + classOne.ageTwo);
        classOne.printNewAge();
        
        SuperClass classTwo =  new SuperClass("Badrul Anuar");
        classTwo.setAge(22);
        classTwo.printName();
        //classTwo.printAge();
        System.out.println("Age (Main Class) :" + classTwo.getAge());
        classTwo.printNewAge(65);
        
        SuperClass classThree =  new SuperClass("Ahmed", 28);
        classThree.printName();
        classThree.printAge();
        System.out.println("Print Again :" + classThree.inputAge());
        System.out.println(classThree.toString());
        
        
    }
    
}
