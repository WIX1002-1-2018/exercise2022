/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class SuperClass {
    
    private String name;
    private int age;
    public int ageTwo;

    public SuperClass() {
        System.out.println("Constructor SuperClass");
    }

    public SuperClass(String name) {
        System.out.println("Constructor SuperClass with Name");
        this.name = name;
    }

    public SuperClass(String name, int age) {
        System.out.println("Constructor SuperClass with Name and Age");
        this.name = name;
        this.age = age;
    }

    public SuperClass(String name, int age, int ageTwo) {
        this.name = name;
        this.age = age;
        this.ageTwo = ageTwo;
    }
    
    public void enterName(){
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name=input.nextLine();
        System.out.print("Enter your age: ");
        this.age = input.nextInt();
    }
    
    public void printName(){
        System.out.println("Name :" + this.name);
    }
    
    public void printAge(){
        System.out.println("Age (From Class) :" + this.age);
    }

    public int getAge() {
        return age;
    }
    
    public int inputAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void printNewAge(){
        System.out.println("New Age (From Class) :" + this.ageTwo);
    }
    
    public void printNewAge(int ageTwo){
        this.ageTwo = ageTwo;
        System.out.println("New Age (From Class) (Overloading) :" + this.ageTwo);
     }
    
    @Override
    public String toString(){
        return "Full Name : " + this.name + " Age: " + this.age ;
    }
}
