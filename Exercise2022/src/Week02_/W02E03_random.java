/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week02_;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W02E03_random {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        int num1, num2;
        
        System.out.print("Enter two number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int total = num1 + num2;
        System.out.println("Total of the number : " + (num1+num2));
        System.out.println("Total number: " + total);
        int randNum1, randNum2;
        
        randNum1 = rand.nextInt(100);
        randNum2 = rand.nextInt(26);
        System.out.println("Total of the number (" + randNum1 + ") and (" + randNum2 + ") : " + (randNum1+randNum2));
        
    }
    
}
