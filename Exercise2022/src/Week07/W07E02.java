/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week07;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W07E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand =  new Random();
        int value = 0;
        
        System.out.print("Enter how many value :");
        value = input.nextInt();
        
        int[] randomNumber = new int[value];
        
        for(int i=0;i<randomNumber.length;i++)
            System.out.println("position index ["+ i + "] = " + randomNumber[i]);
    
        randomNumber[value-1] = 10;   
        
        for(int i=0;i<randomNumber.length;i++)
            System.out.println("position index ["+ i + "] = " + randomNumber[i]);
    
        for(int i=0;i<randomNumber.length;i++)
            randomNumber[i] = rand.nextInt(100);   
        
        for(int i=0;i<randomNumber.length;i++)
            System.out.println("position index ["+ i + "] = " + randomNumber[i]);

         
        
    }   
    
    
}
