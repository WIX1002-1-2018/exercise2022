/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W03E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random input = new Random();
        
        int num01, num02, num03;
      //  System.out.print("Enter two numbers : ");
        num01 = input.nextInt(21)+50;
        num02 = input.nextInt(101)+ 100;
        
        System.out.println("The first number : " + num01);
        System.out.println("The second number : " + num02);
        
        num03 = num01 + num02;
        
        System.out.println(num01 + " + " + num02 + " = " + num03);
        
    }
    
}
