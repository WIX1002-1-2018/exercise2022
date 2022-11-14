/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week04;

import java.util.Scanner;

/**
 *
 * @author askba
 */
public class W04E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.print("Enter a number (-ve number to stop) :");
            number = input.nextInt();
            
            if(number > 0)
                sum += number;
        }while(number > 0);
               
        System.out.println("The total number is " + sum);
    }
    
}
