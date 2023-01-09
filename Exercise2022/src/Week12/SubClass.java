/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author pensyarah
 */
public class SubClass extends SuperClass {
    
    private int salary;

    public SubClass(int salary, String name) {
        super(name);
        this.salary = salary;
    }

    public SubClass(int salary, String name, int age) {
        super(name, age);
        this.salary = salary;
    }
 
    public SubClass() {
     
        
    }
    
    @Override
    public String toString(){
        return super.toString() + " With Salary " + this.salary + " New Age :" + super.ageTwo;
    }
    
    @Override
     public void printAge(){
        super.printAge();
        System.out.println("Age (From the SubClass) :" + super.getAge()) ;
    }
    
    
}
